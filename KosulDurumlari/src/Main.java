import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* System.out.println("Lütfen Yaşınızı Giriniz!:");
        int yas = scanner.nextInt();

        if ( yas<18 ) {
            System.out.println("Bu mekana giremezsiniz!");
        } */

        System.out.println(" Lütfen Bir Sayı Giriniz:");
        int sayi = scanner.nextInt();

        if ( sayi<0 ) {

            System.out.println("Negatif Sayı");

        }

        else {
            System.out.println("Pozitif veya Sıfır");
        }



    }
}