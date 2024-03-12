package mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.tickertape;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import org.springframework.lang.Nullable;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class FiltersDto {

    @JsonProperty("Scheme Info")
    List<FilterDto> schemeInfoFilters;

    @JsonProperty("Returns")
    List<FilterDto> returnsFilters;

    @JsonProperty("Ratios")
    List<FilterDto> ratiosFilters;

    @JsonProperty("Portfolio Composition")
    List<FilterDto> portfolioCompositionFilters;

    @JsonProperty("Risk")
    List<FilterDto> riskFilters;

}
