package mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.tickertape.SectorHoldingWeightageDto;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SectorWeightageUnitDto {

    String sector;

    List<SectorHoldingWeightageDto> holdings;
}
