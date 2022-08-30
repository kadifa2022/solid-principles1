package com.cydeo.dependencyInversion.good;

public class JSONReader implements Reader{
    @Override
    public String getUserName() {
        return " {\" userName}";
    }
}
