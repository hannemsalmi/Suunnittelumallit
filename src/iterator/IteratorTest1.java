package iterator;

import java.util.ArrayList;
import java.util.Iterator;


//Yritetään iteroida samaa kokoelmaa kahdella säikeellä yhtä aikaa ja molemmilla säikeillä on oma iteraattori. Iteraattori tulostaa
//aina lukemansa arvon.

public class IteratorTest1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator1 = list.iterator();
        Iterator<Integer> iterator2 = list.iterator();

        Runnable task1 = () -> {
            while (iterator1.hasNext()) {
                System.out.println(iterator1.next());
            }
        };

        Runnable task2 = () -> {
            while (iterator2.hasNext()) {
                System.out.println(iterator2.next());
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}