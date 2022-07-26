package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	public static Properties pro;
	public ConfigDataProvider () throws Exception  {
		String path= "C:\\Users\\Vikas jadha\\eclipse-workspace\\Framework_Edgevana_B\\Config\\Config.properties";
		FileInputStream fis=new FileInputStream(path);
		Properties pro=new Properties();
		pro.load(fis);
		
	}
public String getusername() {
	return pro.getProperty("username");
	
}
	
public String getpassword() {
	return pro.getProperty("password");}


public String getdevurlbcportal() {
	return pro.getProperty("devurlbcportal");
}
	
}
	

