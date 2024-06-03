package adapter;

public class USBAdapter implements USB {
    private final MemoryCard memoryCard;

    public USBAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void readData() {
        memoryCard.accessMemoryCard();
        memoryCard.readDataFromMemoryCard();
        System.out.println("Reading data from memory card via USB adapter...");
    }

    @Override
    public void writeData() {
        System.out.println("Writing data to memory card via USB adapter...");
    }
}
