package com.Reports;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportGeneration {

	public static void reportGenerate(String json) {
		
		File f=new File("./Reports/");
		
		Configuration config = new Configuration(f, "adactin login page");
		config.addClassifications("Browser", "chrome");
		config.addClassifications("os", "windows");
		config.addClassifications("user", "vicky");
		config.addClassifications("osversion", "10");

		List li=new LinkedList();
		li.add(json);
		ReportBuilder r=new ReportBuilder(li,config);
		
	}
}
