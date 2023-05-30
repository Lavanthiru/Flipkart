package com.facebook;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import com.facebook.commonaction.CommonFunction;

import cucumber.api.Scenario;
import io.cucumber.java.Before;






public class Hooks {

	CommonFunction s = CommonFunction.getInstance();
	@Before
	public void launch(Scenario scenario) {
		s.browserLaunch();
		
	}
	
	

	}

