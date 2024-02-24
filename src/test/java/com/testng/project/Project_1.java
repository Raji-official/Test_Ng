package com.testng.project;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Project_1{
	
	@Test
	private void Browser_launch() {
System.out.println("browser");
	}
	@Test(expectedExceptions = ArithmeticException.class)
	private void login() {
		// TODO Auto-generated method stub
		int a=10;
		System.out.println(a/0);
		System.out.println("login");
		
	}
//	@Ignore

	@Test(enabled = true)
	private void searchproduct() {
		System.out.println("searchproduct");
	}
	@Test
	private void orderconfirm() {
		System.out.println("orderconfirm");
	}
	
	

}
