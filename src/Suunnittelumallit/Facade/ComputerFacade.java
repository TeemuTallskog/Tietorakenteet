package Suunnittelumallit.Facade;

public class ComputerFacade extends Thread{
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;
    private final long bootAddress = 127;
    private final int sectorSize = 11;
    public ComputerFacade(CPU cpu, Memory memory, HardDrive hardDrive){
        this.cpu = cpu;
        this.hardDrive = hardDrive;
        this.memory = memory;
    }
    public void start(){
        cpu.freeze();
        memory.load(bootAddress, hardDrive.read(bootAddress, sectorSize));
        cpu.jump(bootAddress);
        cpu.execute();
    }
}
