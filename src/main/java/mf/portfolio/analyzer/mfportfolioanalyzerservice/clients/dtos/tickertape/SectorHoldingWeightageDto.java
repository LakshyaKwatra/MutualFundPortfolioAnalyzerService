package mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.tickertape;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class SectorHoldingWeightageDto {

    @JsonProperty("date")
    String timestamp;

    @JsonProperty("value")
    String percentage;
}
