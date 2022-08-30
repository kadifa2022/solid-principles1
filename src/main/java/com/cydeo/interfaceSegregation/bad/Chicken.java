package com.cydeo.interfaceSegregation.bad;

public class Chicken implements Bird{
    @Override
    public void eat() {
        System.out.println("Eating");

    }

    @Override
    public void walk() {
        System.out.println("Walking");

    }

    @Override
    public void fly() {
       //can do fly, so do nothing

    }
}
