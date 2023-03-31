package adapter;

public class ImageAdapter implements ImageDisplay {

    private Image image;
    
    public ImageAdapter(Image image) {
        this.image = image;
    }
    
    public void displayImage() {
        image.display();
    }

}
