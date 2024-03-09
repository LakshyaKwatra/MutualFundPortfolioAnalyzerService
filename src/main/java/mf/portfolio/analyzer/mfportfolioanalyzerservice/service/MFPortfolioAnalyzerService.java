package mf.portfolio.analyzer.mfportfolioanalyzerservice.service;

import mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos.MutualFundHistoricalDataUnitDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos.MutualFundMetaDataDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos.MutualFundSchemeDto;

import java.util.List;

public interface MFPortfolioAnalyzerService {

    List<MutualFundSchemeDto> getAllMutualFundSchemes();

    List<MutualFundHistoricalDataUnitDto> getMutualFundHistoricalDataBySchemeCode(String schemeCode);

    MutualFundMetaDataDto getMutualFundDetailBySchemeCode(String schemeCode);

    List<String> getAllMutualFundSchemeCategories();

    List<String> getMutualFundListByAmc(String amc);

}
