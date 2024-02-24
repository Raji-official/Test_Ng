package com.testng.project;

import org.testng.annotations.Test;

public class Timeout {
	@Test
	private void Browser_launch() {
System.out.println("browser");
	}
	 
	@Test(timeOut = 5000)
	private void login() {
		// TODO Auto-generated method stub
		System.out.println("login");
	}
	
	@Test
	private void searchproduct() {
		System.out.println("searchproduct");
	}
	@Test
	private void orderconfirm() {
		System.out.println("orderconfirm");
	}
	

}
								