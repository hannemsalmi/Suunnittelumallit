package prototype;

class Kello implements Cloneable {
    private Viisari tuntiviisari;
    private Viisari minuuttiviisari;
    private Viisari sekuntiviisari;

    public Kello(int tunnit, int minuutit, int sekunnit) {
        this.tuntiviisari = new Viisari(tunnit);
        this.minuuttiviisari = new Viisari(minuutit);
        this.sekuntiviisari = new Viisari(sekunnit);
    }

    public void setAika(int tunnit, int minuutit, int sekunnit) {
        this.tuntiviisari.setArvo(tunnit);
        this.minuuttiviisari.setArvo(minuutit);
        this.sekuntiviisari.setArvo(sekunnit);
    }

    public void tulostaAika() {
        System.out.printf("%02d:%02d:%02d\n",
            this.tuntiviisari.getArvo(), this.minuuttiviisari.getArvo(), this.sekuntiviisari.getArvo());
    }

    //Syväkopio
    @Override
    public Kello clone() {
    	try {
        Kello klooni = (Kello) super.clone();
        klooni.tuntiviisari = (Viisari) tuntiviisari.clone();
        klooni.minuuttiviisari = (Viisari) minuuttiviisari.clone();
        klooni.sekuntiviisari = (Viisari) sekuntiviisari.clone();
        return klooni;
    	} catch (CloneNotSupportedException e) {
    		return null;
    	}
    }
    
    //Matalakopio
    public Object shallowClone() {
    	try {
    		return super.clone();
    	} catch (CloneNotSupportedException e) {
    		e.printStackTrace();
    	}
    	return null;
    }
}
