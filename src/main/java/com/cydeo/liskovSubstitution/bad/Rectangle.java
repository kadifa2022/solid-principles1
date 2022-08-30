package com.cydeo.liskovSubstitution.bad;

public class Rectangle {


    protected  int height;
    protected int width;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public int getArea(){
        return this.height * this.width;
    }

    public static class Square extends Rectangle {

        @Override
        public void setHeight(int height) {
            this.height = height;
            this.width = width;
        }

        @Override
        public void setWidth(int width) {
            this.width=width;
            this.height=height;
        }
    }
}
