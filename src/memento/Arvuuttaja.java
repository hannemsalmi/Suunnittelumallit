package memento;

import java.util.Random;

public class Arvuuttaja {
    private final Random random = new Random();

    public Memento liityPeliin() {
    	int oikeaLuku = random.nextInt(10-1) + 1;
        return new Memento(oikeaLuku);
    }

    public boolean arvaa(Memento memento, int arvaus) {
        int arvottuLuku = memento.getArvottuLuku();
        if (arvaus == arvottuLuku) {
            System.out.println("Oikein!");
            return true;
        } else if (arvaus < arvottuLuku) {
            System.out.println("Liian pieni!");
        } else {
            System.out.println("Liian suuri!");
        }
        return false;
    }
}
