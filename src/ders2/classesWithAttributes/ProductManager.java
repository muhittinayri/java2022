package ders2.classesWithAttributes;

public class ProductManager {
    public void Add(Product product){
        //JDBC -> veritabanına ekleme işlemleri
        System.out.println("Ürün Eklendi. = " + product.name);
    }
}
