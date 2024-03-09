package mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class MutualFundHistoricalDataResponseDto {

    @JsonProperty("meta")
    private MutualFundMetaDataDto metaData;

    @JsonProperty("data")
    private List<MutualFundHistoricalDataUnitDto> historicalData;

}
