package prototype;

public class Viisari implements Cloneable {
    private int arvo;

    public Viisari(int arvo) {
        this.arvo = arvo;
    }

    public int getArvo() {
        return this.arvo;
    }

    public void setArvo(int arvo) {
        this.arvo = arvo;
    }

    //Matalakopio
    public Object clone() {
    	try {
    		return super.clone();
    	} catch (CloneNotSupportedException e) {
    		e.printStackTrace();
    	}
    	return null;
    }
}