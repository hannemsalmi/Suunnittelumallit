package memento;

import java.util.Random;

public class Asiakas implements Runnable {
    private final Arvuuttaja arvuuttaja;

    public Asiakas(Arvuuttaja arvuuttaja) {
        this.arvuuttaja = arvuuttaja;
    }

    @Override
    public void run() {
        Memento memento = arvuuttaja.liityPeliin();
        int arvaus = arvaus();
        System.out.println("Asiakas arvaa " + arvaus);
        while (!arvuuttaja.arvaa(memento, arvaus)) {
            arvaus = arvaus();
            System.out.println("Asiakas arvaa " + arvaus);
            
        }
    }

    private int arvaus() {
        return new Random().nextInt(10-1) + 1;
    }
}