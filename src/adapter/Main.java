package adapter;

public class Main {

	    public static void main(String[] args) {

        Image image = new Image("dog.png");
        
        ImageDisplay adapter = new ImageAdapter(image);
        
        adapter.displayImage();
    }
}
