package mf.portfolio.analyzer.mfportfolioanalyzerservice.service.impl;

import mf.portfolio.analyzer.mfportfolioanalyzerservice.repository.DataStore;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.service.FuzzyMatchingService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.similarity.JaroWinklerDistance;
import org.apache.commons.text.similarity.LevenshteinDistance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

@Service
public class FuzzyMatchingServiceImpl implements FuzzyMatchingService {
    @Autowired
    DataStore dataStore;
    public String getFuzzyMutualFundAMC(String amc) {
        JaroWinklerDistance jaroWinklerDistance = new JaroWinklerDistance();
        List<String> mutualFundAMCList = dataStore.getMutualFundAMCList();
        double similarity = 0;
        String similarAmc = null;
        for (String mutualFundAMC: mutualFundAMCList) {
            double ld = jaroWinklerDistance.apply(mutualFundAMC.toLowerCase(), amc.toLowerCase());
            if(ld >= similarity) {
                similarity = ld;
                similarAmc = mutualFundAMC;
            }
        }

        return similarAmc;
    }
}
