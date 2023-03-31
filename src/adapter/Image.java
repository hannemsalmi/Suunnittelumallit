package adapter;

public class Image {
	
    private String filename;
    
    public Image(String filename) {
        this.filename = filename;
    }
    
    public void display() {
        System.out.println("Displaying image " + filename);
    }
}
