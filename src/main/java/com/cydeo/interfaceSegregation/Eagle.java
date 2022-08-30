package com.cydeo.interfaceSegregation;

import jdk.swing.interop.SwingInterOpUtils;

public class Eagle implements CanFly, CanEat, CanWalk {

    @Override
    public void eat() {
        System.out.println("Eating");

    }

    @Override
    public void fly() {
        System.out.println("Flying");

    }

    @Override
    public void walk() {
        System.out.println("Waking");

    }
}
