package adapter;

public class Computer {
    public void connectUSB(USB usbDevice) {
        System.out.println("Connecting USB device to computer...");
        usbDevice.readData();
        usbDevice.writeData();
    }
}
