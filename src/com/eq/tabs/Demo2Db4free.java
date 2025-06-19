package com.eq.tabs;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Db4free {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.db4free.net/");

		//click on phpMyAdmin »
		//b[contains(text(),'phpMyAdmi')]
		driver.findElement(By.partialLinkText("phpMyAdmin")).click();
		
		//switch to second tab
		ArrayList<String> windows=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		//enter username as admin
		driver.findElement(By.id("input_username")).sendKeys("admin");
		//enter password as admin123
		driver.findElement(By.id("input_password")).sendKeys("admin233");
		//click on login
		driver.findElement(By.id("input_go")).click();
		
		String actualError= driver.findElement(By.id("pma_errors")).getText();
		System.out.println(actualError);
		
		
		String actualError1= driver.findElement(By.xpath("//div[contains(text(),'Access')]")).getText();
		System.out.println(actualError1);
		
		driver.close(); //check what happens? 
		
		driver.switchTo().window(windows.get(0));
		
		System.out.println(driver.getTitle());
		
		driver.quit();
	}

}






