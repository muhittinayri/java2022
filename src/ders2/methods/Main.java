package ders2.methods;

public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }
    //Javada method isimleri camelCase yazılır.
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int arancak = 5;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == arancak){
                varMi = true;
                break;
            }
        }
        String mesaj = "";
        if (varMi){
            mesaj = "Sayı Mevcuttur. : " + arancak;
            mesajlar(mesaj);
        }else{
            mesajlar("Sayı Mevcut değildir. : " + arancak);
        }
    }

    public static void mesajlar(String mesaj){
        System.out.println(mesaj);
    }

    //Java Dersi 25 : Parametreli Metodları Anlamak kaldım.

}
