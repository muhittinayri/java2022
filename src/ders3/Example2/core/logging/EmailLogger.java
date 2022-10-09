package ders3.Example2.core.logging;

public class EmailLogger implements ILogger{
    @Override
    public void log(String data) {
        System.out.println("Email gönderildi.");
    }
}
