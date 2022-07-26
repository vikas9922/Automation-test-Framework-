package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.pageobject.SignInPOM;
import com.utility.Base_Class;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_VerifyBCportalSignin extends Base_Class{
	//public static WebDriver driver;
	//SignInPOM signin=PageFactory.initElements(driver, SignInPOM.class);
	@Test
	public void Verifysignin_invaliddata() {
	/*	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://solana-portal.dev.edgevana.com/#/signin");
		driver.manage().window().maximize();
		
		/*	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vikasjadhav");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vikas2123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000);
		*/
		//driver.get("https://solana-portal.dev.edgevana.com/#/signin");
		SignInPOM signin=PageFactory.initElements(driver, SignInPOM.class);
	signin.gettxt_username().sendKeys("vikasjadhav");
	signin.gettxt_password().sendKeys("vikasjadhav");
	signin.getbtn_signin().click();
		
		
		
	//	driver.close();
	}
	
	@Test
	public void Verifysignin_validdata() throws InterruptedException   {
	/*	WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://solana-portal.dev.edgevana.com/#/signin");
		driver.manage().window().maximize();
		/* driver.findElement(By.xpath("//input[@type='text']")).sendKeys("vikasjadhav");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Vikas@9922");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(10000); */
		
	//	driver.get("https://solana-portal.dev.edgevana.com/#/signin");
		SignInPOM signin=PageFactory.initElements(driver, SignInPOM.class);
		signin.gettxt_username().sendKeys("vikasjadhav");
		signin.gettxt_password().sendKeys("Vikas@9922");
		signin.getbtn_signin().click();
		//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(driver,200);
	//wait.until(VisibilityOfElement)
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@download='Solana-Foundation.csv']")));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;  
	js.executeScript("window.scrollBy(0,700)", "");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//a[@download='Solana-Foundation.csv']")).click();
		//String curl=driver.getCurrentUrl();
		//System.out.println(curl);
		//Thread.sleep(20000);
		//driver.close();
	
	 WebElement element;
     Thread.sleep(30000);
   element = driver.findElement(By.xpath("//a[@download='Solana-Foundation.csv']"));
     element.click();
	
   //  signin.getbtn_download().click();
     
	Thread.sleep(5000);
	//driver.close();
	
     driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	}
	
	
}
