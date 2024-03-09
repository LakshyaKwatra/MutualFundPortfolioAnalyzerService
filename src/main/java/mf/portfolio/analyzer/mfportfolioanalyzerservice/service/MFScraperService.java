package mf.portfolio.analyzer.mfportfolioanalyzerservice.service;

import java.io.IOException;
import java.util.List;

public interface MFScraperService {
    List<String> getMutualFundAMCList() throws IOException;
}
