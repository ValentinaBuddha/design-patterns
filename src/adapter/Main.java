package adapter;

public class Main {
    public static void main(String[] args) {
        MemoryCard memoryCard = new MemoryCard();

        USBAdapter usbAdapter = new USBAdapter(memoryCard);

        Computer computer = new Computer();

        computer.connectUSB(usbAdapter);
    }
}
