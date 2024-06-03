package proxy;

public class RealDatabase implements Database {
    @Override
    public void connect(String databaseName) {
        System.out.println("Connecting to database: " + databaseName);
    }
}
