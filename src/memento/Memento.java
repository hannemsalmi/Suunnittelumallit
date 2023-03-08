package memento;

public class Memento {
    private int arvottuLuku;

    public Memento(int arvottuLuku) {
        this.arvottuLuku = arvottuLuku;
    }

    public int getArvottuLuku() {
        return arvottuLuku;
    }
}