
public class Main {
    public static void main(String[] args) {
        Jasper jasper = new Jasper(new AdidasFactory());
        jasper.showOutfit();
        System.out.println("Jasper valmistuu");
        jasper = new Jasper(new BossFactory());
        jasper.showOutfit();
       }
}
