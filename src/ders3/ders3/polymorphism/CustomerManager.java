package ders3.ders3.polymorphism;

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }

    public void add(){
        System.out.println("Müşteri Eklendi");
        this.logger.log("Log mesajı");
    }
}
