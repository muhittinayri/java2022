package ders3.example.core.logging;

public class EmailLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Email ile gönderildi : " + data);
    }
}
