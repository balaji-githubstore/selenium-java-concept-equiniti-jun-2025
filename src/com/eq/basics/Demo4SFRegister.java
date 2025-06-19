package com.eq.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4SFRegister {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.salesforce.com/in/form/signup/sales-ee/");
		
		//firstname as john
		driver.findElement(By.name("UserFirstName")).sendKeys("john");
		//lastname as wick
		driver.findElement(By.name("UserLastName")).sendKeys("wick");
		//job title as software developer
		driver.findElement(By.name("UserTitle")).sendKeys("Software Developer");
		
		//click on next
		driver.findElement(By.linkText("NEXT")).click();
	
		//select Employees as 21 - 200 employees
		Select selectEmployeeCount=new Select(driver.findElement(By.name("CompanyEmployees")));
		selectEmployeeCount.selectByVisibleText("21 - 200 employees");
		
		driver.findElement(By.name("CompanyName")).sendKeys("Software Developer");
		driver.findElement(By.linkText("NEXT")).click();
		
//		Do not fill the phone number 
		
		driver.findElement(By.name("UserEmail")).sendKeys("Software@gmail.com");
		
		//checkbox
		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();
//		driver.findElement(By.xpath("(//div[@class='checkbox-ui-label'])[2]")).click();

//		Click on start my free trial  
//
//		Get the error message displayed “Enter a valid phone number” 
		
	}
}



