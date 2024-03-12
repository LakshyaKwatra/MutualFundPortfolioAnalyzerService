package mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Getter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Builder
public class MutualFundIdResponseDto {
    String name;
    String mfId;
}
