package mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.tickertape;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos.SectorWeightageUnitDto;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class MutualFundHoldingsDataDto {

    List<AssetAllocationHistoryUnitDto> assetAllocationHistory;

    List<MutualFundHoldingDto> currentAllocation;

    List<SectorDistributionUnitDto> sectorDistribution;

    List<SectorWeightageUnitDto> sectorWeightage;
}
