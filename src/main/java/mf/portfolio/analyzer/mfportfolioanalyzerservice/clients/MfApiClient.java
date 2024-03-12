package mf.portfolio.analyzer.mfportfolioanalyzerservice.clients;

import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.mfapi.MutualFundHistoricalDataResponseDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.mfapi.MutualFundSchemeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class MfApiClient {

    private final RestTemplate restTemplate;
    private final String baseUrl = "https://api.mfapi.in/mf";

    public MfApiClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<MutualFundSchemeDto> getMutualFundSchemeList() {
        ResponseEntity<MutualFundSchemeDto[]> responseEntity = restTemplate.getForEntity(baseUrl, MutualFundSchemeDto[].class);
        if (responseEntity.getStatusCode().is2xxSuccessful() && Objects.nonNull(responseEntity.getBody())) {
            MutualFundSchemeDto[] mutualFundSchemeDtoArray = responseEntity.getBody();
            return Arrays.asList(mutualFundSchemeDtoArray);
        } else {
            return null;
        }
    }

    public MutualFundHistoricalDataResponseDto getMutualFundHistoricalDataBySchemeCode(String schemeCode){
        ResponseEntity<MutualFundHistoricalDataResponseDto> responseEntity = restTemplate
                .getForEntity(baseUrl + "/" + schemeCode, MutualFundHistoricalDataResponseDto.class);
        if (responseEntity.getStatusCode().is2xxSuccessful() && Objects.nonNull(responseEntity.getBody())) {
            return responseEntity.getBody();
        } else {
            return null;
        }
    }
}
