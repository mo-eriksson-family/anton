package se.liu.ida.anter491.tddd78.lab2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ame on 2015-01-29.
 */
public class Queue {
    private List<Person> elements;

    public Queue() {

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

    public void enqueue(Person person) {
        elements.add(person);
    }

    public Person dequeue() {
        return elements.remove(0);
    }

    public static void main(String[] args) {

        Queue myQueue = new Queue();
        Person Anton = new Person("Anton", LocalDate.of(1995, 3, 8));
        Person Mo = new Person("MO", LocalDate.of(1990,9,21));
        Person Eriksson = new Person("Eriksson", LocalDate.of(1999,9,12));
        Person Julia = new Person("Julia", LocalDate.of(1995,6,23));
        Person Johan = new Person("Johan", LocalDate.of(1995,11,1));

        myQueue.enqueue(Anton);
        myQueue.enqueue(Mo);
        myQueue.enqueue(Eriksson);
        myQueue.enqueue(Julia);
        myQueue.enqueue(Johan);

        while (!myQueue.isEmpty()) {
            //System.out.println(myQueue);
            System.out.println(myQueue.dequeue().toString());
        }


    }
}
