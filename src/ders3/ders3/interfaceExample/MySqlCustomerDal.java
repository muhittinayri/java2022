package ders3.ders3.interfaceExample;

public class MySqlCustomerDal implements ICustomerDal, IRepository{

    @Override
    public void add() {
        System.out.println("MySql eklendi");
    }
}
