package com.harish.stepdefs;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = {com.harish.Config.TestConfig.class})
public class BaseStep {
}
