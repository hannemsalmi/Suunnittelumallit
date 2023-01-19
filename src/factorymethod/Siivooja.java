package factorymethod;

public class Siivooja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Mehu();
    };

}