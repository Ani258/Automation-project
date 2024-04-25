package org.cap.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestMethod {
	@Test(groups="smoke")
	public void test1() {
		System.out.println("Test");
	}
	@Test(priority=1,groups="smoke")
	public void test10()
	{
		System.out.println("test2");
	}
	@BeforeSuite()
	public void test2() {
		System.out.println("Beforesuite");
	}
	@AfterSuite()
	public void test3() {
		System.out.println("Aftersuite");
	}
	@BeforeClass()
	public void test4() {
		System.out.println("beforeclass");
	}
	@BeforeTest()
	public void test5(){
		System.out.println("beforetest");
		System.out.println("abc");
	}
	
}
