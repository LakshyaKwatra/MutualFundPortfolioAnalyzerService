package mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class MutualFundHoldingsDataDto {

    List<AssetAllocationHistoryUnitDto> assetAllocationHistory;

    List<MutualFundStockAllocationUnitDto> currentAllocation;

    List<SectorDistributionUnitDto> sectorDistribution;

    List<SectorWeightageUnitDto> sectorWeightage;
}
