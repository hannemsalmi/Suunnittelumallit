package memento;

public class Main {
    public static void main(String[] args) {
        Arvuuttaja arvuuttaja = new Arvuuttaja();
        for (int i = 0; i < 3; i++) {
            new Thread(new Asiakas(arvuuttaja)).start();
        }
    }
}