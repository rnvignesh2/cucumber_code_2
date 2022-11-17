package com.StepDefinition;

import com.base.BaseClass;

public class roughs extends BaseClass {
	
	public static void main(String[] args) {
		
		browser("https://www.fb.com/");
		locatorWeb("id", "email").sendKeys("vicky");
	}

}
