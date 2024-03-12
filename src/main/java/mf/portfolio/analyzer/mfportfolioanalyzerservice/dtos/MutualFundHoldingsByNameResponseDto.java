package mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Getter;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.tickertape.MutualFundHoldingDto;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Builder
public class MutualFundHoldingsByNameResponseDto {

    String name;

    List<MutualFundHoldingDto> mutualFundHoldings;
}
