package mf.portfolio.analyzer.mfportfolioanalyzerservice.repository;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Getter
@Repository
public class DataStore {
    private final List<String> mutualFundAMCList = Arrays.asList(
            "Bandhan AMC Limited",
            "Kotak Mahindra Asset Management Company Limited",
            "Old Bridge Asset Management Private Limited",
            "Zerodha Asset Management Private Limited",
            "Taurus Asset Management Company Limited",
            "Helios Capital Asset Management (India) Private Limited",
            "Bajaj Finserv Asset Management Limited",
            "Samco Asset Management Pvt. Ltd.",
            "Shriram Asset Management Company Limited",
            "NJ Asset Management Private Limited",
            "Trust Asset Management Private Limited",
            "Quant Money Managers Limited",
            "Navi AMC Limited",
            "IL&FS Infra Asset Management Limited",
            "Franklin Templeton Asset Management (India) Private Limited",
            "360 ONE Asset Management Limited",
            "PPFAS Asset Management Pvt. Ltd.",
            "Baroda BNP Paribas Asset Management India Pvt. Ltd.",
            "WhiteOak Capital Asset Management Limited",
            "Groww Asset Management Limited",
            "Canara Robeco Asset Management Company Limited",
            "Mahindra Manulife Investment Management Private Limited",
            "JM Financial Asset Management Private Limited",
            "HSBC Global Asset Management (India) Private Limited",
            "Bank of India Investment Managers Private Limited",
            "Sundaram Asset Management Company Limited",
            "PGIM India Asset Management Private Limited",
            "Union Asset Management Company Pvt. Ltd.",
            "Mirae Asset Investment Managers (India) Private Limited",
            "ITI Asset Management Limited",
            "Tata Asset Management Private Limited",
            "UTI Asset Management Company Private Limited",
            "Motilal Oswal Asset Management Company Limited",
            "Edelweiss Asset Management Limited",
            "Quantum Asset Management Company Private Limited",
            "HDFC Asset Management Company Limited",
            "Axis Asset Management Company Ltd.",
            "LIC Mutual Fund Asset Management Limited",
            "Nippon Life India Asset Management Limited",
            "SBI Funds Management Limited",
            "ICICI Prudential Asset Management Company Limited",
            "DSP Investment Managers Private Limited",
            "Aditya Birla Sun Life AMC Limited",
            "Invesco Asset Management Company Pvt Ltd.");


    private final List<String> projectList = Arrays.asList(
            "subsector",            //sub sector
            "option",               //option
            "aum",                  //aum
            "ret3y",                //3Y returns
            "expRatio",             //expense ratio
            "amc",                  //amc
            "ageInMon",             //age in months
            "benchmarkIndex",       //benchmark index
            "fmCode",               //fund managers
            "exitLoad",             //exit load
            "lockInPeriod",         //lock in period
            "minLumpInvAmt",        //minimum lumpsum investment
            "minSipAmount",         //minimum SIP amount
            "navClose",             //nav
            "sipinvest",            //sip investment allowed or not
            "alpha",                //alpha
            "ret10y",               //10Y returns
            "ret1y",                //1Y returns
            "ret3m",                //3M returns
            "ret5y",                //5Y returns
            "ret6m",                //6M returns
            "catStdDevAnn",         //Category Standard deviation
            "riskClassification",   //sebi risk category
            "stdDevAnn",            //standard deviation
            "trackErr",             //tracking error
            "percDebtH",            //percentage Debt Holding
            "percEquityH",          //percentage Equity Holding
            "percLargecap",         //percentage large cap holding
            "percMidcap",           //percentage mid cap holding
            "percOtherH",           //percentage others holding
            "percSmallcap",         //percentage small cap holding
            "sortino",              //sortino ratio
            "sharpe",               //sharpe ratio
            "ytm",                  //yield to maturity
            "avgMaturity",          //average maturity
            "catPe",                //category pe ratio
            "catYtm",               //category yield to maturity
            "pe");                  //category pe

    private final List<String> subsectorList = Arrays.asList(
            "FoFs - Gold",
            "Flexi Cap Fund",
            "Floating Rate Fund",
            "Banking & PSU Fund",
            "Ultra Short Duration Fund",
            "Medium Duration Fund",
            "Fixed Maturity Plans",
            "Money Market Fund",
            "Overnight Fund",
            "Credit Risk Fund",
            "Dynamic Bond Fund",
            "Liquid Fund",
            "Corporate Bond Fund",
            "Low Duration Fund",
            "Gilt - Long Term Fund",
            "Short Duration Fund",
            "Sectoral Fund - Infrastructure (Debt)",
            "Long Duration Fund",
            "Gilt - Short & Mid Term Fund",
            "Medium to Long Duration Fund",
            "Debt - Interval Fund",
            "Thematic Fund",
            "Focused Fund",
            "Large & Mid Cap Fund",
            "Index Fund",
            "Large Cap Fund",
            "Contra Fund",
            "Thematic Fund - Global",
            "Mid Cap Fund",
            "Small Cap Fund",
            "Equity Linked Savings Scheme (ELSS)",
            "Sectoral Fund - Pharma & Health Care",
            "Thematic Fund - MNC",
            "Value Fund",
            "Sectoral Fund - Consumption",
            "Multi Cap Fund",
            "Sectoral Fund - Infrastructure",
            "Dividend Yield Fund",
            "Sectoral Fund - Service Industry",
            "Sectoral Fund - Banks & Financial Services",
            "Sectoral Fund - Technology",
            "Sectoral Fund - Energy & Power",
            "Arbitrage Fund",
            "Multi Asset Allocation Fund",
            "Balanced Advantage Fund",
            "Aggressive Hybrid Fund",
            "Dynamic Asset Allocation Fund",
            "Equity Savings",
            "Conservative Hybrid Fund",
            "Balanced Hybrid Fund",
            "FoFs (Domestic) - Equity Oriented",
            "Solution Oriented - Children's Fund",
            "FoFs (Overseas)",
            "FoFs (Domestic) - Debt Oriented",
            "Solution Oriented - Retirement Fund"
    );

    private final List<String> optionList = Arrays.asList(
            "IDCW",
            "Growth",
            "Bonus"
    );

    private final List<String> benchmarkIndexList = Arrays.asList(
            "Gold-India",
            "Gold-London Bullion Market association (LBMA)",
            "FTSE Gold Mines",
            "",
            "Silver",
            "Gold-London AM (INR)",
            "Nifty Short Duration Debt Index",
            "CRISIL Banking and PSU Debt Index",
            "NIFTY Ultra Short Duration Debt Index",
            "CRISIL Medium Duration Debt Index",
            "Crisil Long Term Debt Index",
            "CRISIL Money Market Index",
            "Nifty 1D Rate Index",
            "CRISIL Liquid Overnight Index",
            "NIFTY Credit Risk Bond Index",
            "CRISIL Ultra Short Term Debt Index",
            "NIFTY Composite Debt Index",
            "Nifty Money Market Index",
            "CRISIL Liquid Debt Index",
            "NIFTY Corporate Bond Index",
            "NIFTY Low Duration Debt Index",
            "CRISIL Low Duration Debt Index",
            "CRISIL Dynamic Bond Index",
            "CRISIL Corporate Bond Index",
            "NIFTY Medium Duration Debt Index",
            "NIFTY Banking and PSU Debt Index",
            "Crisil 10 Yr Gilt Index",
            "CRISIL Dynamic Gilt Index",
            "CRISIL Composite Bond Index",
            "CRISIL Short Term Bond Index",
            "CRISIL Corporate Bond Composite Index",
            "Nifty All Duration G-Sec Index",
            "CRISIL Medium to Long Term Debt Index",
            "Nifty Liquid Fund Index",
            "CRISIL Short Term Credit Risk Fund",
            "Nifty 10 yr Benchmark G-Sec",
            "NIFTY Composite Bond Index",
            "NIFTY Medium to Long Term Debt Index",
            "NIFTY Long Duration Debt Index",
            "CRISIL Short Term Gilt Index",
            "Nifty PSU Bond Plus SDL Apr 2026 50:50 Index",
            "CRISIL Gilt 2027 Index",
            "CRISIL Gilt 2028 Index",
            "Nifty SDL Plus PSU Bond Sep 2026 60:40 Index",
            "Nifty PSU Bond Plus SDL Sep 2027 40:60 Index",
            "Nifty PSU Bond Plus SDL Apr 2027 50:50 Index",
            "CRISIL IBX SDL Index - September 2027",
            "Nifty SDL Sep 2025 Index",
            "CRISIL IBX Gilt Index - June 2036",
            "CRISIL IBX Gilt Index - April 2026",
            "Nifty SDL Jun 2027 Index",
            "CRISIL IBX 60:40 SDL + AAA PSU Index - April 2025",
            "CRISIL IBX 60:40 SDL + AAA PSU Index - April 2027",
            "Nifty SDL Plus AAA PSU Bond Dec 2027 60: 40 Index - TRI",
            "Nifty SDL Sep 2027 Index",
            "Nifty AAA CPSE Bond Plus SDL Apr 2027 60:40 Index",
            "CRISIL IBX 50:50 Gilt Plus SDL Index - April 2028",
            "Nifty SDL Plus G-Sec Jun 2028 70:30 Index",
            "CRISIL IBX 50:50 PSU + SDL Index - October 2025",
            "CRISIL IBX SDL Index - May 2027",
            "Nifty SDL Apr 2032 Top 12 Equal Weight Index",
            "Nifty SDL Apr 2027 Top 12 Equal Weight Index",
            "Nifty SDL Apr 2027 Index",
            "CRISIL IBX 70:30 CPSE Plus SDL - April 2025",
            "Nifty CPSE Bond Plus SDL Sep 2026 50:50 Index",
            "CRISIL IBX Gilt Index - April 2029",
            "CRISIL IBX 50:50 Gilt Plus SDL Index - April 2037",
            "Nifty SDL Plus AAA PSU Bond Jul 2028 60:40 Index",
            "Nifty SDL Dec 2028 Index",
            "Nifty G-Sec Dec 2030 Index",
            "CRISIL IBX 50:50 Gilt Plus SDL Index - June 2027",
            "Nifty AAA Bond Plus SDL Apr 2026 50:50 Index",
            "CRISIL IBX Gilt Index - April 2033",
            "Nifty AAA PSU Bond Plus SDL Sep 2026 50:50 Index",
            "Nifty G-sec Dec 2026 Index",
            "Nifty G-Sec July 2031 Index",
            "CRISIL IBX 50:50 Gilt Plus SDL Index - Sep 2028",
            "Nifty SDL Sep 2026 Index",
            "CRISIL IBX 90:10 SDL Plus Gilt Index - April 2032",
            "CRISIL IBX 90:10 SDL Plus Gilt Index - November 2026",
            "CRISIL IBX 90:10 SDL Plus Gilt Index - September 2027",
            "Nifty G-Sec Sep 2027 Index",
            "CRISIL IBX 60:40 SDL + AAA PSU Index - April 2026",
            "Nifty G-Sec Jun 2036 Index",
            "Nifty G-Sec Sep 2032 Index",
            "Nifty G-Sec Jun 2027 Index",
            "Nifty SDL Jul 2026 Index",
            "Nifty G-Sec Dec 2029 Index",
            "CRISIL IBX SDL Index - June 2027",
            "CRISIL IBX 50:50 Gilt Plus SDL Index - June 2028",
            "CRISIL SDL Plus G-Sec Apr 2033 50:50 Index",
            "NIFTY SDL December 2026 Index",
            "Nifty SDL Plus G-Sec Sep 2027 50:50 Index",
            "CRISIL IBX AAA Index - March 2024",
            "CRISIL IBX 50:50 Gilt Plus SDL Short Duration Index",
            "Nifty SDL Plus AAA PSU Bond Apr 2026 75:25 Index",
            "CRISIL IBX Gilt Index - April 2028",
            "Nifty SDL Jul 2033 Index",
            "Nifty SDL Plus AAA PSU Bond Apr 2028 75:25 Index",
            "NIFTY G- Sec Apr 2029 Index",
            "CRISIL IBX Gilt Index - June 2027",
            "CRISIL Long Duration Debt Index",
            "NIFTY SDL Plus G-Sec Jun 2027 40:60 Index",
            "Nifty G-sec Jul 2027 Index",
            "Nifty SDL June 2028 Index",
            "Nifty G-Sec July 2033 Index",
            "S&P BSE 500 - TRI",
            "NIFTY 500 - TRI",
            "Nifty G-Sec Oct 2028 Index",
            "Nifty SDL Oct 2026 Index",
            "CRISIL IBX 50:50 Gilt Plus SDL Index - September 2027",
            "CRISIL IBX SDL Index - June 2032",
            "Nifty SDL Plus G-Sec Jun 2029 70:30 Index",
            "CRISIL IBX Gilt Index - April 2032",
            "NIFTY100 ESG - TRI",
            "NIFTY LargeMidcap 250 - TRI",
            "MSCI India Domestic & World Healthcare 45 Index",
            "Nifty Smallcap 250 - TRI",
            "NIFTY 100 - TRI",
            "S&P BSE 250 LargeMidCap Index - TRI",
            "NIFTY500 Value 50 - TRI",
            "S&P 500 - TRI",
            "NIFTY NEXT 50 - TRI",
            "NIFTY 50 - TRI",
            "S&P BSE 150 MidCap - TRI",
            "S&P BSE 200 - TRI",
            "S&P BSE 250 Small Cap - TRI",
            "S&P BSE PSU - TRI",
            "NIFTY COMMODITIES - TRI",
            "NIFTY BANK - TRI",
            "Nifty Midcap 150 - TRI",
            "S&P BSE Health Care - TRI",
            "NIFTY MNC - TRI",
            "S&P BSE 100 - TRI",
            "Nifty India Consumption - TRI",
            "Nifty500 Multicap 50:25:25 - TRI",
            "Nifty Infrastructure - TRI",
            "S&P BSE India Infrastructure Index - TRI",
            "S&P BSE SENSEX - TRI",
            "Nifty India Manufacturing - TRI",
            "NIFTY50 Equal Weight - TRI",
            "Nifty Services Sector - TRI",
            "S&P BSE 500",
            "India Recent 100 IPO Index",
            "Nifty Housing - TRI",
            "Nifty Smallcap 100",
            "Nifty100 Equal Weight - TRI",
            "Nifty Smallcap 250 Momentum Quality 100 - TRI",
            "Bloomberg US Intermediate Treasury - TRI",
            "Bloomberg US Treasury 1-3 Year Index",
            "Bloomberg US Treasury 3-10 Year Index",
            "S&P Developed Ex-U.S. BMI Total Return Index",
            "ICE 0-1 Year US Treasury Securities Index",
            "NIFTY BHARAT Bond Index - April 2033",
            "Indxx Artificial Intelligence & Big Data Index - TRI",
            "Solactive Autonomous & Electric Vehicles Index - TRI",
            "Nifty India Digital  - TRI",
            "CRSP US Total Market Index",
            "NYSE Arca Gold Miners Index",
            "NIFTY BHARAT Bond Index - April 2032",
            "Hang Seng TECH TRI",
            "FTSE EPRA/NAREIT Developed Index",
            "FTSE EPRA Nareit Asia ex Japan REITs Index",
            "S&P 500 Top 50 TRI",
            "NYSE FANG+ TRI",
            "Nifty 5 yr Benchmark G-Sec Index TRI",
            "CRISIL Hybrid 65+35 - Conservative Index",
            "Nasdaq-100 - TRI",
            "MSCI World Consumer Discretionary Index - Net Dividend",
            "S&P Asia Pacific ex Japan REIT - TRI",
            "Russell 3000 Growth Index",
            "MSCI AC ASEAN 10/40 Index",
            "MSCI Golden Dragon Index (Total Return Net)",
            "MSCI EMU Index",
            "MSCI World Index-Net Dividend",
            "MSCI Europe Index (Total Return Net)",
            "NIFTY NEXT 50",
            "S&P BSE Bharat 22 Index",
            "MSCI Emerging Market Index",
            "MSCI Brazil 10/40 Index",
            "MSCI AC World Index",
            "MSCI ACWI Metals & Mining 30% Buffer 10/40 (1994) Net TRI",
            "Russell 1000 Index",
            "CRISIL Short Term Debt Hybrid 75+25 Index",
            "MSCI ACWI Net TRI",
            "CRISIL Hybrid 75+25 - Conservative Index",
            "NIFTY BHARAT Bond Index - April 2030",
            "Russell 1000 Equal Weighted Technology Index",
            "NIFTY BHARAT Bond Index - April 2023",
            "NIFTY BHARAT Bond Index - April 2031",
            "Nifty100 ESG Sector Leaders - TRI",
            "iCOMDEX Composite Index",
            "NIFTY 50 Hybrid Composite Debt 50:50 Index",
            "CRISIL Hybrid 35+65 - Aggressive Index",
            "NIFTY 50 Equity Savings Index - TRI",
            "Crisil Equity Savings Index",
            "CRISIL Hybrid 50+50 - Moderate Index",
            "NIFTY 50 Equity Savings Index",
            "CRISIL Hybrid 85+15 - Conservative Index",
            "NIFTY 50 Hybrid Composite Debt 15:85 Index",
            "NIFTY 50 Hybrid Composite Debt 65:35 Index",
            "CRISIL Hybrid 25+75 - Aggressive Index",
            "S&P BSE 200",
            "MSCI World",
            "Nifty 50 Arbitrage - TRI",
            "Nifty 50 Arbitrage",
            "NIFTY ENERGY - TRI",
            "S&P BSE Consumer Discretionary Goods & Services - TRI",
            "Nifty Smallcap250 Quality 50 - TRI",
            "Nifty Alpha 50 - TRI",
            "Nifty Total Market - TRI",
            "Nifty Financial Services Ex-Bank - TRI",
            "Nifty Microcap 250 - TRI",
            "S&P BSE Housing - TRI",
            "Nifty India Defence - TRI",
            "Nifty Midcap150 Momentum 50 - TRI",
            "NIFTY AUTO - TRI",
            "Nifty100 Low Volatility 30 - TRI",
            "NIFTY Alpha Low-Volatility 30 - TRI",
            "S&P BSE Enhanced Value Index - TRI",
            "S&P BSE Quality Index - TRI",
            "S&P BSE Financials ex Bank 30 - TRI",
            "NIFTY Midcap150 Quality 50 - TRI",
            "Nifty Midcap 50 - TRI",
            "S&P BSE Low Volatility Index - TRI",
            "S&P BSE TECk Index",
            "Taiwan Capitalization Weighted Stock Index",
            "Nifty Healthcare Index - TRI",
            "Nifty200 Momentum 30 - TRI",
            "Nifty Smallcap 50 - TRI",
            "NIFTY 200 - TRI",
            "Nifty Dividend Opportunities 50 - TRI",
            "Nasdaq-100",
            "NIFTY100 Quality 30 - TRI",
            "Nifty Midcap 100 - TRI",
            "Nifty Smallcap 100 - TRI",
            "S&P BSE India Infrastructure Index",
            "NIFTY 100",
            "NIFTY 500",
            "Nifty Smallcap 250",
            "Nifty50 Value 20 - TRI",
            "S&P BSE India Manufacturing Index - TRI",
            "MSCI World Energy 30% Buffer 10/40 Net Total Return",
            "NIFTY IT - TRI",
            "NIFTY PHARMA - TRI",
            "S&P BSE 500 Japan - TRI",
            "S&P BSE 500 Shariah - TRI",
            "S&P BSE BANKEX - TRI",
            "MSCI Asia (ex-Japan) Standard Index",
            "Nifty Transportation & Logistics - TRI",
            "NIFTY 50",
            "NIFTY FMCG - TRI",
            "S&P Global 1200",
            "S&P 500",
            "S&P BSE TECk Index - TRI",
            "Nifty Financial Services - TRI",
            "Nifty500 Shariah - TRI"
    );

    private final List<String> isSipInvestmentAllowed = Arrays.asList(
            "Allowed",
            "Not allowed"
            );
}





//curl 'https://api.tickertape.in/mf-screener/query' \
//  -H 'sec-ch-ua: "Not_A Brand";v="8", "Chromium";v="120", "Google Chrome";v="120"' \
//  -H 'sec-ch-ua-mobile: ?0' \
//  -H 'User-Agent: Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36' \
//  -H 'Content-Type: application/json' \
//  -H 'Accept: application/json, text/plain, */*' \
//  -H 'Referer;' \
//  -H 'accept-version: 8.9.0' \
//  -H 'sec-ch-ua-platform: "macOS"' \
//  --data-raw $'{"match":{"sharpe":{"g":5.71499,"l":45},"subsector":["FoFs - Gold","Flexi Cap Fund","Floating Rate Fund","Banking & PSU Fund","Ultra Short Duration Fund","Medium Duration Fund","Fixed Maturity Plans","Money Market Fund","Overnight Fund","Credit Risk Fund","Dynamic Bond Fund","Liquid Fund","Corporate Bond Fund","Low Duration Fund","Gilt - Long Term Fund","Short Duration Fund","Sectoral Fund - Infrastructure (Debt)","Long Duration Fund","Gilt - Short & Mid Term Fund","Medium to Long Duration Fund","Debt - Interval Fund","Thematic Fund","Focused Fund","Large & Mid Cap Fund","Index Fund","Large Cap Fund","Contra Fund","Thematic Fund - Global","Mid Cap Fund","Small Cap Fund","Equity Linked Savings Scheme (ELSS)","Sectoral Fund - Pharma & Health Care","Thematic Fund - MNC","Value Fund","Sectoral Fund - Consumption","Multi Cap Fund","Sectoral Fund - Infrastructure","Dividend Yield Fund","Sectoral Fund - Service Industry","Sectoral Fund - Banks & Financial Services","Sectoral Fund - Technology","Sectoral Fund - Energy & Power","Arbitrage Fund","Multi Asset Allocation Fund","Balanced Advantage Fund","Aggressive Hybrid Fund","Dynamic Asset Allocation Fund","Equity Savings","Conservative Hybrid Fund","Balanced Hybrid Fund","FoFs (Domestic) - Equity Oriented","Solution Oriented - Children\'s Fund","FoFs (Overseas)","FoFs (Domestic) - Debt Oriented","Solution Oriented - Retirement Fund"],"option":["IDCW","Growth","Bonus"],"aum":{"g":11155.1882,"l":77012},"ret3y":{"g":3.05804,"l":126.99794},"expRatio":{"g":0.43448,"l":2},"amc":["Kotak Mahindra Asset Management Company Limited","SBI Funds Management Limited","ICICI Prudential Asset Management Company Limited","DSP Investment Managers Private Limited","Aditya Birla Sun Life AMC Limited","Invesco Asset Management Company Pvt Ltd.","Nippon Life India Asset Management Limited","LIC Mutual Fund Asset Management Limited","Axis Asset Management Company Ltd.","HDFC Asset Management Company Limited","Quantum Asset Management Company Private Limited","Edelweiss Asset Management Limited","Motilal Oswal Asset Management Company Limited","UTI Asset Management Company Private Limited","Tata Asset Management Private Limited","ITI Asset Management Limited","Mirae Asset Investment Managers (India) Private Limited","Union Asset Management Company Pvt. Ltd.","PGIM India Asset Management Private Limited","Sundaram Asset Management Company Limited","Bank of India Investment Managers Private Limited","HSBC Global Asset Management (India) Private Limited","JM Financial Asset Management Private Limited","Mahindra Manulife Investment Management Private Limited","Canara Robeco Asset Management Company Limited","Groww Asset Management Limited","WhiteOak Capital Asset Management Limited","Baroda BNP Paribas Asset Management India Pvt. Ltd.","PPFAS Asset Management Pvt. Ltd.","360 ONE Asset Management Limited","Bandhan AMC Limited","Franklin Templeton Asset Management (India) Private Limited","IL&FS Infra Asset Management Limited","Navi AMC Limited","Quant Money Managers Limited","Trust Asset Management Private Limited","NJ Asset Management Private Limited","Shriram Asset Management Company Limited","Samco Asset Management Pvt. Ltd.","Bajaj Finserv Asset Management Limited","Helios Capital Asset Management (India) Private Limited","Taurus Asset Management Company Limited","Zerodha Asset Management Private Limited","Old Bridge Asset Management Private Limited"],"ageInMon":{"g":25.04934,"l":136},"benchmarkIndex":["Gold-India","Gold-London Bullion Market association (LBMA)","FTSE Gold Mines","","Silver","Gold-London AM (INR)","Nifty Short Duration Debt Index","CRISIL Banking and PSU Debt Index","NIFTY Ultra Short Duration Debt Index","CRISIL Medium Duration Debt Index","Crisil Long Term Debt Index","CRISIL Money Market Index","Nifty 1D Rate Index","CRISIL Liquid Overnight Index","NIFTY Credit Risk Bond Index","CRISIL Ultra Short Term Debt Index","NIFTY Composite Debt Index","Nifty Money Market Index","CRISIL Liquid Debt Index","NIFTY Corporate Bond Index","NIFTY Low Duration Debt Index","CRISIL Low Duration Debt Index","CRISIL Dynamic Bond Index","CRISIL Corporate Bond Index","NIFTY Medium Duration Debt Index","NIFTY Banking and PSU Debt Index","Crisil 10 Yr Gilt Index","CRISIL Dynamic Gilt Index","CRISIL Composite Bond Index","CRISIL Short Term Bond Index","CRISIL Corporate Bond Composite Index","Nifty All Duration G-Sec Index","CRISIL Medium to Long Term Debt Index","Nifty Liquid Fund Index","CRISIL Short Term Credit Risk Fund","Nifty 10 yr Benchmark G-Sec","NIFTY Composite Bond Index","NIFTY Medium to Long Term Debt Index","NIFTY Long Duration Debt Index","CRISIL Short Term Gilt Index","Nifty PSU Bond Plus SDL Apr 2026 50:50 Index","CRISIL Gilt 2027 Index","CRISIL Gilt 2028 Index","Nifty SDL Plus PSU Bond Sep 2026 60:40 Index","Nifty PSU Bond Plus SDL Sep 2027 40:60 Index","Nifty PSU Bond Plus SDL Apr 2027 50:50 Index","CRISIL IBX SDL Index - September 2027","Nifty SDL Sep 2025 Index","CRISIL IBX Gilt Index - June 2036","CRISIL IBX Gilt Index - April 2026","Nifty SDL Jun 2027 Index","CRISIL IBX 60:40 SDL + AAA PSU Index - April 2025","CRISIL IBX 60:40 SDL + AAA PSU Index - April 2027","Nifty SDL Plus AAA PSU Bond Dec 2027 60: 40 Index - TRI","Nifty SDL Sep 2027 Index","Nifty AAA CPSE Bond Plus SDL Apr 2027 60:40 Index","CRISIL IBX 50:50 Gilt Plus SDL Index - April 2028","Nifty SDL Plus G-Sec Jun 2028 70:30 Index","CRISIL IBX 50:50 PSU + SDL Index - October 2025","CRISIL IBX SDL Index - May 2027","Nifty SDL Apr 2032 Top 12 Equal Weight Index","Nifty SDL Apr 2027 Top 12 Equal Weight Index","Nifty SDL Apr 2027 Index","CRISIL IBX 70:30 CPSE Plus SDL - April 2025","Nifty CPSE Bond Plus SDL Sep 2026 50:50 Index","CRISIL IBX Gilt Index - April 2029","CRISIL IBX 50:50 Gilt Plus SDL Index - April 2037","Nifty SDL Plus AAA PSU Bond Jul 2028 60:40 Index","Nifty SDL Dec 2028 Index","Nifty G-Sec Dec 2030 Index","CRISIL IBX 50:50 Gilt Plus SDL Index - June 2027","Nifty AAA Bond Plus SDL Apr 2026 50:50 Index","CRISIL IBX Gilt Index - April 2033","Nifty AAA PSU Bond Plus SDL Sep 2026 50:50 Index","Nifty G-sec Dec 2026 Index","Nifty G-Sec July 2031 Index","CRISIL IBX 50:50 Gilt Plus SDL Index - Sep 2028","Nifty SDL Sep 2026 Index","CRISIL IBX 90:10 SDL Plus Gilt Index - April 2032","CRISIL IBX 90:10 SDL Plus Gilt Index - November 2026","CRISIL IBX 90:10 SDL Plus Gilt Index - September 2027","Nifty G-Sec Sep 2027 Index","CRISIL IBX 60:40 SDL + AAA PSU Index - April 2026","Nifty G-Sec Jun 2036 Index","Nifty G-Sec Sep 2032 Index","Nifty G-Sec Jun 2027 Index","Nifty SDL Jul 2026 Index","Nifty G-Sec Dec 2029 Index","CRISIL IBX SDL Index - June 2027","CRISIL IBX 50:50 Gilt Plus SDL Index - June 2028","CRISIL SDL Plus G-Sec Apr 2033 50:50 Index","NIFTY SDL December 2026 Index","Nifty SDL Plus G-Sec Sep 2027 50:50 Index","CRISIL IBX AAA Index - March 2024","CRISIL IBX 50:50 Gilt Plus SDL Short Duration Index","Nifty SDL Plus AAA PSU Bond Apr 2026 75:25 Index","CRISIL IBX Gilt Index - April 2028","Nifty SDL Jul 2033 Index","Nifty SDL Plus AAA PSU Bond Apr 2028 75:25 Index","NIFTY G- Sec Apr 2029 Index","CRISIL IBX Gilt Index - June 2027","CRISIL Long Duration Debt Index","NIFTY SDL Plus G-Sec Jun 2027 40:60 Index","Nifty G-sec Jul 2027 Index","Nifty SDL June 2028 Index","Nifty G-Sec July 2033 Index","S&P BSE 500 - TRI","NIFTY 500 - TRI","Nifty G-Sec Oct 2028 Index","Nifty SDL Oct 2026 Index","CRISIL IBX 50:50 Gilt Plus SDL Index - September 2027","CRISIL IBX SDL Index - June 2032","Nifty SDL Plus G-Sec Jun 2029 70:30 Index","CRISIL IBX Gilt Index - April 2032","NIFTY100 ESG - TRI","NIFTY LargeMidcap 250 - TRI","MSCI India Domestic & World Healthcare 45 Index","Nifty Smallcap 250 - TRI","NIFTY 100 - TRI","S&P BSE 250 LargeMidCap Index - TRI","NIFTY500 Value 50 - TRI","S&P 500 - TRI","NIFTY NEXT 50 - TRI","NIFTY 50 - TRI","S&P BSE 150 MidCap - TRI","S&P BSE 200 - TRI","S&P BSE 250 Small Cap - TRI","S&P BSE PSU - TRI","NIFTY COMMODITIES - TRI","NIFTY BANK - TRI","Nifty Midcap 150 - TRI","S&P BSE Health Care - TRI","NIFTY MNC - TRI","S&P BSE 100 - TRI","Nifty India Consumption - TRI","Nifty500 Multicap 50:25:25 - TRI","Nifty Infrastructure - TRI","S&P BSE India Infrastructure Index - TRI","S&P BSE SENSEX - TRI","Nifty India Manufacturing - TRI","NIFTY50 Equal Weight - TRI","Nifty Services Sector - TRI","S&P BSE 500","India Recent 100 IPO Index","Nifty Housing - TRI","Nifty Smallcap 100","Nifty100 Equal Weight - TRI","Nifty Smallcap 250 Momentum Quality 100 - TRI","Bloomberg US Intermediate Treasury - TRI","Bloomberg US Treasury 1-3 Year Index","Bloomberg US Treasury 3-10 Year Index","S&P Developed Ex-U.S. BMI Total Return Index","ICE 0-1 Year US Treasury Securities Index","NIFTY BHARAT Bond Index - April 2033","Indxx Artificial Intelligence & Big Data Index - TRI","Solactive Autonomous & Electric Vehicles Index - TRI","Nifty India Digital  - TRI","CRSP US Total Market Index","NYSE Arca Gold Miners Index","NIFTY BHARAT Bond Index - April 2032","Hang Seng TECH TRI","FTSE EPRA/NAREIT Developed Index","FTSE EPRA Nareit Asia ex Japan REITs Index","S&P 500 Top 50 TRI","NYSE FANG+ TRI","Nifty 5 yr Benchmark G-Sec Index TRI","CRISIL Hybrid 65+35 - Conservative Index","Nasdaq-100 - TRI","MSCI World Consumer Discretionary Index - Net Dividend","S&P Asia Pacific ex Japan REIT - TRI","Russell 3000 Growth Index","MSCI AC ASEAN 10/40 Index","MSCI Golden Dragon Index (Total Return Net)","MSCI EMU Index","MSCI World Index-Net Dividend","MSCI Europe Index (Total Return Net)","NIFTY NEXT 50","S&P BSE Bharat 22 Index","MSCI Emerging Market Index","MSCI Brazil 10/40 Index","MSCI AC World Index","MSCI ACWI Metals & Mining 30% Buffer 10/40 (1994) Net TRI","Russell 1000 Index","CRISIL Short Term Debt Hybrid 75+25 Index","MSCI ACWI Net TRI","CRISIL Hybrid 75+25 - Conservative Index","NIFTY BHARAT Bond Index - April 2030","Russell 1000 Equal Weighted Technology Index","NIFTY BHARAT Bond Index - April 2023","NIFTY BHARAT Bond Index - April 2031","Nifty100 ESG Sector Leaders - TRI","iCOMDEX Composite Index","NIFTY 50 Hybrid Composite Debt 50:50 Index","CRISIL Hybrid 35+65 - Aggressive Index","NIFTY 50 Equity Savings Index - TRI","Crisil Equity Savings Index","CRISIL Hybrid 50+50 - Moderate Index","NIFTY 50 Equity Savings Index","CRISIL Hybrid 85+15 - Conservative Index","NIFTY 50 Hybrid Composite Debt 15:85 Index","NIFTY 50 Hybrid Composite Debt 65:35 Index","CRISIL Hybrid 25+75 - Aggressive Index","S&P BSE 200","MSCI World","Nifty 50 Arbitrage - TRI","Nifty 50 Arbitrage","NIFTY ENERGY - TRI","S&P BSE Consumer Discretionary Goods & Services - TRI","Nifty Smallcap250 Quality 50 - TRI","Nifty Alpha 50 - TRI","Nifty Total Market - TRI","Nifty Financial Services Ex-Bank - TRI","Nifty Microcap 250 - TRI","S&P BSE Housing - TRI","Nifty India Defence - TRI","Nifty Midcap150 Momentum 50 - TRI","NIFTY AUTO - TRI","Nifty100 Low Volatility 30 - TRI","NIFTY Alpha Low-Volatility 30 - TRI","S&P BSE Enhanced Value Index - TRI","S&P BSE Quality Index - TRI","S&P BSE Financials ex Bank 30 - TRI","NIFTY Midcap150 Quality 50 - TRI","Nifty Midcap 50 - TRI","S&P BSE Low Volatility Index - TRI","S&P BSE TECk Index","Taiwan Capitalization Weighted Stock Index","Nifty Healthcare Index - TRI","Nifty200 Momentum 30 - TRI","Nifty Smallcap 50 - TRI","NIFTY 200 - TRI","Nifty Dividend Opportunities 50 - TRI","Nasdaq-100","NIFTY100 Quality 30 - TRI","Nifty Midcap 100 - TRI","Nifty Smallcap 100 - TRI","S&P BSE India Infrastructure Index","NIFTY 100","NIFTY 500","Nifty Smallcap 250","Nifty50 Value 20 - TRI","S&P BSE India Manufacturing Index - TRI","MSCI World Energy 30% Buffer 10/40 Net Total Return","NIFTY IT - TRI","NIFTY PHARMA - TRI","S&P BSE 500 Japan - TRI","S&P BSE 500 Shariah - TRI","S&P BSE BANKEX - TRI","MSCI Asia (ex-Japan) Standard Index","Nifty Transportation & Logistics - TRI","NIFTY 50","NIFTY FMCG - TRI","S&P Global 1200","S&P 500","S&P BSE TECk Index - TRI","Nifty Financial Services - TRI","Nifty500 Shariah - TRI"],"fmCode":["721","673","489","624","409","345","947","521","567","178","44","1001","723","704","661","605","500","594","511","374","250","43","707","617","441","359","715","706","471","478","979"],"exitLoad":{"g":0.09053,"l":1},"lockInPeriod":{"g":0.72425,"l":5},"minLumpInvAmt":{"g":14041.5967,"l":100000},"minSipAmount":{"g":2669.5019,"l":12000},"navClose":{"g":331126.2705,"l":1556388},"sipinvest":["Allowed","Not allowed"],"alpha":{"g":-12.49075,"l":56},"ret10y":{"g":15.77222,"l":74},"ret1y":{"g":18.27177,"l":97},"ret3m":{"g":6.06874,"l":34},"ret5y":{"g":-10.41082,"l":65.99873},"ret6m":{"g":11.79762,"l":59},"catStdDevAnn":{"g":4.8888,"l":15},"riskClassification":["High","Very High","Moderately Low","Moderate","Low","Moderately High"],"stdDevAnn":{"g":3.8703,"l":19},"trackErr":{"g":6.0658,"l":20},"percDebtH":{"g":11.1356,"l":82},"percEquityH":{"g":17.36016,"l":103},"percLargecap":{"g":20.23946,"l":100.99898},"percMidcap":{"g":16.52696,"l":87},"percOtherH":{"g":0,"l":0},"percSmallcap":{"g":11.00438,"l":100.99898},"sortino":{"g":2.6666,"l":44},"ytm":{"g":4.014,"l":11},"avgMaturity":{"g":2.78852,"l":28},"catPe":{"g":27.31031,"l":62},"catYtm":{"g":4.9506,"l":9},"pe":{"g":21.26178,"l":78}},"sortBy":"aum","sortOrder":-1,"project":["subsector","option","aum","ret3y","expRatio","amc","ageInMon","benchmarkIndex","fmCode","exitLoad","lockInPeriod","minLumpInvAmt","minSipAmount","navClose","sipinvest","alpha","ret10y","ret1y","ret3m","ret5y","ret6m","catStdDevAnn","riskClassification","stdDevAnn","trackErr","percDebtH","percEquityH","percLargecap","percMidcap","percOtherH","percSmallcap","sortino","sharpe","ytm","avgMaturity","catPe","catYtm","pe"],"offset":0,"count":20,"mfIds":["M_IIF0","M_IIF5","M_ADIXD","M_ADIXE","M_ADEX","M_AXSX","M_AX0Y","M_IDFNN","M_IDNY","M_IDFY","M_BAP0","M_BAP5","M_DSNY","M_DSNT","M_DSP5","M_EDNX","M_EDT0","M_HD5Y","M_LTND","M_LTN0","M_LTNY","M_ICIDX","M_ICINT","M_ICYX","M_KOYG","M_KONW","M_KOYP","M_LIIE","M_LII5","M_MOTN","M_NAVE","M_NAVL","M_NAVI","M_NIEL","M_NIXY","M_NI0U","M_NI0E","M_NI5Q","M_QUTU","M_QUA0","M_SBEE","M_SBIV","M_SBIQ","M_SBYF","M_SBYI","M_SBNN","M_SHRS","M_TANX","M_TASX","M_TA5Y","M_UTXU","M_UTU5","M_IILT","M_IILC","M_IIFI","M_IIFW","M_ADTUF","M_ADTUD","M_ADTAU","M_ADQW","M_ADIQW","M_AXLF","M_AXLD","M_AXLU","M_AXILI","M_AXLQ","M_AXILL","M_BAJA","M_BAJN","M_BAJJ","M_BAJQ","M_BAJE","M_BAFP","M_BAJI","M_BAFQ","M_IDFAH","M_IDFAC","M_IDSH","M_BAQH","M_BAQA","M_IDHU","M_BAQN","M_BAQL","M_IDAW","M_BOLI","M_BOLX","M_BOAW","M_BALL","M_BALA","M_BAAW","M_BALP","M_CABQ","M_CABL","M_CABI","M_CABU","M_CALM","M_CAOW","M_CALF","M_CANQ","M_DSYL","M_DSLY","M_DSIW","M_DSWQ","M_EDQI","M_EDQG","M_EDQE","M_EDAQ","M_EDQR","M_EDQL","M_EDRQ","M_EDSL","M_EDCQ","M_EDQD","M_EDPU","M_EDQU","M_EDPQ","M_FRQK","M_FRQN","M_FRQR","M_FRQL","M_INQA","M_INQI","M_INBQ","M_GRWQ","M_INLQ","M_GRLL","M_INLD","M_GRLW","M_HDCLI","M_HDCLL","M_HDLI","M_HDCLQ","M_HDIW","M_HDFQW","M_HSAN","M_HSAU","M_HSAC","M_HSAH","M_HSAF","M_HSQC","M_ICPIQ","M_ICPCQ","M_ICCLQ","M_ICILU","M_ICIWD","M_ICQW","M_ITLN","M_ITLI","M_ITQF","M_ITLF","M_ITLQ","M_ITQN","M_ITLD","M_INQS","M_INQE","M_INLF","M_INVCA","M_INSW","M_JMIQ","M_JMIG","M_JMIR","M_JMID","M_JMUE","M_JMII","M_JMUW","M_KOQD","M_KOQL","M_LILQ","M_LILI","M_LIIQ","M_IDBIL","M_IDBLD","M_IDBW","M_IDBLU","M_MADG","M_MADP","M_MADW","M_MIEM","M_MISP","M_MIEP","M_MICM","M_MISH","M_MOID","M_MOIA","M_MOII","M_MOTU","M_MOAM","M_MOTQ","M_MOAU","M_MOIL","M_ESII","M_ESIL","M_ESIE","M_NALU","M_ESSW","M_NALQ","M_NIQG","M_NIQR","M_NILQ","M_NIPLI","M_NIQF","M_NIPLQ","M_NIQL","M_PGST","M_PGSS","M_PGNS","M_PGLQ","M_PGNW","M_PGQM","M_PARK","M_PARU","M_PARG","M_PARI","M_PARQ","M_QUTI","M_QUNQ","M_QUTL","M_QULQ","M_QUAW","M_QULI","M_QUUT","M_QUUU","M_QUUN","M_QUUF","M_SBQA","M_SBQC","M_SBLP","M_SBQL","M_SBLQ","M_SBLW","M_PRSC","M_SUNIW","M_PRSN","M_SUNNW","M_PRCS","M_PRSI","M_SUNQW","M_PRSP","M_TRUE","M_TRUD","M_TRUL","M_TRTL","M_TRUQ","M_TRTW","M_TAQL","M_TAQD","M_UTHD","M_UTQH","M_UTIHL","M_UTHQ","M_UTLS","M_UTIHQ","M_UTQS","M_UTIHU","M_UTLH","M_UTIHP","M_UTQM","M_UTLLA","M_UTQU","M_UTIHC","M_UTLW","M_UNLF","M_UNLU","M_UNLQ","M_UNLD","M_UNLM","M_UNLI","M_UNLW","M_YELG","M_YELR","M_YELL","M_YELF","M_YESQ","M_YELN","M_YELI","M_YELW","M_ADX6","M_ADXE","M_AD9X","M_AXLO","M_AXLN","M_IDTX","M_IDTV","M_BOTA","M_BOXV","M_BOAM","M_BOI1","M_BOIT","M_BOID","M_BNSM","M_BNSU","M_CAAX","M_CARX","M_DSXT","M_DSTA","M_DSAX","M_EDWX","M_EDLX","M_FRIX","M_FRLX","M_INIX","M_INDX","M_HDCTA","M_HDTT","M_HDCTT","M_LTTV","M_LTTA","M_HSTX","M_HSTV","M_ICQX","M_ICLX","M_ICLA","M_ICLW","M_ITIY","M_ITIQ","M_INTN","M_INTD","M_JMTA","M_JMTX","M_KOTX","M_KOAX","M_LIMX","M_LIFX","M_MADB","M_MADK","M_MIAX","M_MIRX","M_MOIP","M_MOIT","M_NJES","M_NJEL","M_ESEV","M_ESEO","M_NITC","M_NITS","M_NISX","M_PGAU","M_PGAL","M_PARA","M_QUTA","M_QUNX","M_QUTS","M_QUTX","M_SBNL","M_SBVU","M_SBTE","M_SBTN","M_SBTA","M_SBTL","M_SBLU","M_SBLF","M_SBLN","M_SBLV","M_SBLT","M_SBLL","M_SBLO","M_SBLY","M_SBUT","M_SBXU","M_SAML","M_SHRG","M_SHRO","M_SUVY","M_SUNS","M_PRLT","M_PRIX","M_SUTU","M_SUTF","M_SUTC","M_SUTI","M_SULU","M_SULF","M_SULC","M_SULI","M_SUXL","M_SUXM","M_SUXA","M_SUXD","M_SULT","M_SULL","M_SULA","M_SULD","M_TAAX","M_TATX","M_TASH","M_TARX","M_UTUX","M_UTYX","M_UNLG","M_UNNM","M_WOCS","M_WOCT","M_ZERO","M_ADINM","M_ADGM","M_ADIMO","M_ADTGO","M_ADOU","M_ADTOY","M_ADTQU","M_ADITL","M_ADTQC","M_ADI1Q","M_ADI1V","M_ADIQ0","M_ADI31","M_ADI3E","M_ADI3O","M_ADI3B","M_ADIE3","M_ADI3I","M_AXIG","M_AXIS","M_AXQB","M_AXOB","M_AXGB","M_AXBV","M_AXGY","M_AXGQ","M_AXHQ","M_AXQ0","M_AXDW","M_AX1O","M_AXIUD","M_AXIUE","M_AXIUN","M_IDFUY","M_IDFUS","M_IDFQY","M_IDFU1","M_IDFU0","M_BAN0","M_BNUB","M_BNUR","M_BABQ","M_DSGL","M_DSGO","M_DSPC","M_DSPGB","M_DSWV","M_DSPGI","M_DSUX","M_DSUS","M_DSUY","M_DSWC","M_DSWL","M_DSWA","M_DSWE","M_DSWD","M_DSWN","M_DSWM","M_DSWR","M_DSWI","M_EDAS","M_EDSH","M_EDLH","M_EDGI","M_EDES","M_EDIH","M_FRSA","M_FRQC","M_FRSS","M_FREK","M_FRFW","M_FREL","M_FRFO","M_FRFU","M_FRRT","M_HDWV","M_HSAS","M_HSCJ","M_HSAA","M_HSRB","M_HSRA","M_HSCZ","M_HSGO","M_HSGL","M_HSCK","M_HSGE","M_HSGQ","M_HSGW","M_ICPL","M_ICPV","M_ICCWB","M_ICSB","M_ICCGI","M_ICCGP","M_ICIX1","M_ICIX0","M_ICIW0","M_ICPSQ","M_ICCAW","M_ICCYW","M_ICCSY","M_ICCSB","M_ICISP","M_INQ1","M_INVSD","M_INVSI","M_INWV","M_INOQ","M_INCY","M_INVSV","M_INOY","M_INNU","M_INVSR","M_KOGO","M_KOGB","M_KOTGL","M_KOBV","M_KOBW","M_KOOV","M_KOTII","M_KOTIK","M_KOTIE","M_KOS1","M_MARP","M_MARS","M_MAAM","M_MIGO","M_MISX","M_MIHE","M_MINA","M_MIR0","M_MOLK","M_MOT1","M_MOTA","M_NAVA","M_NAVU","M_NIDJ","M_NIJP","M_NIAJ","M_NIJD","M_NIWY","M_NIWQ","M_NIPNY","M_NIUQ","M_NIUS","M_NIPAT","M_PGEA","M_PGGI","M_PGGB","M_SBPQ","M_SBIIY","M_SBIIO","M_SUNGB","M_SUNGO","M_SUDMG"]}' \
//  --compressed



