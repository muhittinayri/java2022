package ders3.ders3.interfaceExample;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Oracle eklendi");
    }
}
