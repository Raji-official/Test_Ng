package com.testng.project;

import org.testng.annotations.Test;

public class Prioritytest {

	@Test(priority = 3)
	private static void Browser_launch() {
System.out.println("browser");
	}
	@Test(priority = 2)
	private static void login() {
		// TODO Auto-generated method stub
		System.out.println("login");
	}

	@Test(priority = 1)
	private static void searchproduct() {
		System.out.println("searchproduct");
	}
	@Test(priority = 4)
	private static void orderconfirm() {
		System.out.println("orderconfirm");
	}
	public static void main(String[] args) {
		Browser_launch();
		login();
		searchproduct();
		orderconfirm();
	}
	
}
