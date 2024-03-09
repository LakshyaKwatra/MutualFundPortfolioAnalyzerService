package mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class SectorHoldingDto {

    String sector;

    @JsonProperty("value")
    String percentage;
}
