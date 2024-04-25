package org.cap.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class AppTest {
	
	@AfterMethod(groups="smoke")
	public void test6() {
		System.out.println("aftermethod");
	}
	@AfterTest()
	public void test7() {
		System.out.println("aftertest");
	}
	@BeforeMethod(groups="regression")
	public void test8() {
		System.out.println("beforemethod");
	}
	@AfterClass()
	public void test9() {
		System.out.println("afterclass");
	}
}
