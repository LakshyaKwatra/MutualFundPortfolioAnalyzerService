package mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.tickertape;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class FilterUIDto {
    List<FilterElementDto> filterElements;
}
