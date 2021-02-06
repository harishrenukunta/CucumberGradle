package com.harish.stepdefs;

import io.cucumber.java.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CucumberSteps {

    @BeforeStep
    public void beforeStep(){
        log.info("Step def: before step");
    }

    @AfterStep
    public void afterStep(){
        log.info("Step def: after step");
    }

    @Before
    public void beforeScenario(final Scenario scenario){
        log.info("Step def: before Scenario:" + scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario){
        log.info("Step def: after Scenario:id:" + scenario.getId());
        final String result = scenario.isFailed() ? "fail" : "pass";
        log.info("Step def: after scenario:result : " + result);
    }
}
