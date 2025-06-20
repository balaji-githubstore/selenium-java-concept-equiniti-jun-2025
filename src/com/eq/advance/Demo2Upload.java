package com.eq.advance;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2Upload {

	
	public static void main(String[] args) {		
		
		File file=new File("files/demo.txt");
		String absPath= file.getAbsolutePath();
		System.out.println(absPath);
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.ilovepdf.com/pdf_to_word");

		//input[@type='file' and @id='edit-field-audited-balance-sheet-for-0-upload']
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys(absPath);

	}
}
