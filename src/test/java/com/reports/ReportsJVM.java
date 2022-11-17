package com.reports;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class ReportsJVM {
	
	public static void reportGeneration(String json) {

		File f=new File("./ReportsJVM/");
	Configuration config=new Configuration(f, "Adactin login validation");
		config.addClassifications("Browser", "chrome");
		config.addClassifications("platform", "windows");
		config.addClassifications("osversion", "windows10");
		config.addClassifications("user", "vicky");

List<String> li=new LinkedList<String>();
li.add(json);

ReportBuilder  r = new ReportBuilder(li, config);
r.generateReports();
		
	}

}
