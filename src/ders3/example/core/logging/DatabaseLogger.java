package ders3.example.core.logging;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Database loglandı : " + data);
    }
}
