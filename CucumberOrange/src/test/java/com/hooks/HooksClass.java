package com.hooks;

import com.utils.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class HooksClass extends BaseClass{
	
@Before	
public void opening(Scenario sc) {
System.out.println("starting the scenario"+  sc.getName());

}
@After
public void ending(Scenario sc) {
	
	System.out.println("closing the Scenario" + sc.getStatus());
}
}
