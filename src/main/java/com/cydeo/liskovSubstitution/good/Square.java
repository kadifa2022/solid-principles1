package com.cydeo.liskovSubstitution.good;

public class Square implements Shape{

    private int side;
    private void setSide(){
        this.side=side;
    }
    @Override
    public int getArea() {
        return side* side;
    }
}
