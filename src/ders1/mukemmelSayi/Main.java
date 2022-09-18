package ders1.mukemmelSayi;

public class Main {
    public static void main(String[] args) {
        int number = 6;
        int total = 0;

        if(number<0){

            System.out.println("Geçersiz Sayı.");
            return;
        }

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number) {

            System.out.println("Sayı mükemmel bir sayıdır.");
        } else {
            System.out.println("Sayı mükemmel bir sayı değildir.");
        }
    }
}
