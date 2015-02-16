package se.liu.ida.anter491.tddd78.lab3;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by ame on 2015-02-01.
 */
public class TestShapes {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        Shape circle1 = new Circle(2,2,2, Color.BLUE);
        Shape circle2 = new Circle(1,2,1,Color.RED);
        Shape circle3 = new Circle(10,10,10,Color.GREEN);
        Shape rectangle1 = new Rectangle(5,5, Color.RED, 5,5);
        Shape text1 = new Text(1,2, 10, "Hola Amigo!", Color.BLACK);

        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(circle3);
        shapes.add(rectangle1);
        shapes.add(text1);

        //for (Shape shape : shapes) {
            //shape.draw();
            //System.out.println("X:" + shape.getX() + " Y:" + shape.getY());
        }

    }

