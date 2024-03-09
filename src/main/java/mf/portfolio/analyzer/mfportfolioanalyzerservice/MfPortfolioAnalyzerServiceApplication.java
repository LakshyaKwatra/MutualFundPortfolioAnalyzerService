package mf.portfolio.analyzer.mfportfolioanalyzerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class MfPortfolioAnalyzerServiceApplication {

	public static void main(String[] args) throws IOException {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		FuzzyMatchingService fuzzyMatchingService = context.getBean(FuzzyMatchingService.class);
//		System.out.println(fuzzyMatchingService.getFuzzyMutualFundAMC("Kotak Mahindra"));
//		context.close();
		SpringApplication.run(MfPortfolioAnalyzerServiceApplication.class, args);
	}

}
