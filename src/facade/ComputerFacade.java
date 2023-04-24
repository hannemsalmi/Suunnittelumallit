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
        cpu.freeze();
        char[] data = harddrive.read(kBootSector, kSectorSize);
        memory.load(kBootAddress, data);
        cpu.jump(kBootAddress);
        cpu.execute();
    }
}
