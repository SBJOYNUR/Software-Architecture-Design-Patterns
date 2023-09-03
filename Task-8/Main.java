class CPU {
public void processData() {
System.out.println("CPU: Processing data...");
}
}
class Memory {
public void loadMemory() {
System.out.println("Memory: Loading memory...");
}
}
class HardDrive {

public void readData() {
System.out.println("HardDrive: Reading data...");
}
}
class ComputerFacade {
private CPU cpu;
private Memory memory;
private HardDrive hardDrive;

public ComputerFacade() {
this.cpu = new CPU();
this.memory = new Memory();
this.hardDrive = new HardDrive();

}
public void startComputer() {
System.out.println("Starting computer...");
cpu.processData();
memory.loadMemory();
hardDrive.readData();
System.out.println("Computer started.");
}
}
public class Main {
public static void main(String[] args) {
ComputerFacade computer = new ComputerFacade();

computer.startComputer();
}
}