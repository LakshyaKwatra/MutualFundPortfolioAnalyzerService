package mf.portfolio.analyzer.mfportfolioanalyzerservice.service.impl;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import mf.portfolio.analyzer.mfportfolioanalyzerservice.service.MFScraperService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class MFScraperServiceImpl implements MFScraperService {

    @Override
    public List<String> getMutualFundAMCList() throws IOException {
        String searchUrl = "https://groww.in/mutual-funds/amc/bajaj-finserv-mutual-funds";
        HtmlPage page = scrape(searchUrl);
        List<HtmlElement> items = page.getByXPath("//h4[@class='contentPrimary bodyBase']");
        return items.stream().map(DomNode::asNormalizedText).toList();
    }

    private HtmlPage scrape(String searchUrl) throws IOException {
        WebClient client = new WebClient();
        client.getOptions().setCssEnabled(false);
        client.getOptions().setJavaScriptEnabled(false);
        return client.getPage(searchUrl);
    }
}
