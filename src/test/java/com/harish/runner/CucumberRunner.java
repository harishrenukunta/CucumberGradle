package com.harish.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features/",
            glue="com.harish.stepdefs",
            plugin = {"pretty", "json:target/cucumberReports/json/cucumber.json", "html:target/cucumberReports/html/index.html"})
public class CucumberRunner {
}
