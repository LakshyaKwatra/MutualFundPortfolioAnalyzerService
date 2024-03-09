package mf.portfolio.analyzer.mfportfolioanalyzerservice.controller;

import lombok.NonNull;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos.*;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.service.MFPortfolioAnalyzerService;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.service.MFScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;

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

    @GetMapping("/getAllMutualFundIds")
    public Map<String,String> getAllMutualFundIds(){
        return mfPortfolioAnalyzerService.getAllMutualFundIds();
    }

    @GetMapping("/getMutualFundIdByName")
    public String getMutualFundIdByName(@NonNull @RequestParam("mutualFundName") String mutualFundName) {
        return mfPortfolioAnalyzerService.getMutualFundIdByName(mutualFundName);
    }

    @GetMapping("/getMutualFundStockAllocationByName")
    public MutualFundStockAllocationResponseDto getMutualFundStockAllocationByName(@NonNull @RequestParam("mutualFundName") String mutualFundName) {
        return mfPortfolioAnalyzerService.getMutualFundStockAllocationByName(mutualFundName);
    }

    @GetMapping("/getAggregateStockAllocation")
    public AggregateStockAllocationResponseDto getAggregateStockAllocation(@NonNull @RequestBody AggregateStockAllocationRequestDto aggregateStockAllocationRequestDto) {
        return mfPortfolioAnalyzerService.getAggregateStockAllocation(aggregateStockAllocationRequestDto);
    }

}
