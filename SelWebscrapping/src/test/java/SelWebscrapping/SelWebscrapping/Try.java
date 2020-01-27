package SelWebscrapping.SelWebscrapping;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try {

	public void tryy(){
		
		System.setProperty("webdriver.chrome.driver", "D://Dineshkumar//07_Personal//AutomationLearn//SelWebscrapping//Resources//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://chromedriver.storage.googleapis.com/index.html?path=80.0.3987.16/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td[2]/a")).click();
		
	}
}
