package mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.tickertape;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class MutualFundQueryApiDataDto {

    List<MutualFundQueryApiResultUnitDto> result;
    Integer count;
}
