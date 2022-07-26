package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPOM {
WebDriver driver;
@FindBy(how=How.XPATH,using="//input[@type='text']")
private WebElement txt_username;
	
@FindBy(how=How.XPATH,using="//input[@type='password']")
private WebElement txt_password;
	
@FindBy(how=How.XPATH,using="//button[@type='submit']")
private WebElement btn_signin;

@FindBy(how=How.XPATH,using="//a[@download='Solana-Foundation.csv']")
private WebElement btn_download;
	
public SignInPOM(WebDriver driver) {
	this.driver=driver;
}

public WebElement gettxt_username() {
	return txt_username;
	
}

public WebElement gettxt_password() {
	return txt_password;
	
}

public WebElement getbtn_signin() {
	return btn_signin;
}
public WebElement getbtn_download() {
	return btn_download;
}

}
