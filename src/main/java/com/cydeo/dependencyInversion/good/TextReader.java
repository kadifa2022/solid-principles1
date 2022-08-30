package com.cydeo.dependencyInversion.good;

public class TextReader implements Reader{
    @Override
    public String getUserName() {
        return "m";
    }
}
