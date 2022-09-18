package ders1.string;

public class Main {
    public static void main(String[] args) {
        String mesaj = "   Bugün hava çok güzel.  ";
        System.out.println(mesaj);

        /*System.out.println("Eleman Sayısı : " + mesaj.length());
        System.out.println("5. eleman : " + mesaj.charAt(4)); // buradaki amaç elimizdeki string değerinin beşinci elemanını bulmak(harf olarak).
        System.out.println(mesaj.concat(" Yaşasın!")); // bu yeni bir string daha sonra kullanmak istersek bir değişkene atamalıyız.
        // mesaj2= mesaj.concat gibi
        // concat i iki metni birleştirmek için kullanırız.
        System.out.println(mesaj.startsWith("B"));
        // B ile başıyorsa true başlamıyorsa false.
        System.out.println(mesaj.endsWith("."));
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        // 5. indeksi dahil etmez
        // atamak için bir char dizisine ihtiyacı var.
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));//girilen karakterin indeksini döndürür.
       // ilk bulduğu a ya göre gönderir.
        System.out.println(mesaj.lastIndexOf('e'));
        // aramaya sağdan başlar ama sola göre indeks sırasını verir.
        */

        String yeniMesaj = mesaj.replace(' ', '-');
        System.out.println(yeniMesaj); // metindeki karakter vb şeyleri değiştirmek için.
        System.out.println(mesaj.substring(2, 5)); // metnin içinden bir parça almada kullanılır.
        // mesajı 2 den başla 5 e kadar kes demiş olduk.

        for (String kelime : mesaj.split(" ")) { // split içerisinde boşluğa göre ayır dedik
            System.out.println(kelime);
        }

        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        // bunu özellikle veri tabanlarına arama ifadesi gönderdiğimizde kullanırız.
        System.out.println(mesaj.trim());
    }
}
