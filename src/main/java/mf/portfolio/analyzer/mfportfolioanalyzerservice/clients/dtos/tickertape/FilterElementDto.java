package mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.tickertape;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class FilterElementDto {


    String label;

    String name;

    List<String> subSectors;

}
