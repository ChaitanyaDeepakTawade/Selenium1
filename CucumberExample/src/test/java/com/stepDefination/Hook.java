package com.stepDefination;

import io.cucumber.java.Before;
import io.cucumber.java.After;

//it is Backgrond . it is also called as external Hook
/*
 * @author Chaitnya Deepak Tawade (Expleo Pune)
 * @sign JDK-1.7 12/09/2023
 * */
public class Hook {
	@Before
	public void before() {
		System.out.println("Before ---------------------");
	}
	
	@After
	public void After() {
		System.out.println("After ---------------------");
	}
	

}
