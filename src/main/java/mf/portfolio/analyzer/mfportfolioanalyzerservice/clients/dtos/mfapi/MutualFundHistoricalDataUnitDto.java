package mf.portfolio.analyzer.mfportfolioanalyzerservice.clients.dtos.mfapi;

import lombok.Getter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter
public class MutualFundHistoricalDataUnitDto {

    private LocalDate date;

    private String nav;

    public void setDate(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.date = LocalDate.parse(dateString, formatter);
    }
}
