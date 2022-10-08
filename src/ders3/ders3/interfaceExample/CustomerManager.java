package ders3.ders3.interfaceExample;

public class CustomerManager {
    /*
    ICustomerDal customerDal;

    public void add(){
        // İş Kodları Yazılır
        customerDal.add();
    }
     */

    private ICustomerDal customerDal;

    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }

    public void add(){
        // İş Kodları Yazılır
        customerDal.add();
    }
}
