package mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Builder
public class MutualFundStockAllocationResponseDto {

    String name;

    List<MutualFundStockAllocationUnitDto> mutualFundStockAllocation;
}
