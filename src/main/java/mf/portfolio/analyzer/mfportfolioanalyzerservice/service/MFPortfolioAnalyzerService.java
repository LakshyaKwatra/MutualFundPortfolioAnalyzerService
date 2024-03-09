package mf.portfolio.analyzer.mfportfolioanalyzerservice.service;

import mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos.*;

import java.util.List;
import java.util.Map;

public interface MFPortfolioAnalyzerService {

    List<MutualFundSchemeDto> getAllMutualFundSchemes();

    List<MutualFundHistoricalDataUnitDto> getMutualFundHistoricalDataBySchemeCode(String schemeCode);

    MutualFundMetaDataDto getMutualFundDetailBySchemeCode(String schemeCode);

    List<String> getAllMutualFundSchemeCategories();

    List<String> getMutualFundListByAmc(String amc);

    Map<String,String> getAllMutualFundIds();

    String getMutualFundIdByName(String mutualFundName);

    MutualFundStockAllocationResponseDto getMutualFundStockAllocationByName(String mutualFundName);

}
