package se.liu.ida.anter491.tddd78.lab2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ame on 2015-01-29.
 */
public class Stack {

    private List<Person> elements;

    public Stack() {

        elements = new ArrayList<>();
    }

    public int size() {

        return elements.size();
    }

    public boolean isEmpty() {

        return elements.isEmpty();
    }

    public boolean contains(Object o) {

        return elements.contains(o);
    }

    public void clear() {

        elements.clear();
    }

    public void push(Person person) {
        elements.add(0, person);
    }

    public Person pop() {

        return elements.remove(0);
    }

    public static void main(String[] args) {
        Stack myStack = new Stack();

        Person Anton = new Person("Anton", LocalDate.of(1995,3,8));
        Person Mo = new Person("MO", LocalDate.of(1990,9,21));
        Person Eriksson = new Person("Eriksson", LocalDate.of(1999,9,12));
        Person Julia = new Person("Julia", LocalDate.of(1995,6,23));
        Person Johan = new Person("Johan", LocalDate.of(1995,11,1));

        myStack.push(Anton);
        myStack.push(Mo);
        myStack.push(Eriksson);
        myStack.push(Julia);
        myStack.push(Johan);

        while (!myStack.isEmpty()) {
            //System.out.println(myStack);
            System.out.println(myStack.pop().toString());
        }

    }
}
