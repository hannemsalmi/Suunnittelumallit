package iterator;

import java.util.ArrayList;
import java.util.Iterator;

//Testataan forEachRemaining-metodia

public class IteratorTest4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        iterator.forEachRemaining(value -> System.out.println(value));
    }
}