package ders3.ders3.polymorphism;

public class ConsoleLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Logged to console : " + message);
    }
}
