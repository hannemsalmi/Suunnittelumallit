package facade;

public class ComputerFacade {
    private final CPU cpu;
    private final Memory memory;
    private final HardDrive harddrive;

    private static final long kBootAddress =  0x100;
    private static final long kBootSector = 0;
    private static final int kSectorSize = 10;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        harddrive = new HardDrive();
    }

    public void start() {
        cpu.Freeze();
        char[] data = harddrive.Read(kBootSector, kSectorSize);
        memory.Load(kBootAddress, data);
        cpu.Jump(kBootAddress);
        cpu.Execute();
    }
}
