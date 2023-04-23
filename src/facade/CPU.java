package facade;

public class CPU {
    public void Freeze() {
        System.out.println("Freezing CPU");
    }

    public void Jump(long position) {
        System.out.println("Jumping to position " + position);
    }

    public void Execute() {
        System.out.println("Executing");
    }
}