package mf.portfolio.analyzer.mfportfolioanalyzerservice.service.impl;

import lombok.extern.slf4j.Slf4j;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos.*;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.service.FuzzyMatchingService;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.service.MFPortfolioAnalyzerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Slf4j
@Service
public class MFPortfolioAnalyzerServiceImpl implements MFPortfolioAnalyzerService {

    private final RestTemplate restTemplate;

    private final FuzzyMatchingService fuzzyMatchingService;

    @Autowired
    MFPortfolioAnalyzerServiceImpl(RestTemplate restTemplate, FuzzyMatchingService fuzzyMatchingService) {
        this.restTemplate = restTemplate;
        this.fuzzyMatchingService = fuzzyMatchingService;
    }

    @Override
    public List<MutualFundSchemeDto> getAllMutualFundSchemes() {
        String url = "https://api.mfapi.in/mf";
        ResponseEntity<MutualFundSchemeDto[]> responseEntity = restTemplate.getForEntity(url, MutualFundSchemeDto[].class);

        if(responseEntity.getStatusCode().is2xxSuccessful() && Objects.nonNull(responseEntity.getBody())) {
            MutualFundSchemeDto[] mutualFundSchemeDtos = responseEntity.getBody();
            return Arrays.asList(mutualFundSchemeDtos);
        } else {
            return null;
        }
    }

    @Override
    public List<MutualFundHistoricalDataUnitDto> getMutualFundHistoricalDataBySchemeCode(String schemeCode) {
        String url = "https://api.mfapi.in/mf/" + schemeCode;
        ResponseEntity<MutualFundHistoricalDataResponseDto> responseEntity = restTemplate.getForEntity(url, MutualFundHistoricalDataResponseDto.class);

        if(responseEntity.getStatusCode().is2xxSuccessful() && Objects.nonNull(responseEntity.getBody())) {
            MutualFundHistoricalDataResponseDto mutualFundHistoricalDataResponseDto = responseEntity.getBody();
            return mutualFundHistoricalDataResponseDto.getHistoricalData();
        } else {
            return null;
        }
    }

    @Override
    public MutualFundMetaDataDto getMutualFundDetailBySchemeCode(String schemeCode) {
        String url = "https://api.mfapi.in/mf/" + schemeCode;
        ResponseEntity<MutualFundHistoricalDataResponseDto> responseEntity = restTemplate.getForEntity(url, MutualFundHistoricalDataResponseDto.class);

        if(responseEntity.getStatusCode().is2xxSuccessful() && Objects.nonNull(responseEntity.getBody())) {
            MutualFundHistoricalDataResponseDto mutualFundHistoricalDataResponseDto = responseEntity.getBody();
            return mutualFundHistoricalDataResponseDto.getMetaData();
        } else {
            return null;
        }
    }

    @Override
    @Deprecated
    public List<String> getAllMutualFundSchemeCategories() {
        List<MutualFundSchemeDto> mutualFundSchemeDtos = getAllMutualFundSchemes();
        Set<String> schemeCategorySet = new HashSet<>();
        for(MutualFundSchemeDto mutualFundSchemeDto: mutualFundSchemeDtos) {
            schemeCategorySet.add(getMutualFundDetailBySchemeCode(mutualFundSchemeDto.getSchemeCode()).getSchemeCategory());
            log.info(String.valueOf(schemeCategorySet.size()));
        }
        return new ArrayList<>(schemeCategorySet);
    }

    @Override
    public List<String> getMutualFundListByAmc(String amc) {
        String url = "https://api.tickertape.in/mf-screener/query";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        String mutualFundAmc = fuzzyMatchingService.getFuzzyMutualFundAMC(amc);

        MutualFundQueryApiRequestDto requestDto = MutualFundQueryApiRequestDto.builder()
                .match(MatchDto.builder()
                        .amcList(Collections.singletonList(mutualFundAmc))
                        .build())
                .sortBy("amc")
                .sortOrder(-1)
                .project(Collections.singletonList("amc"))
                .offset(0)
                .count(10000).build();
        HttpEntity<MutualFundQueryApiRequestDto> requestEntity = new HttpEntity<>(requestDto, headers);
        ResponseEntity<MutualFundQueryApiResponseDto> responseEntity = restTemplate.postForEntity(url, requestEntity, MutualFundQueryApiResponseDto.class);

        return responseEntity.getBody().getData().getResult().stream().map(MutualFundQueryApiResultUnitDto::getName).toList();
    }

    @Override
    public Map<String,String> getAllMutualFundIds() {
        String url = "https://api.tickertape.in/mf-screener/query";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        MutualFundQueryApiRequestDto requestDto = MutualFundQueryApiRequestDto.builder()
                .match(MatchDto.builder().build())
                .sortBy("amc")
                .sortOrder(-1)
                .project(Collections.singletonList("amc"))
                .offset(0)
                .count(10000).build();
        HttpEntity<MutualFundQueryApiRequestDto> requestEntity = new HttpEntity<>(requestDto, headers);
        ResponseEntity<MutualFundQueryApiResponseDto> responseEntity = restTemplate.postForEntity(url, requestEntity, MutualFundQueryApiResponseDto.class);

        Map<String,String> result = new HashMap<>();
        Objects.requireNonNull(responseEntity.getBody())
                .getData().getResult()
                .forEach(resultUnit -> result.put(resultUnit.getName(), resultUnit.getMfId()));
        return result;
    }

    @Override
    public String getMutualFundIdByName(String mutualFundName) {
        String mutualFund = fuzzyMatchingService.getFuzzyMutualFund(mutualFundName);
        return getAllMutualFundIds().get(mutualFund);

    }

    @Override
    public MutualFundStockAllocationResponseDto getMutualFundStockAllocationByName(String mutualFundName) {
        String mutualFund = fuzzyMatchingService.getFuzzyMutualFund(mutualFundName);
        String mutualFundId = getAllMutualFundIds().get(mutualFund);

        String url = "https://api.tickertape.in/mutualfunds/" + mutualFundId + "/holdings";
        ResponseEntity<MutualFundHoldingsResultDto> responseEntity = restTemplate.getForEntity(url, MutualFundHoldingsResultDto.class);

        if(responseEntity.getStatusCode().is2xxSuccessful() && Objects.nonNull(responseEntity.getBody())) {
            MutualFundHoldingsResultDto mutualFundHoldingsResultDto = responseEntity.getBody();
            List<MutualFundStockAllocationUnitDto> mutualFundStockAllocation = mutualFundHoldingsResultDto.getData().getCurrentAllocation();
            return MutualFundStockAllocationResponseDto.builder()
                    .name(mutualFund)
                    .mutualFundStockAllocation(mutualFundStockAllocation)
                    .build();
        } else {
            return null;
        }
    }
}
