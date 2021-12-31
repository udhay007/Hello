package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selinium {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\udhayvino\\eclipse-workspace\\Hello\\Driver\\chromedriver.exe");
	
	WebDriver driver =new ChromeDriver();
	
	
	
	driver.get("https://www.instagram.com/accounts/login/");
	
	
	
	driver.manage().window().maximize();
	
	String title = driver.getTitle();
	System.out.println(title);
	
	String currentUrl = driver.getCurrentUrl();
	System.out.println(currentUrl);
	
	
	
}
}
