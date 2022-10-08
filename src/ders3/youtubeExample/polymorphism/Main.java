package ders3.youtubeExample.polymorphism;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager.GiveCredit();
    }
}
class CreditManager{
    public void Calculate(){
        System.out.println("Hesaplandı");
    }

    public void Save(){
        System.out.println("Kredi verildi");
    }
}

interface ICreditManager{
    void Calculate();
    void Save();
}

class TeacherCreditManager implements ICreditManager{

    @Override
    public void Calculate() {
        System.out.println("Öğretmen Kredisi Hesaplandı");
    }

    @Override
    public void Save() {

    }
}

class MilitaryCreditManager implements ICreditManager{

    @Override
    public void Calculate() {
        System.out.println("Asker Kredisi Hesaplandı");
    }

    @Override
    public void Save() {

    }
}

//SOLID
class Customer{
    public Customer(){
        System.out.println("Müşteri Nesnesi Başlatıldı !");
    }
    public int id;
    public String City;
}

class Person extends Customer {
    public String FirstName;
    public String LastName;
    public String NationalIdentity;
}

class Company extends Customer {
    public String CompnayName;
    public String TaxNumber;
}


//KATMANLI MİMARİ
class CustomerManager{

    private Customer _customer;
    private ICreditManager _creditManager;

    public CustomerManager(Customer customer, ICreditManager creditManager){
        _customer = customer;
        _creditManager = creditManager;
    }

    public void Save(){
        System.out.println("Müşteri Kayıt Edildi:");
    }

    public void Delete(){
        System.out.println("Müşteri Silindi:");
    }

    public void GiveCredit(){
        _creditManager.Calculate();
        System.out.println("Kredi verildi");
        _creditManager.Save();
    }
}
