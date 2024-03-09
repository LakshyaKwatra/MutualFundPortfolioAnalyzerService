package mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Builder
public class MutualFundStockAllocationResponseUnitDto {

    @JsonProperty("title")
    String name;

    @JsonProperty("latest")
    Double percentageAllocation;

}
