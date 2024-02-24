package com.testng.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametererized_Constructor {
	public static WebDriver driver;

	@BeforeClass
	public static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@BeforeMethod
	public static void getUlr() {
		driver.get("https://www.adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@Parameters({ "username", "password" })
	@Test
	private static void login(String Uname, String Pword) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(Uname);
		driver.findElement(By.id("password")).sendKeys(Pword);
		driver.findElement(By.id("login")).click();

	}
}
