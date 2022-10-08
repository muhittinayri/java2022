package ders3.classExample;

public class Main {
    public static void main(String[] args) {
        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Save();
        Customer customer = new Customer(); //Örneğini oluşturmak, instance oluşturmak, instance creation
        customer.id = 1;
        customer.City = "Türkiye";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();

        Company company = new Company();
        company.TaxNumber = "111100000";
        company.CompnayName = "Arçelik";
        company.id = 100;
        CustomerManager customerManager2 = new CustomerManager(new Company());


        Person person = new Person();
        person.FirstName = "ABC";
        person.NationalIdentity = "123456789";

        Customer customer1 = new Customer();
        Customer customer2 = new Person();
        Customer customer3 = new Company();


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

//SOLID
class Customer{
    public Customer(){
        System.out.println("Müşteri Nesnesi Başlatıldı !");
    }
    public int id;
    public String City;
}

class Person extends Customer{
    public String FirstName;
    public String LastName;
    public String NationalIdentity;
}

class Company extends Customer{
    public String CompnayName;
    public String TaxNumber;
}


//KATMANLI MİMARİ
class CustomerManager{

    private Customer _customer;

    public CustomerManager(Customer customer){
        _customer = customer;
    }

    public void Save(){
        System.out.println("Müşteri Kayıt Edildi:");
    }

    public void Delete(){
        System.out.println("Müşteri Silindi:");
    }
}

