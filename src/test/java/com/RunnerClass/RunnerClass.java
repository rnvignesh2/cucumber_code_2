package com.RunnerClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.ReportsJVM;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Singa\\Downloads\\Eclipse\\workspace\\CucumberSample\\src\\test\\resources\\Feature\\Sample.Feature" ,glue="com.StepDefinition",
plugin={"json:./ReportsJVM/adactin.json", "html:./ReportsJVM/adactin","junit:./ReportsJVM/adactin.xml"})
public class RunnerClass {

	@AfterClass
	public static void ReportGenerating() {

		ReportsJVM.reportGeneration("./ReportsJVM/adactin.json");
		
	}
	
}
