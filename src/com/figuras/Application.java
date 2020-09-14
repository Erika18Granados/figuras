package com.figuras;

import com.figuras.model.Circle;
import com.figuras.model.Rectangle;
import com.figuras.model.Square;
import com.figuras.model.Triangle;

public class Application {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5), circle2 = new Circle(7);
        Rectangle rectangle = new Rectangle(10, 20);
        Square[] squares = new Square[4];
        Triangle triangle = new Triangle(10, 20);

        //instancias cuadrado
        squares[0] = new Square(6);
        squares[1] = new Square(9);
        squares[2] = new Square(3);
        squares[3] = new Square(8);

        System.out.println("soy ERIKA GRANADOS GRIFALDO");

        printFigure(circle1);
        printFigure(circle2);

        printFigure(rectangle);
        //for de tipo each: para cada elemento del arreglo cuadrados(aquares)
        for (Square square : squares) {
            printFigure(square);
        }
        printFigure(triangle);

    }

    public static void printFigure(Circle circle) {
        circle.draw();
        System.out.println("Area: " + circle.getArea());
    }

    public static void printFigure(Rectangle rectangle) {
        rectangle.draw();
        System.out.println("Area: " + rectangle.getArea());
    }

    public static void printFigure(Square square) {
        square.draw();
        System.out.println("Area: " + square.getArea());
    }

    public static void printFigure(Triangle triangle) {
        triangle.draw();
        System.out.println("Area: " + triangle.getArea());
    }


}
