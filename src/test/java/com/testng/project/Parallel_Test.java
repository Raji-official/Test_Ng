package com.testng.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_Test {
public static WebDriver driver;
	
	@Test
	private static void facebook()
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		
	}
	
	@Test
	private static void instagram()
	{
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.instagram.com/");
		
	}
}
