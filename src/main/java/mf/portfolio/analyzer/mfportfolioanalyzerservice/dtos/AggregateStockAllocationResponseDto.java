package mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos;

import lombok.Builder;
import lombok.Getter;

import java.util.List;
import java.util.Map;

@Builder
@Getter
public class AggregateStockAllocationResponseDto {

    List<String> mutualFunds;

    List<MutualFundStockAllocationResponseUnitDto> mutualFundStockAllocation;
}
