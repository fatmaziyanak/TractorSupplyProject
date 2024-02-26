package com.hrms.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;

public class BaseClass {

	public static WebDriver driver;

	public static void setUp() {
		
		ConfigsReader.readProperties(Constants.CREDENTIALS_FILEPATH);
		
		switch (ConfigsReader.getProperty("browser").toLowerCase()) {

		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
		//	driver = new ChromeDriver();
			ChromeOptions options = new ChromeOptions();
	//		options.addArguments("--incognito");
	//		options.addArguments("--disable-http2");
	//	options.addArguments("--disable-extensions");
		///	options.addArguments("--blink-settings=imagesEnabled=false");
			
			
			driver = new ChromeDriver(options);
			break;
			//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

		case "firefox":
			System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
			driver = new FirefoxDriver();
			break;
		default:
			System.err.println("Browser is not supported");
		}
		driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_LOAD_TIME, TimeUnit.SECONDS);
		 driver.manage().window().maximize();

		driver.get(ConfigsReader.getProperty("url"));
	}

	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
