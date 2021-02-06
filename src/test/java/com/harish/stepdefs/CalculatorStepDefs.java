package com.harish.stepdefs;

import com.harish.services.CalculatorService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;

import static org.assertj.core.api.Assertions.assertThat;

@RequiredArgsConstructor
public class CalculatorStepDefs extends BaseStep{

    private final CalculatorService calculatorService;
    private int result;

    @Given("^user has access to calculator$")
    public void givenUserHasAccess(){
        System.out.println("Step defs:User has access to calculator");
    }

    @When("^(add|substract) (.*) and (.*)$")
    public void addTwoNumber(final String operation, final int a, final int b){
        switch(operation){
            case "add":
                result = calculatorService.add(a, b);
                break;
            case "substract":
                result = calculatorService.substract(a, b);
                break;
        }
    }

    @Then("verify addition of two numbers in calculator is {int}")
    public void verifyCalculatorResult(final Integer expectedResult){
        assertThat(result)
                .as("Addition of two numbers should be same as expected")
                .isEqualTo(expectedResult.intValue());
    }

}
