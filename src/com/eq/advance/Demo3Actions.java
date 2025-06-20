package com.eq.advance;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo3Actions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.citigroup.com/global/about-us/global-presence/india");

		driver.findElement(By.xpath("//button[text()='Accept All']")).click();

//		driver.findElement(By.xpath("//div[text()='My Account']")).click();

		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//div[text()='My Account']"))).perform();

		driver.findElement(By.xpath("//div[text()='Banking with Citi']")).click();

		// switch to second tab
		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));

	}
}
