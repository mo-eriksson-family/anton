package se.liu.ida.anter491.tddd78.lab3;

import java.awt.*;

/**
 * Created by ame on 2015-02-01.
 */
public class Circle extends AbstractShape {
    private int radius;

    public Circle(int x, int y, int radius, Color color) {
        super(x, color, y);
        if (radius < 0) {
            throw new IllegalArgumentException("Radius input invalid (radius less then zero)");
        }
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawOval(x, y, radius, radius); // calculated from radius!

    }

    @Override
    public String toString() {
        return "Shape: Circle " + "X-Coord: " + getX() +" Y-Coord:" + getY() + " Radius: "+ radius  + " Color: " + getColor();
    }
}
