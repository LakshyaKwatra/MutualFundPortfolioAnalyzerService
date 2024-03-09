package mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class AggregateStockAllocationRequestDto {
    List<String> mutualFunds;
}
