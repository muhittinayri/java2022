package ders3.ders3.staticDemo;

public class ProductValidator {

    static {
        System.out.println("Static Yapıcı Blok");
    }

    public ProductValidator(){
        System.out.println("Yapıcı Blok");
    }

    public static boolean isValid(Product product){
        if (product.price > 0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public void bisey(){

    }

    //inner class
    public static class BaskaBirClass{
        public static void sil(){

        }
    }
}
