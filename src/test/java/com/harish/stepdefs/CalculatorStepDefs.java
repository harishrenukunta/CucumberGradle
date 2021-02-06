package com.harish.stepdefs;

import io.cucumber.java.en.Given;

public class CalculatorStepDefs extends BaseStep{


    @Given("^user has access to calculator$")
    public void givenUserHasAccess(){
        System.out.println("Step defs:User has access to calculator");
    }

}
