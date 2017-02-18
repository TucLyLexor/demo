import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import testlink.api.java.client.TestLinkAPIClient;
import testlink.api.java.client.TestLinkAPIException;
import testlink.api.java.client.TestLinkAPIResults;

import java.util.Map;

public class test1 {
	public String URL = "http://shoplexor.mobi/System/Login.aspx";
	public WebDriver driver;

	@Test
	public void demo(){
		String s;
    	s = System.getenv("UserProfile");
    	s = s + "\\Desktop\\git\\Demo\\drivers\\chromedriver.exe";   	
		System.setProperty("webdriver.chrome.driver", s);
		
		driver=new ChromeDriver();
		driver.get(URL);
		driver.findElement(By.id("txt_Username")).sendKeys("TucLy");
		driver.findElement(By.id("txt_Password")).sendKeys("abc123");
		driver.findElement(By.id("btn_Login")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_A27\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_HyperLink2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_hyl_Supports\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_A2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ctl00_A10\"]")).click();
		driver.quit();
		}
	}