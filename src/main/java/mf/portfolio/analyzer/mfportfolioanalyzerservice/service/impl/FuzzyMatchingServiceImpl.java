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

    @Override
    public String getFuzzyMutualFundAMC(String amc) {
        JaroWinklerDistance jaroWinklerDistance = new JaroWinklerDistance();
        List<String> mutualFundAMCList = DataStore.getMutualFundAMCList();
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

    @Override
    public String getFuzzyMutualFund(String mutualFundName) {
        JaroWinklerDistance jaroWinklerDistance = new JaroWinklerDistance();
        List<String> mutualFundList = DataStore.getMutualFundAMCList();
        double similarity = 0;
        String similarMutualFund = null;
        for (String mutualFund: mutualFundList) {
            double ld = jaroWinklerDistance.apply(mutualFund.toLowerCase(), mutualFundName.toLowerCase());
            if(ld >= similarity) {
                similarity = ld;
                similarMutualFund = mutualFund;
            }
        }

        return similarMutualFund;
    }
}
