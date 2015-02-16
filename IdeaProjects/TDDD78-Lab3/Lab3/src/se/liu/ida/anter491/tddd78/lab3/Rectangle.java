package se.liu.ida.anter491.tddd78.lab3;

import java.awt.*;

/**
 * Created by ame on 2015-02-01.
 */
public class Rectangle extends AbstractShape {
    private int width;
    private int height;


    public Rectangle(int x, int y, Color color, int width, int height) {
        super(x, color, y);
        if (x < 0) {
            throw new IllegalArgumentException("Width input invalid (Width less then zero)");
        }
        this.width = width;
        this.height = height;

    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.drawRect(x, y, width, height);


    }

    @Override
    public String toString() {
        return  "Shape: Rectangle " + "Width: " + x +" Height:" + y + " Color: " + color;
    }
}
