package com.harish.stepdefs;

import com.harish.enums.Operation;
import io.cucumber.java.ParameterType;

public class CustomTypes {

    @ParameterType("add|substract|multiply|divide")
    public Operation operation(final String op){
        return Operation.getOperationByType(op);
    }
}
