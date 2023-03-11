package memento;

import java.util.Random;

public class Asiakas implements Runnable {
    private final Arvuuttaja arvuuttaja;
    private int pelaajaNumero;
    private static int nextPelaajaNumero = 1;
    private Object memento;

    public Asiakas(Arvuuttaja arvuuttaja) {
        this.arvuuttaja = arvuuttaja;
        this.pelaajaNumero = nextPelaajaNumero;
        nextPelaajaNumero++;
    }

    public void run() {
        memento = arvuuttaja.liityPeliin(pelaajaNumero);
        System.out.println("Asiakas " + pelaajaNumero + " liittyi peliin.");
        int arvaus;
        do {
            arvaus = arvaus();
        } while (!arvuuttaja.arvaa(memento, arvaus));
    }

    private int arvaus() {
        return new Random().nextInt(10-1) + 1;
    }
}