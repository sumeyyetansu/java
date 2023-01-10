import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Girilen sayının armstrong sayısı olup olmadığını bulmaya çalışma.Örneğin 4 basamaklı bir sayını armstrong sayısı olabilmesi için şu şartı taşıması gerekmektedir.
        1634=1^4 + 6^4 + 3^3 + 4^4 (Buradaki 4 basamak sayısı) eşit ise armstrong sasyısı demektir.
        371=3^3  + 7^3 + 1^3 ( Buradaki 3 basamak sayısı)
       */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz:");
        int sayi = scanner.nextInt();
        System.out.print("Basamak sayısı:");
        int basamaksayisi = scanner.nextInt();
        int gecici_sayi = sayi;
        int toplam = 0;

        do {
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi /= 10;
            toplam += Math.pow(gecici_sayi, basamak_degeri);
        } while (gecici_sayi > 0);

        if (toplam == gecici_sayi) {
            System.out.println("Bu sayı armstrog sayıdır.");
        } else {
            System.out.println("Bu sayı armstrog sayı değildir.");
        }
    }
}

