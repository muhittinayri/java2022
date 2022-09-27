package ders2.encapsulation;

public class ProductManager {
    public void Add(Product product){
        //JDBC -> veritabanına ekleme işlemleri
        System.out.println("Ürün Eklendi. = " + product.getName());
    }

    public void Add2(int id, String name, String description, int stockAmount, double price){

    }
}
