package proxy;

public class Main {
    public static void main(String[] args) {
        Database databaseProxy = new DatabaseProxy("localhost:8080");

        Client client = new Client(databaseProxy);

        client.connectToDatabase("example_db");
    }
}
