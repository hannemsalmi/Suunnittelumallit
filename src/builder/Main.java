package builder;

public class Main {
    public static void main(String[] args) {
        HesburgerBuilder hesburgerBuilder = new HesburgerBuilder();
        McDonaldsBuilder mcdonaldsBuilder = new McDonaldsBuilder();

        Director hesburgerDirector = new Director(hesburgerBuilder);
        Director mcdonaldsDirector = new Director(mcdonaldsBuilder);

        hesburgerDirector.makeBurger();
        mcdonaldsDirector.makeBurger();

        HesburgerBurger hesburger = hesburgerBuilder.getBurger();
        McDonaldsBurger mcdonalds = mcdonaldsBuilder.getBurger();

        System.out.println(hesburger);
        System.out.println(mcdonalds);
    }

}
