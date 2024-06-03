package proxy;

public class Client {
    private final Database databaseProxy;

    public Client(Database databaseProxy) {
        this.databaseProxy = databaseProxy;
    }

    public void connectToDatabase(String databaseName) {
        databaseProxy.connect(databaseName);
    }
}
