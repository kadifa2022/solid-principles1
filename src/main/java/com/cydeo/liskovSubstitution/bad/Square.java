package com.cydeo.liskovSubstitution.bad;

public class Square  extends Rectangle{

    @Override
    public void setHeight(int height) {
        this.height=height;
        this.width=width;
    }

    @Override
    public void setWidth(int width) {
        this.width=width;
        this.height=height;
    }
}
