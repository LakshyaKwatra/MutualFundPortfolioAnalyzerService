package mf.portfolio.analyzer.mfportfolioanalyzerservice.service.impl;

import lombok.extern.slf4j.Slf4j;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.MfApiClient;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.TickerTapeClient;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.mfapi.MutualFundHistoricalDataResponseDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.mfapi.MutualFundHistoricalDataUnitDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.mfapi.MutualFundMetaDataDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.mfapi.MutualFundSchemeDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.tickertape.*;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.tickertape.MutualFundHoldingsByIdResponseDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos.*;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.service.FuzzyMatchingService;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.service.MFPortfolioAnalyzerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Slf4j
@Service
public class MFPortfolioAnalyzerServiceImpl implements MFPortfolioAnalyzerService {

    private final RestTemplate restTemplate;
    private final FuzzyMatchingService fuzzyMatchingService;
    private final MfApiClient mfApiClient;
    private final TickerTapeClient tickerTapeClient;


    @Autowired
    MFPortfolioAnalyzerServiceImpl(RestTemplate restTemplate,
                                   FuzzyMatchingService fuzzyMatchingService,
                                   MfApiClient mfApiClient,
                                   TickerTapeClient tickerTapeClient) {
        this.restTemplate = restTemplate;
        this.fuzzyMatchingService = fuzzyMatchingService;
        this.mfApiClient = mfApiClient;
        this.tickerTapeClient = tickerTapeClient;
    }

    @Override
    public List<MutualFundSchemeDto> getAllMutualFundSchemes() {
        return mfApiClient.getMutualFundSchemeList();
    }

    @Override
    public List<MutualFundHistoricalDataUnitDto> getMutualFundHistoricalDataBySchemeCode(String schemeCode) {
        MutualFundHistoricalDataResponseDto mutualFundHistoricalDataResponseDto =
                mfApiClient.getMutualFundHistoricalDataBySchemeCode(schemeCode);
        if(Objects.nonNull(mutualFundHistoricalDataResponseDto)) {
            return mutualFundHistoricalDataResponseDto.getHistoricalData();
        } else {
            return null;
        }
    }

    @Override
    public MutualFundMetaDataDto getMutualFundDetailBySchemeCode(String schemeCode) {
        MutualFundHistoricalDataResponseDto mutualFundHistoricalDataResponseDto =
                mfApiClient.getMutualFundHistoricalDataBySchemeCode(schemeCode);
        if(Objects.nonNull(mutualFundHistoricalDataResponseDto)) {
            return mutualFundHistoricalDataResponseDto.getMetaData();
        } else {
            return null;
        }
    }

    @Override
    public List<String> getMutualFundListByAmc(String amc, Boolean isFuzzy) {
        if(isFuzzy) {
            amc = fuzzyMatchingService.getFuzzyMutualFundAMC(amc);
        }
        MutualFundQueryApiRequestDto requestDto = MutualFundQueryApiRequestDto.builder()
                .match(MatchDto.builder()
                        .amcList(Collections.singletonList(amc))
                        .build())
                .sortBy("amc")
                .sortOrder(-1)
                .project(Collections.singletonList("amc"))
                .offset(0)
                .count(10000).build();
        MutualFundQueryResponseDto mutualFundQueryApiResponse = tickerTapeClient.queryMutualFundScreener(requestDto);

        if(Objects.nonNull(mutualFundQueryApiResponse)) {
            return mutualFundQueryApiResponse
                    .getData()
                    .getResult()
                    .stream()
                    .map(MutualFundQueryApiResultUnitDto::getName)
                    .toList();
        } else {
            return null;
        }
    }

    @Override
    public Map<String, String> getAllMutualFundIds() {
        MutualFundQueryApiRequestDto requestDto = MutualFundQueryApiRequestDto.builder()
                .match(MatchDto.builder().build())
                .sortBy("amc")
                .sortOrder(-1)
                .project(Collections.singletonList("amc"))
                .offset(0)
                .count(10000).build();
        MutualFundQueryResponseDto mutualFundQueryApiResponse = tickerTapeClient.queryMutualFundScreener(requestDto);
        Map<String, String> result = new HashMap<>();
        Objects.requireNonNull(mutualFundQueryApiResponse)
                .getData().getResult()
                .forEach(resultUnit -> result.put(resultUnit.getName(), resultUnit.getMfId()));
        return result;
    }

    @Override
    public MutualFundIdResponseDto getMutualFundIdResponseByName(String mutualFundName, Boolean isFuzzy) {
        if(isFuzzy) {
            mutualFundName = fuzzyMatchingService.getFuzzyMutualFund(mutualFundName);
        }
        Map<String, String> mutualFundIdMap = getAllMutualFundIds();
        if(Objects.nonNull(mutualFundIdMap)) {
            return MutualFundIdResponseDto
                    .builder()
                    .name(mutualFundName)
                    .mfId(getAllMutualFundIds().get(mutualFundName))
                    .build();
        } else {
            return null;
        }
    }

    @Override
    public MutualFundHoldingsByNameResponseDto getMutualFundStockAllocationByName(String mutualFundName, Boolean isFuzzy) {
        if(isFuzzy) {
            mutualFundName = fuzzyMatchingService.getFuzzyMutualFund(mutualFundName);
        }
        String mutualFundId = getAllMutualFundIds().get(mutualFundName);

        MutualFundHoldingsByIdResponseDto mutualFundHoldingsByIdResponse = tickerTapeClient.getMutualFundHoldingDetailsById(mutualFundId);

        if(Objects.nonNull(mutualFundHoldingsByIdResponse)) {
            List<MutualFundHoldingDto> mutualFundStockAllocation = mutualFundHoldingsByIdResponse
                    .getData()
                    .getCurrentAllocation()
                    .stream()
                    .filter(unit -> {
                        assert unit.getRating() != null;
                        return unit.getRating().equalsIgnoreCase("equity");
                    })
                    .toList();
            return MutualFundHoldingsByNameResponseDto.builder()
                    .name(mutualFundName)
                    .mutualFundHoldings(mutualFundStockAllocation)
                    .build();
        } else {
            return null;
        }
    }

    @Override
    public AggregateStockAllocationResponseDto getAggregateStockAllocation(AggregateStockAllocationRequestDto aggregateStockAllocationRequestDto) {
        List<String> mutualFunds = new ArrayList<>();

        List<MutualFundStockAllocationResponseUnitDto> mutualFundStockAllocation =  calculateWeightedStockAllocation(aggregateStockAllocationRequestDto, mutualFunds);

        Collections.sort(mutualFundStockAllocation, Comparator.comparing(MutualFundStockAllocationResponseUnitDto::getPercentageAllocation).reversed());

        List<Integer> numberOfStocksInQuarterlyPercentageDivision = calculateNumberOfStocksInQuarterlyPercentageDivision(mutualFundStockAllocation);

        return AggregateStockAllocationResponseDto.builder()
                .mutualFunds(mutualFunds)
                .numberOfStocks(mutualFundStockAllocation.size())
                .numberOfStocksInQuarterlyPercentageDivision(numberOfStocksInQuarterlyPercentageDivision)
                .mutualFundStockAllocation(mutualFundStockAllocation)
                .build();

    }

    private List<MutualFundStockAllocationResponseUnitDto> calculateWeightedStockAllocation
            (AggregateStockAllocationRequestDto aggregateStockAllocationRequestDto, List<String> mutualFunds) {
        List<String> mutualFundNames = aggregateStockAllocationRequestDto.getMutualFunds();
        List<Double> weightageList = aggregateStockAllocationRequestDto.getWeightageList();
        Map<String, Double> aggregateStockAllocationMap = new HashMap<>();
        boolean isWeighted = Objects.nonNull(weightageList) && weightageList.size() == mutualFundNames.size();

        Double weightage = 1.0;
        Double weightageSum = 0.0;
        for (String mutualFundName:mutualFundNames) {
            if (isWeighted) {
                weightage = weightageList.get(mutualFunds.size());
            }
            MutualFundHoldingsByNameResponseDto mutualFundStockAllocationResponseDto = getMutualFundStockAllocationByName(mutualFundName, null);
            mutualFunds.add(mutualFundStockAllocationResponseDto.getName());
            List<MutualFundHoldingDto> mutualFundStockAllocation = mutualFundStockAllocationResponseDto.getMutualFundHoldings();
            for (MutualFundHoldingDto mutualFundStockAllocationUnit : mutualFundStockAllocation) {
                aggregateStockAllocationMap.put(mutualFundStockAllocationUnit.getName(),
                        aggregateStockAllocationMap.getOrDefault(mutualFundStockAllocationUnit.getName(), 0.0) + (weightage * mutualFundStockAllocationUnit.getPercentageAllocation()));
            }
            weightageSum += weightage;
        }

        if(!mutualFunds.isEmpty()) {
            double finalWeightageSum = weightageSum;
            aggregateStockAllocationMap.forEach((k, v) -> aggregateStockAllocationMap.put(k, v / finalWeightageSum));
        }

        List<MutualFundStockAllocationResponseUnitDto> mutualFundStockAllocation = new ArrayList<>();

        aggregateStockAllocationMap.forEach((k,v)->mutualFundStockAllocation.add(MutualFundStockAllocationResponseUnitDto
                .builder().name(k).percentageAllocation(v).build()));

        return mutualFundStockAllocation;
    }

    private static List<Integer> calculateNumberOfStocksInQuarterlyPercentageDivision(List<MutualFundStockAllocationResponseUnitDto> mutualFundStockAllocation) {
        List<Integer> numberOfStocksInQuarterlyPercentageDivision = new ArrayList<>();
        Double percentage = 0.0;
        int count = 0;
        for (MutualFundStockAllocationResponseUnitDto mutualFundStockAllocationResponseUnitDto: mutualFundStockAllocation) {
            percentage += mutualFundStockAllocationResponseUnitDto.getPercentageAllocation();
            count++;
            if (percentage >= 25.0) {
               numberOfStocksInQuarterlyPercentageDivision.add(count);
               percentage = 0.0;
               count = 0;
            }
        }
        if(percentage > 0.0) {
            numberOfStocksInQuarterlyPercentageDivision.add(count);
        }
        return numberOfStocksInQuarterlyPercentageDivision;
    }
}
