package com.test;

import org.junit.Before;
import org.junit.BeforeClass;

public class YahooOne {

	@BeforeClass
	public static void OpenBrowser(){
		System.out.println("OpenBrowser");
	}
	@Before
	public void LogIn(){
		System.out.println("login");
	}

	}


