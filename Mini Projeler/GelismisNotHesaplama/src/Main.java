import java.util.Scanner;

public class Main {


    /*
    Kullanıcıdan vize 1 vize 2 notları alınacak. Harf sistemi hesaplanacak. Not ortalaması DD alma ve 2.50'un altında ise tavsiye mesajı yazılacak.
    vize 1 toplam notun %30'una
    vize 2 toplam notun % 30'u
    final toplam notun % 40'ı na etki edecek.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vize 1: ");
        int vize1 = scanner.nextInt();
        System.out.println("Vize 2: ");
        int vize2 = scanner.nextInt();
        System.out.println("Final: ");
        int finalnot = scanner.nextInt();
        System.out.println("Okul ortalamanız:");
        double ortalama = scanner.nextDouble();

        double toplamnot = (vize1 * 3 / 10) + (vize2 * 3 / 10) + (finalnot * 4 / 10);


       if ( toplamnot >= 90 ){
            System.out.println("AA");

        }
        else if ( toplamnot >= 85) {
            System.out.println("BA");

        }
        else if ( toplamnot >= 80) {
            System.out.println("BB");

        }
        else if ( toplamnot >= 75) {
            System.out.println("CA");

        }
        else if ( toplamnot >= 70) {
            System.out.println("CC");

        }
        else if ( toplamnot >= 65) {
            System.out.println("DC");

        }
        else if ( toplamnot >= 60) {
            System.out.println("DD");
            if ( ortalama<= 2.5 ) {
                System.out.println("DD aldınız ve not ortalamanız düşük. Bu dersi tekrar almayı düşünebilirsiniz.");
            }

        }

        else {
            System.out.println("Dersten Kaldınız!");
        }
    }
}