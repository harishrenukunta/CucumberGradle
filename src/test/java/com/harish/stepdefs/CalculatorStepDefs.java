package com.harish.stepdefs;

import com.harish.services.CalculatorService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CalculatorStepDefs extends BaseStep{

    private final CalculatorService calculatorService;

    @Given("^user has access to calculator$")
    public void givenUserHasAccess(){
        System.out.println("Step defs:User has access to calculator");
    }

    @When("^add (.*) and (.*)$")
    public void addTwoNumber(final int a, final int b){
        int result = calculatorService.add(a, b);
        System.out.println("Result:" + result);
    }

}
