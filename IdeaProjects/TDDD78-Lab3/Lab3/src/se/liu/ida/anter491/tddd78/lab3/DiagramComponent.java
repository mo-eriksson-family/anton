package se.liu.ida.anter491.tddd78.lab3;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by ame on 2015-02-01.
 */
public class DiagramComponent extends JComponent {

    
    private ArrayList<Shape> shapes = new ArrayList<>();
    
    

    public void addShape(Shape s) {
        shapes.add(s);
    }

    public DiagramComponent(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    protected void paintComponent(final Graphics g) {
        super.paintComponent(g);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

}


