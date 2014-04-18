package com.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Google {
@BeforeClass
public static void OpenBrowser() {
	System.out.println("open browser");
}
	@Before
	public void LogIn(){
	System.out.println("log in");
}
	@Test
	public void TestStart(){
		System.out.println("test start");
	}
	@AfterClass
	public static void CloseBrowser(){
		System.out.println("close browser");
	}
	@After
	public void TestFinish(){
		System.out.println("test finish");
	}
	
}



