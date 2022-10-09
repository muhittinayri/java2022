package ders3.Example2.core.logging;

public class DatabaseLogger implements ILogger{
    @Override
    public void log(String data) {
        System.out.println("Database loglandı");
    }
}
