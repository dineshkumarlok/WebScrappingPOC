package SelWebscrapping.SelWebscrapping;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelScrapping {

	//Scraping Data for a Particular Search key and returns Scrapped data as String Array
	public String[] selScrapping(String searchKey){
		
		//Opens Browser and navigate to corresponding website
		System.setProperty("webdriver.chrome.driver", "D://Dineshkumar//07_Personal//AutomationLearn//SelWebscrapping//Resources//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.moneycontrol.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try{
			
			//Input search key and Search result is displayed
			driver.findElement(By.xpath("//input[@id= 'search_str']")).sendKeys(searchKey);
			WebElement searchLocation1 = driver.findElement(By.xpath("//div[@class='jspPane']/li[1]/a"));
			System.out.println("searchLocation1"+searchLocation1);
			searchLocation1.click();
			System.out.println("searchLocation1"+searchLocation1);
			searchLocation1.click();
			/*WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver, 60).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='autosuggestlist']/ul/div/div/li[1]/a")));
			driver.findElement(By.xpath("//*[@id='autosuggestlist']/ul/div/div/li[1]/a")).click();*/ 
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Fetching each Result data as text and store it in string values
			String Title = driver.findElement(By.xpath("//h1[@class='pcstname']")).getText();
			System.out.println(Title);
			String BSE = driver.findElement(By.xpath("//p[@class='bsns_pcst']/ctag[@class='mob-hide']/span[1]")).getText();
			System.out.println(BSE);
			String NSE = driver.findElement(By.xpath("//p[@class='bsns_pcst']/ctag[@class='mob-hide']/span[2]")).getText();
			System.out.println(NSE);
			String ISIN = driver.findElement(By.xpath("//p[@class='bsns_pcst']/span[1]")).getText();
			System.out.println(ISIN);
			String SECTOR = driver.findElement(By.xpath("//p[@class='bsns_pcst']/span[@class='mob-hide']")).getText();
			System.out.println(SECTOR);
			String BSElive = driver.findElement(By.xpath("//div[@class='bsedata_bx']/div[@class='nsbs_bg']/div[@class='clearfix']/div[@class='pcnsb div_live_price_wrap']")).getText();
			System.out.println(BSElive);
			String NSElive = driver.findElement(By.xpath("//div[@class='nsedata_bx']/div[@class='nsbs_bg']/div[@class='clearfix']/div[@class='pcnsb div_live_price_wrap']")).getText();
			System.out.println(NSElive);
			String BSEpervClose = driver.findElement(By.xpath("//div[@class='bsedata_bx']/div[@class='clearfix mkt_openclosebx']/div[@class='open_lhs1']/ul[@class='clearfix op_list']/li[1]/p[2]")).getText();
			System.out.println(BSEpervClose);
			String BSEopenPrice = driver.findElement(By.xpath("//div[@class='bsedata_bx']/div[@class='clearfix mkt_openclosebx']/div[@class='open_lhs1']/ul[@class='clearfix op_list']/li[2]/p[2]")).getText();
			System.out.println(BSEopenPrice);
			String BSEbidPrice = driver.findElement(By.xpath("//div[@class='bsedata_bx']/div[@class='clearfix mkt_openclosebx']/div[@class='open_lhs2']/ul[@class='clearfix op_list']/li[1]/p[2]")).getText();
			System.out.println(BSEbidPrice);
			String BSEofferPrice = driver.findElement(By.xpath("//div[@class='bsedata_bx']/div[@class='clearfix mkt_openclosebx']/div[@class='open_lhs2']/ul[@class='clearfix op_list']/li[2]/p[2]")).getText();
			System.out.println(BSEofferPrice);
			String NSEpervClose = driver.findElement(By.xpath("//div[@class='nsedata_bx']/div[@class='clearfix mkt_openclosebx']/div[@class='open_lhs1']/ul[@class='clearfix op_list']/li[1]/p[2]")).getText();
			System.out.println(NSEpervClose);
			String NSEopenPrice = driver.findElement(By.xpath("//div[@class='nsedata_bx']/div[@class='clearfix mkt_openclosebx']/div[@class='open_lhs1']/ul[@class='clearfix op_list']/li[2]/p[2]")).getText();
			System.out.println(NSEopenPrice);
			String NSEbidPrice = driver.findElement(By.xpath("//div[@class='nsedata_bx']/div[@class='clearfix mkt_openclosebx']/div[@class='open_lhs2']/ul[@class='clearfix op_list']/li[1]/p[2]")).getText();
			System.out.println(NSEbidPrice);
			String NSEofferPrice = driver.findElement(By.xpath("//div[@class='nsedata_bx']/div[@class='clearfix mkt_openclosebx']/div[@class='open_lhs2']/ul[@class='clearfix op_list']/li[2]/p[2]")).getText();
			System.out.println(NSEofferPrice);
			driver.close();
			
			//Assigning All data in a string Array and return it.
			String[] csvData = {Title,BSE,NSE,ISIN,SECTOR,BSElive,NSElive,BSEpervClose,BSEopenPrice,BSEbidPrice,BSEofferPrice,NSEpervClose,NSEopenPrice,NSEbidPrice,NSEofferPrice};
			return csvData;
		}catch(Exception e)
		{
			System.out.println("--------Exe------"+e);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			String Title = driver.findElement(By.xpath("//h1[@class='pcstname']")).getText();
			System.out.println(Title);
			String BSE = driver.findElement(By.xpath("//p[@class='bsns_pcst']/ctag[@class='mob-hide']/span[1]")).getText();
			System.out.println(BSE);
			String NSE = driver.findElement(By.xpath("//p[@class='bsns_pcst']/ctag[@class='mob-hide']/span[2]")).getText();
			System.out.println(NSE);
			String ISIN = driver.findElement(By.xpath("//p[@class='bsns_pcst']/span[1]")).getText();
			System.out.println(ISIN);
			String SECTOR = driver.findElement(By.xpath("//p[@class='bsns_pcst']/span[@class='mob-hide']")).getText();
			System.out.println(SECTOR);
			String BSElive = driver.findElement(By.xpath("//div[@class='bsedata_bx']/div[@class='nsbs_bg']/div[@class='clearfix']/div[@class='pcnsb div_live_price_wrap']")).getText();
			System.out.println(BSElive);
			String NSElive = driver.findElement(By.xpath("//div[@class='nsedata_bx']/div[@class='nsbs_bg']/div[@class='clearfix']/div[@class='pcnsb div_live_price_wrap']")).getText();
			System.out.println(NSElive);
			String BSEpervClose = driver.findElement(By.xpath("//div[@class='bsedata_bx']/div[@class='clearfix mkt_openclosebx']/div[@class='open_lhs1']/ul[@class='clearfix op_list']/li[1]/p[2]")).getText();
			System.out.println(BSEpervClose);
			String BSEopenPrice = driver.findElement(By.xpath("//div[@class='bsedata_bx']/div[@class='clearfix mkt_openclosebx']/div[@class='open_lhs1']/ul[@class='clearfix op_list']/li[2]/p[2]")).getText();
			System.out.println(BSEopenPrice);
			String BSEbidPrice = driver.findElement(By.xpath("//div[@class='bsedata_bx']/div[@class='clearfix mkt_openclosebx']/div[@class='open_lhs2']/ul[@class='clearfix op_list']/li[1]/p[2]")).getText();
			System.out.println(BSEbidPrice);
			String BSEofferPrice = driver.findElement(By.xpath("//div[@class='bsedata_bx']/div[@class='clearfix mkt_openclosebx']/div[@class='open_lhs2']/ul[@class='clearfix op_list']/li[2]/p[2]")).getText();
			System.out.println(BSEofferPrice);
			String NSEpervClose = driver.findElement(By.xpath("//div[@class='nsedata_bx']/div[@class='clearfix mkt_openclosebx']/div[@class='open_lhs1']/ul[@class='clearfix op_list']/li[1]/p[2]")).getText();
			System.out.println(NSEpervClose);
			String NSEopenPrice = driver.findElement(By.xpath("//div[@class='nsedata_bx']/div[@class='clearfix mkt_openclosebx']/div[@class='open_lhs1']/ul[@class='clearfix op_list']/li[2]/p[2]")).getText();
			System.out.println(NSEopenPrice);
			String NSEbidPrice = driver.findElement(By.xpath("//div[@class='nsedata_bx']/div[@class='clearfix mkt_openclosebx']/div[@class='open_lhs2']/ul[@class='clearfix op_list']/li[1]/p[2]")).getText();
			System.out.println(NSEbidPrice);
			String NSEofferPrice = driver.findElement(By.xpath("//div[@class='nsedata_bx']/div[@class='clearfix mkt_openclosebx']/div[@class='open_lhs2']/ul[@class='clearfix op_list']/li[2]/p[2]")).getText();
			System.out.println(NSEofferPrice);
			driver.close();
			String[] csvData = {Title,BSE,NSE,ISIN,SECTOR,BSElive,NSElive,BSEpervClose,BSEopenPrice,BSEbidPrice,BSEofferPrice,NSEpervClose,NSEopenPrice,NSEbidPrice,NSEofferPrice};
			return csvData;
		}

	}
}
