package se.liu.ida.anter491.tddd78.lab2;

// import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.*;
// import java.util.*;

/**
 * Created by ame on 2015-01-24.
 */
public class Person {

    private String name;
    private LocalDate birthDay;

    Person(String name, LocalDate birthDay) {
        this.name = name;
        this.birthDay = birthDay;

    }

    public static void main(String[] args) {

            Person testAnton1 = new Person("Anton1", LocalDate.of(1905, 3, 8));
            Person testAnton2 = new Person("Anton2", LocalDate.of(1955, 3, 8));
            Person testAnton3 = new Person("Anton3", LocalDate.of(1995, 3, 8));
            System.out.println(testAnton1.toString());
            System.out.println(testAnton2.toString());
            System.out.println(testAnton3.toString());
    }

    @Override
    public  String toString() {
        return "Name: " + name + ", Age: " + getAge();


    }

    public int getAge() {
        Period ageP = Period.between(birthDay, LocalDate.now());
        return ageP.getYears();
    }
}

