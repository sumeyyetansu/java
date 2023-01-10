import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* do{

            // koşul olduğu sürece çalışır
            // while'den farkı en az bir kere çalışır.Çalışması garanti yani.
        }

        */

        //bir sayının rakamları toplamı
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz=");
        int sayi = scanner.nextInt();
        int rakamlariToplami =0;
        do {
         rakamlariToplami += sayi % 10;
         sayi /=10;

        } while (sayi>0);
        System.out.println("Sayının rakamları toplamı=" +rakamlariToplami);


    }
}