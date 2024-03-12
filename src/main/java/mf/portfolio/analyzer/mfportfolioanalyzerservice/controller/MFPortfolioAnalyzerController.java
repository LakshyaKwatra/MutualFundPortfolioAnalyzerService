package mf.portfolio.analyzer.mfportfolioanalyzerservice.controller;

import lombok.NonNull;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.mfapi.MutualFundHistoricalDataUnitDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.mfapi.MutualFundMetaDataDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.mfapi.MutualFundSchemeDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos.MutualFundHoldingsByNameResponseDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos.*;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.service.MFPortfolioAnalyzerService;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.service.MFScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
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

    @GetMapping("/getMutualFundAMCList")
    public List<String> getMutualFundAMCList() throws IOException {
        return mfScraperService.getMutualFundAMCList();
    }

    @GetMapping("/getMutualFundListByAMC")
    public List<String> getMutualFundListByAMC(@NonNull @RequestParam("amc") String amc,
                                               @Nullable @RequestParam("isFuzzy") Boolean isFuzzy) {
        return mfPortfolioAnalyzerService.getMutualFundListByAmc(amc, isFuzzy);
    }

    @GetMapping("/getAllMutualFundIds")
    public Map<String,String> getAllMutualFundIds(){
        return mfPortfolioAnalyzerService.getAllMutualFundIds();
    }

    @GetMapping("/getMutualFundIdResponseByName")
    public MutualFundIdResponseDto getMutualFundIdResponseByName(@NonNull @RequestParam("mutualFundName") String mutualFundName,
                                                                 @Nullable @RequestParam("isFuzzy") Boolean isFuzzy) {
        return mfPortfolioAnalyzerService.getMutualFundIdResponseByName(mutualFundName, isFuzzy);
    }

    @GetMapping("/getMutualFundStockAllocationByName")
    public MutualFundHoldingsByNameResponseDto getMutualFundStockAllocationByName(@NonNull @RequestParam("mutualFundName") String mutualFundName,
                                                                                  @Nullable @RequestParam("isFuzzy") Boolean isFuzzy) {
        return mfPortfolioAnalyzerService.getMutualFundStockAllocationByName(mutualFundName, isFuzzy);
    }

    @GetMapping("/getAggregateStockAllocation")
    public AggregateStockAllocationResponseDto getAggregateStockAllocation(@NonNull @RequestBody AggregateStockAllocationRequestDto aggregateStockAllocationRequestDto) {
        return mfPortfolioAnalyzerService.getAggregateStockAllocation(aggregateStockAllocationRequestDto);
    }

}
