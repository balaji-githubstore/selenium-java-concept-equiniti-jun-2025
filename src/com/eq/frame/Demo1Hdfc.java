package com.eq.frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//switch to frame using WebElement
public class Demo1Hdfc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		//frame[@name='login_page']
		//frame[contains(@src,'RSNBLogin')]
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
		
		//enter userid as john123
		driver.findElement(By.name("fldLoginUserId")).sendKeys("jack123");
		
		//click on continue
		driver.findElement(By.linkText("CONTINUE")).click();
		
		//switch to main html
		driver.switchTo().defaultContent();
			
		
	}
}
