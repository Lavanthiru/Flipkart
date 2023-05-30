package com.facebook;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".\\src\\test\\resources\\Facebook.feature",
                  glue="com.facebook",
                  dryRun = false,
                 
                  plugin = {"html:target", "json:target/report.json"},
                  monochrome= true
                  )
public class TestRunner {

}
