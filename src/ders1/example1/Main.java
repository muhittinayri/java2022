package ders1.example1;

public class Main {
    public static void main(String[] args) {
        //En Büyük Hangisi ?
        int sayi1 = 264;
        int sayi2 = 25;
        int sayi3 = 26;
        int enBuyuk = sayi1;

        if (enBuyuk < sayi2){
            enBuyuk = sayi2;
        }

        if (enBuyuk < sayi3){
            enBuyuk = sayi3;
        }

        System.out.println("En Büyük : " + enBuyuk);
    }
}
