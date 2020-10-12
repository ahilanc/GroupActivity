package com.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.Scenario;



public class BaseClass {
	public static WebDriver driver;
	public static Select s;
	public static Scenario scenario;

	public void initialize(Scenario scenario) {
        this.scenario = scenario;
    }
	
    public static WebDriver getCurrentDriver() {
        WebDriver driver = PoDriverClass.poGetDriver();
        PoDriverClass.poSetDriver(driver);
        return driver;
    }
	
	public static void takeScreenshot(String name) {
		try {
			WebDriver driver = getCurrentDriver();
			if (driver instanceof TakesScreenshot) {
			TakesScreenshot screenshotAbleDriver = (TakesScreenshot) driver;
			try {
			byte[] screenshot = screenshotAbleDriver.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, name +"_image/png");
			} catch (WebDriverException somePlatformsDontSupportScreenshots) {
			System.out.println("Unable to take screenshot"+somePlatformsDontSupportScreenshots.getMessage());
			}
			}
			} catch (Exception e) {
			e.printStackTrace();
			}
	}

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void selectValue(WebElement element, String text) {
		s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void screenshot(String name) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("output\\" + name + ".png");
		try {
			FileUtils.copyFile(source, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getText(WebElement element) {
		String checkVal = null;
		try {
			checkVal = element.getText();
			if (!checkVal.equals("null")) {
				System.out.println(checkVal);
			} else {
				Assert.fail("Check value is shown as null");
			}
		} catch (Exception e) {
			System.out.println("Check value is shown as null " + e.getMessage());
		}
		return checkVal;
	}

	public static void isDisplay(WebElement element) {
		boolean value = element.isDisplayed();
		if (value == true) {
			System.out.println("Desired Value is Displayed");
		} else {
			System.out.println("Desired Value is not Displayed");
		}
	}

	public static void closeBrowser() {
		driver.quit();
	}

	public static void assertEquals(String expected, String actual) {
		Assert.assertEquals(expected, actual);
	}

	public static void comparator(String expected, String actual) {
		boolean equals = expected.equals(actual);
		if (equals == true) {
			System.out.println("Expected result is matching with actual...");
		} else {
			System.out.println("Mismatch in expeccted result...");
		}
	}

}
