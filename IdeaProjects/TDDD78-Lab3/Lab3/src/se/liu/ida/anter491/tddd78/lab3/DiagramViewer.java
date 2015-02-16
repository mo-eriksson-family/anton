package se.liu.ida.anter491.tddd78.lab3;

import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 * Created by ame on 2015-02-01.
 */
public class DiagramViewer {


    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        DiagramComponent comp = new DiagramComponent(shapes);

        Shape circle1 = new Circle(200,300,150, Color.BLUE);
        Shape circle2 = new Circle(500,200,300,Color.RED);
        Shape circle3 = new Circle(100,100,100,Color.GREEN);
        Shape rectangle1 = new Rectangle(50,50, Color.CYAN, 100, 200);
        Shape text1 = new Text(100,200, 100, "Hola Amigo!", Color.BLACK);



        comp.addShape(circle1);
        comp.addShape(circle2);
        comp.addShape(circle3);
        comp.addShape(rectangle1);
        comp.addShape(text1);

        // Add several shapes to the component
        //comp.addShape(...);

        JFrame frame = new JFrame("Mitt fönster");
        frame.setLayout(new BorderLayout());
        frame.add(comp, BorderLayout.CENTER);
        frame.setSize(800,600);
        frame.setVisible(true);
    }
}
