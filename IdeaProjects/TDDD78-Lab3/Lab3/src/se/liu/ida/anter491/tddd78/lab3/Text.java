package se.liu.ida.anter491.tddd78.lab3;

import java.awt.*;

/**
 * Created by ame on 2015-02-01.
 */
public class Text extends AbstractShape {

    public int size;
    public String text;


    public Text(int x, int y, int size, String text, Color color) {
        super(x, color, y);
        if (size < 0) {
            throw new IllegalArgumentException("Size input invalid (Size less then zero)");
        }
        this.size = size;
        this.text = text;
    }

    public int getSize() {
        return size;
    }

    public String getText() {
        return text;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.setFont(new Font("serif", Font.PLAIN, size));
        g.drawString(text, x, y);
    }

    @Override
    public String toString() {

        return "Shape: Text " + "X-Coord: " + x +" Y-Coord:" + y + " Size: "+ size + " Text: " + text + " Color: " + getColor();
    }
}
