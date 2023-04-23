package facade;

public class HardDrive {
    public char[] Read(long lba, int size) {
        System.out.println("Reading " + size + " characters from hard drive at LBA " + lba);
        char[] data = new char[size];
        
        for (int i = 0; i < size; i++) {
            data[i] = (char) ('A' + i);
        }
        return data;
    }
}