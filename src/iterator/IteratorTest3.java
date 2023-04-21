package iterator;

import java.util.ArrayList;
import java.util.Iterator;

//Tässä ohjelmassa testataan, mitä tapahtuu, jos listaa muokataan kesken iteroinnin.

public class IteratorTest3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        Runnable task = () -> {
            while (iterator.hasNext()) {
                Integer value = iterator.next();
                System.out.println(value);
                list.remove(value);
            }
        };

        Thread thread = new Thread(task);

        thread.start();
    }
}