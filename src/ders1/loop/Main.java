package ders1.loop;

public class Main {
    public static void main(String[] args) {

        System.out.println("******************** For Döngüsü ********************");

        for (int i = 2; i < 10; i += 2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti.");


        System.out.println("******************** While Döngüsü ********************");

        int i = 2;
        while (i < 10) {
            System.out.println(i);
            i+=2;
        }

        System.out.println("******************** do-While Döngüsü ********************");

        int j = 1;
        do {
            System.out.println(j);
            j+=2;
        }
        while (j < 10);
        System.out.println("Do While Döngüsü Bitti.");
    }
}
