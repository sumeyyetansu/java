import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        
        System.out.println("Lütfen Yaşınızı Giriniz:");
        
        int yas = scanner.nextInt();
        
        System.out.println("Yaşınız: " + yas );

      /*  Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Sayı Giriniz:");

        double sayi = scanner.next.Double();

        System.out.println("Sayı: " + sayi );*/


        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Yazı Giriniz:");

        String yazi = scanner.nextLine();

        System.out.println("Yazı: " + yazi );
        */
        Scanner scanner = new Scanner(System.in);

       if (scanner.hasNextInt()) {

           int sayi= scanner.nextInt();

           System.out.println("Sayı :" + sayi);
       }


        else{
           scanner.next();
            System.out.println("Lütfen bir sayı giriniz.... ");

            int sayi2= scanner.nextInt();

            System.out.println("Sayı :" + sayi2);
       }


    }
}
