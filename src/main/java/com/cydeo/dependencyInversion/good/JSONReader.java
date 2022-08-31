package com.cydeo.dependencyInversion.good;

public class JSONReader implements Reader{


    /*
    Example JSON:{

     "userName": "mikesmith"
     }
    */
    @Override
    public String getUsername() {
        return " {\" userName\": \"mikesmith\"}";
    }
}
