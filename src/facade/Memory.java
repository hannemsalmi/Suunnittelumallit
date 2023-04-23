package facade;

public class Memory {
    public void Load(long position, char[] data) {
        System.out.println("Loading " + data.length + " characters into memory at position " + position);
        
        for (int i = 0; i < data.length; i++) {
            System.out.println("Loaded " + data[i] + " into memory at position " + (position + i));
        }
    }
}
