package ders3.ders3.polymorphism;

public class DatabaseLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Logged to database : " + message);
    }
}
