package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Singa\\Downloads\\Eclipse\\workspace\\CucumberOrange\\src\\test\\resources\\orange.feature",glue={"com.stepDefinition","com.hooks"},monochrome=true)
public class RunnerClass {

}
