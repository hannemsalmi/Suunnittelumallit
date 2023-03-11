package memento;

import java.util.Random;

public class Arvuuttaja {
    private final Random random = new Random();
    
    private class Memento{
    	private int arvottuLuku;
    	private int pelaajaNumero;
    	
    	public Memento(int arvottuLuku, int pelaajaNumero) {
    		this.arvottuLuku = arvottuLuku;
    		this.pelaajaNumero = pelaajaNumero;
    	}

		public int getArvottuLuku() {
			return arvottuLuku;
		}
		
		public int getPelaajaNumero() {
			return pelaajaNumero;
		}
    }

    public Object liityPeliin(int pelaajaNumero) {
    	int oikeaLuku = random.nextInt(10-1) + 1;
        return new Memento(oikeaLuku, pelaajaNumero);
    }

    public boolean arvaa(Object obj, int arvaus) {
    	Memento memento = (Memento) obj;
        int arvottuLuku = memento.getArvottuLuku();
        if (arvaus == arvottuLuku) {
        	System.out.println("Asiakas " + memento.getPelaajaNumero() + " arvaa " + arvaus);
            System.out.println("Oikein!");
            return true;
        } else if (arvaus < arvottuLuku) {
        	System.out.println("Asiakas " + memento.getPelaajaNumero() + " arvaa " + arvaus);
            System.out.println("Liian pieni!");
        } else {
        	System.out.println("Asiakas " + memento.getPelaajaNumero() + " arvaa " + arvaus);
            System.out.println("Liian suuri!");
        }
        return false;
    }
}
