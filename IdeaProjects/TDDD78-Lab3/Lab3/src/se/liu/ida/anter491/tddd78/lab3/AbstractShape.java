package se.liu.ida.anter491.tddd78.lab3;

import java.awt.*;

/**
 * Created by ame on 2015-02-01.
 */
public abstract class AbstractShape implements Shape {
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        AbstractShape that = (AbstractShape) o;

        if (x != that.x)
            return false;
        if (y != that.y)
            return false;
        if (color != null ? !color.equals(that.color) : that.color != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    protected int x;
    protected int y;
    protected Color color;

    public AbstractShape(int x, Color color, int y) {
        this.x = x;
        this.color = color;
        this.y = y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public Color getColor() {
        return color;
    }
}
