package mf.portfolio.analyzer.mfportfolioanalyzerservice.service;

import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.mfapi.MutualFundHistoricalDataUnitDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.mfapi.MutualFundMetaDataDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.mfapi.MutualFundSchemeDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos.MutualFundHoldingsByNameResponseDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos.*;

import java.util.List;
import java.util.Map;

public interface MFPortfolioAnalyzerService {

    List<MutualFundSchemeDto> getAllMutualFundSchemes();

    List<MutualFundHistoricalDataUnitDto> getMutualFundHistoricalDataBySchemeCode(String schemeCode);

    MutualFundMetaDataDto getMutualFundDetailBySchemeCode(String schemeCode);

    List<String> getMutualFundListByAmc(String amc, Boolean isFuzzy);

    Map<String,String> getAllMutualFundIds();

    MutualFundIdResponseDto getMutualFundIdResponseByName(String mutualFundName, Boolean isFuzzy);

    MutualFundHoldingsByNameResponseDto getMutualFundStockAllocationByName(String mutualFundName, Boolean isFuzzy);

    AggregateStockAllocationResponseDto getAggregateStockAllocation(AggregateStockAllocationRequestDto aggregateStockAllocationRequestDto);

}
