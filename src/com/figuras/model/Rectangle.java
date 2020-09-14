package com.figuras.model;

public class Rectangle {
    private int base;
    private int height;
    public Rectangle(int base, int height) {
        this.height = height;
        this.base = base;

    }

    public double getArea(){

        return (base*height);
    }

    public void draw(){
        System.out.println("rectangle");
    }
}
