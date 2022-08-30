package com.cydeo.dependencyInversion.good;

public class XMLReader implements Reader {

    @Override
    public String getUserName() {
        return "<username>smidt@cydeo.com>";
    }
}
