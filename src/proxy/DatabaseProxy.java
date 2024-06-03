package proxy;

public class DatabaseProxy implements Database {
    private RealDatabase realDatabase;
    private final String serverUrl;

    public DatabaseProxy(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    @Override
    public void connect(String databaseName) {
        if (realDatabase == null) {
            realDatabase = new RealDatabase();
        }
        System.out.println("Connecting to database via proxy: " + serverUrl + "/" + databaseName);
        realDatabase.connect(databaseName);
    }
}
