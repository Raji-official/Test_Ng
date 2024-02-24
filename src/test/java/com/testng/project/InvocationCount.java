package com.testng.project;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test
	private void Browser_launch() {
System.out.println("browser");
	}
	
	@Test(invocationCount = 3)
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
