package com.instarem.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.instarem.data.TestCases;

public class App {
	WebDriver driver;
	TestCases test = new TestCases();

	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\chrome\\chromedriver.exe");
		GetDriver.driver = new ChromeDriver();

		GetDriver.driver.manage().timeouts()
				.implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(priority = 1)
	public void getAllImages() {

		test.getImages();

	}

	@Test(priority = 2)
	public void Malaysia() {

		test.malaysiaBankData();

	}

	@AfterTest
	public void end() {
		GetDriver.driver.quit();
	}

}
