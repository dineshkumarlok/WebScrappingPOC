package SelWebscrapping.SelWebscrapping;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsScrapping {

	public void newsScrapping()
	{
		WritingCSV writecsv = new WritingCSV();
		List<String[]> latestNews = new ArrayList<String[]>();
		latestNews.add(new String[] {"LatestNews"});
		System.setProperty("webdriver.chrome.driver", "D://Dineshkumar//07_Personal//AutomationLearn//SelWebscrapping//Resources//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.moneycontrol.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//ul[@class='clearfix top_newstabs mpMenu']/li[2]/a[@title='Latest']")).click();
		for(int i=1;i<=5;i++){
			String text = driver.findElement(By.xpath("//*[@id='keynwstb2']/ul/li["+i+"]/a")).getText();
			String[] news = {text};
			latestNews.add(news);
		}
		writecsv.fileWrite(latestNews);
	}
	
}
