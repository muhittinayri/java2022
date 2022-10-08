package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
      public void add(Product product){
            //Sadece ve Sadece DB Erişim Kodları Buraya Yazılır. / SQL Bilmek Gerekir
            System.out.println("JDBC ile Veritabanına Eklendi");
      }
}
