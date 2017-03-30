package com.bit.basepackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	  WebDriver driver;
	public void getBrowser() throws IOException{
		
		DOMConfigurator.configure("log4j.xml");
		FileInputStream st=new FileInputStream("browser.properties");
		Properties p= new Properties();
		p.load(st);
		if (p.getProperty("browser").equals("Firefox")){
			driver= new FirefoxDriver();
		}
		else if(p.getProperty("browser").equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Likhon\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(p.getProperty("browser").equals("iedriver"));
		
		
	}

}
