package ders3.ders3.polymorphism;

public class FileLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Logged to file : " + message);
    }
}
