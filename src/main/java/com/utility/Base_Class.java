package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {
public static	WebDriver driver;
public static ConfigDataProvider config;

@BeforeSuite 
public void bc () throws Exception {
	ConfigDataProvider config =new ConfigDataProvider();
}
	
	@BeforeMethod
	public void browseropen() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		//driver.get(config.getdevurlbcportal());
		driver.get("https://solana-portal.dev.edgevana.com/#/signin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void browserclose() {
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.close();
	}
	
	
	
}
