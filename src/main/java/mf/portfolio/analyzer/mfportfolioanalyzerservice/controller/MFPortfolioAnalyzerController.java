package mf.portfolio.analyzer.mfportfolioanalyzerservice.controller;

import lombok.NonNull;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos.MutualFundHistoricalDataUnitDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos.MutualFundMetaDataDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos.MutualFundSchemeDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.service.MFPortfolioAnalyzerService;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.service.MFScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class MFPortfolioAnalyzerController {

    @Autowired
    private MFPortfolioAnalyzerService mfPortfolioAnalyzerService;

    @Autowired
    private MFScraperService mfScraperService;

    @GetMapping("/getAllMutualFundSchemes")
    public List<MutualFundSchemeDto> getAllMutualFundSchemes() {
        return mfPortfolioAnalyzerService.getAllMutualFundSchemes();
    }

    @GetMapping("/getMutualFundHistoricalData/{schemeCode}")
    public List<MutualFundHistoricalDataUnitDto> getMutualFundHistoricalDataBySchemeCode(@NonNull @PathVariable String schemeCode) {
        return mfPortfolioAnalyzerService.getMutualFundHistoricalDataBySchemeCode(schemeCode);
    }

    @GetMapping("/getMutualFundDetail/{schemeCode}")
    public MutualFundMetaDataDto getMutualFundDetailBySchemeCode(@NonNull @PathVariable String schemeCode) {
        return mfPortfolioAnalyzerService.getMutualFundDetailBySchemeCode(schemeCode);
    }

    @GetMapping("/getAllMutualFundSchemeCategories")
    @Deprecated
    public List<String> getAllMutualFundSchemeCategories() {
        return mfPortfolioAnalyzerService.getAllMutualFundSchemeCategories();
    }

    @GetMapping("/getMutualFundAMCList")
    public List<String> getMutualFundAMCList() throws IOException {
        return mfScraperService.getMutualFundAMCList();
    }

    @GetMapping("/getMutualFundListByAMC")
    public List<String> getMutualFundListByAMC(@NonNull @RequestParam("amc") String amc) {
        return mfPortfolioAnalyzerService.getMutualFundListByAmc(amc);
    }

}
