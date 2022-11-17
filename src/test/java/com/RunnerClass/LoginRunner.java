package com.RunnerClass;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Singa\\Downloads\\Eclipse\\workspace\\CucumberSample\\src\\test\\resources\\Feature\\login.feature"
,glue="com.LoginStepDefinition",monochrome=true)
public class LoginRunner {

	
		
		
	}

}
