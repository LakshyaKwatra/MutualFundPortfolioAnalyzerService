package mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.tickertape;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class FilterDto {
    String label;
    String def;

    @JsonProperty("short")
    String filterName;

    @JsonProperty("ui")
    List<FilterUIDto> ui;

}
