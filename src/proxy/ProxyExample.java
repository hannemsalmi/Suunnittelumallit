package proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyExample {

    public static void main(final String[] arguments) {
    	
    	List<Image> photoAlbum = new ArrayList<>();

    	photoAlbum.add(new ProxyImage("HiRes_10MB_Photo1"));
    	photoAlbum.add(new ProxyImage("HiRes_10MB_Photo2"));
    	photoAlbum.add(new ProxyImage("HiRes_10MB_Photo3"));
    	photoAlbum.add(new ProxyImage("HiRes_10MB_Photo4"));

    	System.out.println("Tulostetaan tiedot valokuvakansion sisällöstä:");
    	for (Image image : photoAlbum) {
    		image.showData();
    	}
    	
    	System.out.println("\nSelataan valokuvakansiota:");
    	for (Image image : photoAlbum) {
    		image.displayImage();
    	}
    	
    	System.out.println("\nSelataan valokuvakansio uudelleen, nyt kuvat on jo ladattu:");
    	for (Image image : photoAlbum) {
    		image.displayImage();
    	}
    }
}
