package se.liu.ida.anter491.tddd78.lab3;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by ame on 2015-02-01.
 */
public class TestCircle {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();

        Circle circle1 = new Circle(2,2,2, Color.BLUE);
        Circle circle2 = new Circle(1,2,1,Color.RED);
        Circle circle3 = new Circle(10,10,10,Color.GREEN);

        circles.add(circle1);
        circles.add(circle2);
        circles.add(circle3);

        for (Circle circle : circles) {
            System.out.println("X:" + circle.getX() + " Y:" + circle.getY());
        }

    }
}
