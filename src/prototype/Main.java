package prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
            Kello kello = new Kello(10, 12, 15);
            Kello syvakopio  = kello.clone();
            
            System.out.println("Alkuperäinen kello:");
            kello.tulostaAika();
            System.out.println("Syväkopio:");
            syvakopio.tulostaAika();
            
            System.out.println("Muutetaan alkuperäisen kellon ajaksi 9:00:00");
            kello.setAika(9, 0, 0);
            
            System.out.println("Alkuperäinen kello:");
            kello.tulostaAika();
            System.out.println("Syväkopio:");
            syvakopio.tulostaAika();
            
            Kello matalakopio = (Kello) kello.shallowClone();

            System.out.println("Matalakopio:");
            matalakopio.tulostaAika();
            
            System.out.println("Muutetaan matalakopion ajaksi 01:02:03");
            matalakopio.setAika(1, 2, 3);
            
            System.out.println("Alkuperäinen kello:");
            kello.tulostaAika();
            System.out.println("Matalakopio:");
            matalakopio.tulostaAika();
        }
    }