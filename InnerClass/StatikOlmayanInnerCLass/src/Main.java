import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Matematik.Faktorial faktorial = new Matematik().new Faktorial();
        Matematik.Asal asal = new Matematik().new Asal();
        Matematik.Alan.DaireAlan daireAlan = new Matematik().new Alan().new DaireAlan();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi = scanner.nextInt();

        if (asal.asal_mi(sayi)){
            System.out.println("Bu sayı asaldır.");
        }
        else {
            System.out.println("Bu sayı asal değildir.");
        }
        faktorial.faktorial();
        daireAlan.daire_alan(5);
    }
}