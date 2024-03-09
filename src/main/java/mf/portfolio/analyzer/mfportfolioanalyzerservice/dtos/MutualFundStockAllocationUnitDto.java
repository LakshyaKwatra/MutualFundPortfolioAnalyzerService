package mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import org.springframework.lang.Nullable;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Builder
public class MutualFundStockAllocationUnitDto {

    @JsonProperty("title")
    String name;

    @JsonProperty("latest")
    Double percentageAllocation;

    @Nullable
    String rating;
}
