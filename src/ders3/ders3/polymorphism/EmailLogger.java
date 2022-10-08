package ders3.ders3.polymorphism;

public class EmailLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Logged to email : " + message);
    }
}
