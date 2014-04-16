package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FacebookRegistration {
	

 @Test
 public void registration(){
	 System.out.println("Test registration");
 }
	@Test
	public void infix(){
		System.out.println("infix");
	}
	@Test
	public void inbox(){
		System.out.println("Test inbox");
	}
	@Before
	public void testStart(){
		System.out.println("Before");	
	}
	@After
	public  void testFinish(){
		System.out.println("After");
		
	}
	@AfterClass
	public static void browserClass(){
		System.out.println("AfterClass");
	}
	@BeforeClass
	public static void openBrowser(){
		
	}
	}


