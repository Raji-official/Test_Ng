package com.testng.project;

import org.testng.annotations.Test;

public class Group_Test {
	
	@Test(groups="iphone")
	private void iphone_order_placement()
	{
		System.out.println("iphone_order_placement");
	}
	@Test(groups="samsung")
	private void samsaung_Order_Placemant() 
	{
       System.out.println("samsaung_Order_Placemant"); 
	}
	@Test(groups= {"mobile with accessory"})
	private void ipone_With_One_Accessory_Plcement() 
	{
       System.out.println("iphone_With_One_Accessory_Plcement");
	}
	@Test(groups= {"mobile with accessory"})
	private void iphone_With_Two_Accessory_Placement() 
	{
       System.out.println("iphone With_Two_Accessory_Placement");
	}
	@Test(groups={"mobile with accessory"})
	private void samsung_With_One_Accessory_Plcement() 
	{
       System.out.println("_With_One_Accessory_Plcement");
	}
	@Test(groups= {"mobile with accessory"})
	private void samsung_With_two_Placement() 
	{
      System.out.println("_With_two_Placement");
	}
	
}
