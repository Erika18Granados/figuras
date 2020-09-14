package com.figuras.model;

public class Circle {
    private int radio;

    public Circle(int radio) {
        this.radio = radio;
    }

    public double getArea(){
        return (3.14*radio*radio);
    }

    public void draw(){
        System.out.println("Circulo");
    }

}
