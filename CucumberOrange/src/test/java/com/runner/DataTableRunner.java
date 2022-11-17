package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.Reports.ReportGeneration;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Singa\\Downloads\\Eclipse\\workspace\\CucumberOrange\\src\\test\\resources\\DataTable.feature",
glue="com.DataTableStepDefinition",
monochrome = true,
plugin= "json:./Reports/Login.json")
public class DataTableRunner {

	@AfterClass
	public static void FinalReport() {

		ReportGeneration.reportGenerate("./Reports/Login.json");
		
	
}}
