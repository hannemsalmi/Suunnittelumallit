package iterator;

import java.util.ArrayList;
import java.util.Iterator;

//Tässä ohjelmassa säikeet käyttävät samaa iteraattoria vuorotellen. Iteraattorin lukema arvo tulostetaan.
//Säikeissä on käytetty synkronointia, jotta vain yksi säie käyttäisi iteraattoria kerrallaan.

public class IteratorTest2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator<Integer> iterator = list.iterator();

        Runnable task1 = () -> {
            while (true) {
                synchronized (iterator) {
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    } else {
                        break;
                    }
                }
            }
        };

        Runnable task2 = () -> {
            while (true) {
                synchronized (iterator) {
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    } else {
                        break;
                    }
                }
            }
        };

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}