package com.testng;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterapp {
	
	@Test
	public void Loginapp() {
		System.out.println("login method 1");
	}
	
	@Test
	public void searchKey() {
		System.out.println("search method 2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	

}
