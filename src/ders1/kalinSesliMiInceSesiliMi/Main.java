package ders1.kalinSesliMiInceSesiliMi;

public class Main {
    public static void main(String[] args) {
        char harf = 'E';

        switch (harf){
            case 'A':
            case 'I':  // eğer harf bunları içeriyorsa kalın içermiyorsa ince.
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf.");
                break;
            default:
                System.out.println("İnce sesli harf.");
        }
    }
}
