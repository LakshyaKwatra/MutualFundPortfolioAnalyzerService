package mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.tickertape;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Getter;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos.MatchDto;
import org.springframework.lang.Nullable;

import java.util.List;

@Getter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class MutualFundQueryApiRequestDto {
    MatchDto match;
    String sortBy;
    Integer sortOrder;
    List<String> project;
    Integer offset;
    Integer count;
    List<String> mfIds;
}
