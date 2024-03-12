package mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.mfapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class MutualFundMetaDataDto {

    @JsonProperty("scheme_code")
    private String schemeCode;

    @JsonProperty("scheme_name")
    private String schemeName;

    @JsonProperty("scheme_type")
    private String schemeType;

    @JsonProperty("scheme_category")
    private String schemeCategory;

    @JsonProperty("fund_house")
    private String fundHouse;
}
