package mf.portfolio.analyzer.mfportfolioanalyzerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;

@SpringBootApplication
@EnableScheduling
public class MfPortfolioAnalyzerServiceApplication {

	public static void main(String[] args) throws IOException {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		FuzzyMatchingService fuzzyMatchingService = context.getBean(FuzzyMatchingService.class);
		SpringApplication.run(MfPortfolioAnalyzerServiceApplication.class, args);
	}

}
