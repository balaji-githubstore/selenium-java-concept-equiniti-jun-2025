package com.eq.advance;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Demo5Options {

	public static void main(String[] args) {
		
		//set the pre-settings for chrome
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
//		options.addArguments("--headless");
		options.addArguments("--disable-notifications");
		
		Map<String, String> prefs = new HashMap<String, String>();
		prefs.put("download.default_directory", "D:\\demo");
		
		options.setExperimentalOption("prefs", prefs);
		
		
		Map<String, String> prefs1 = new HashMap<String, String>();
		prefs1.put("deviceName", "Pixel 7");
		options.setExperimentalOption("mobileEmulation", prefs1);
		

		WebDriver driver = new ChromeDriver(options);
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.irctc.co.in/nget/train-search");
		
		
		System.out.println(driver.getTitle());
		
//		driver.quit();

	}
}
