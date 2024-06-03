package singletone;

public class TestClass {
    public static void main(String[] args) {
        TestClass obj = new TestClass();
        Logger.getLogger().classLog(obj,"Some info.");

        Logger.getLogger().showLogFile();
    }
}