package com.Automation.Worksop;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Interviwe1 {
	
	@BeforeSuite
	public void suite() {
		System.out.println("suite");
	}
	@BeforeMethod
	
	public void before() {
		System.out.println("Before");
	}
	
	@Test
	
	public void test1() {
	
		System.out.println("test1");
	}
@Test
	
	public void test2() {
	
		System.out.println("test2");
	}
@Test

public void test3() {

	System.out.println("test3");
}

public void m() {
	System.out.println("HII jalda");
}



}
