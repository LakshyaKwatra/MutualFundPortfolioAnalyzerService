package mf.portfolio.analyzer.mfportfolioanalyzerservice.clients;

import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.tickertape.MutualFundFiltersResponseDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.tickertape.MutualFundHoldingsByIdResponseDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.dtos.MutualFundHoldingsByNameResponseDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.tickertape.MutualFundQueryApiRequestDto;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.tickertape.MutualFundQueryResponseDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TickerTapeClient {

    private final RestTemplate restTemplate;
    private final String baseUrl = "https://api.tickertape.in";

    public TickerTapeClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public MutualFundQueryResponseDto queryMutualFundScreener(MutualFundQueryApiRequestDto mutualFundQueryApiRequest) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<MutualFundQueryApiRequestDto> requestEntity = new HttpEntity<>(mutualFundQueryApiRequest, headers);
        ResponseEntity<MutualFundQueryResponseDto> responseEntity = restTemplate
                .postForEntity(baseUrl + "/mf-screener/query", requestEntity, MutualFundQueryResponseDto.class);
        if(responseEntity.getStatusCode().is2xxSuccessful()) {
            return responseEntity.getBody();
        } else {
            return null;
        }
    }

    public MutualFundHoldingsByIdResponseDto getMutualFundHoldingDetailsById(String mutualFundId) {
        ResponseEntity<MutualFundHoldingsByIdResponseDto> responseEntity = restTemplate.getForEntity(baseUrl + "/mutualfunds/" + mutualFundId + "/holdings", MutualFundHoldingsByIdResponseDto.class);
        if(responseEntity.getStatusCode().is2xxSuccessful()) {
            return responseEntity.getBody();
        } else {
            return null;
        }
    }

    public MutualFundFiltersResponseDto getAllMutualFundFilters() {
        ResponseEntity<MutualFundFiltersResponseDto> responseEntity = restTemplate.getForEntity(baseUrl + "/mf-screener/filters", MutualFundFiltersResponseDto.class);
        if(responseEntity.getStatusCode().is2xxSuccessful()) {
            return responseEntity.getBody();
        } else {
            return null;
        }
    }

}
