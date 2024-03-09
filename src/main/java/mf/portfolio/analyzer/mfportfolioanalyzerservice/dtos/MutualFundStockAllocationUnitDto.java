package mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class MutualFundStockAllocationUnitDto {

    @JsonProperty("sid")
    String stockId;

    @JsonProperty("title")
    String name;

    @JsonProperty("latest")
    Double percentageAllocation;

    String ticker;
}
