package mf.portfolio.analyzer.mfportfolioanalyzerservice.service.impl;

import lombok.extern.slf4j.Slf4j;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.TickerTapeClient;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.tickertape.FilterDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.tickertape.FilterElementDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.repository.DataStore;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.service.DataStoreUpdaterService;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.service.MFPortfolioAnalyzerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DataStoreUpdaterServiceImpl implements DataStoreUpdaterService {

    @Autowired
    private MFPortfolioAnalyzerService mfPortfolioAnalyzerService;

    @Autowired
    private TickerTapeClient tickerTapeClient;

    public void updateMutualFundAmcData() {
        List<FilterDto> mutualFundAMCFilterDto = tickerTapeClient
                .getAllMutualFundFilters()
                .getData()
                .getFilters()
                .getSchemeInfoFilters()
                .stream()
                .filter(schemeInfoFilter -> schemeInfoFilter.getFilterName().equalsIgnoreCase("amc")).toList();

        if(!mutualFundAMCFilterDto.isEmpty()) {
            List<String> mutualFundAMCList = mutualFundAMCFilterDto.get(0).getUi().get(0).getFilterElements().stream().map(FilterElementDto::getName).toList();
            DataStore.setMutualFundAMCList(mutualFundAMCList);
        }
    }

    @Override
    public void updateMutualFundData() {
    }
}
