import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İdman programımıza hoşgeldiniz.");
        String idmanlar = "Geçerli hareketler......?n" +
                "Burpee\n" +
                "Pushup\n" +
                "Situp\n" +
                "Squat";

        System.out.println(idmanlar);
        System.out.println("Bir idman programı oluşturun.");

        System.out.print("Burpee sayısı = ");
        int burpee = scanner.nextInt();
        System.out.print("Pushup sayısı = ");
        int pushup = scanner.nextInt();
        System.out.print("Situp sayısı = ");
        int situp = scanner.nextInt();
        System.out.print("Squat sayısı = ");
        int squat = scanner.nextInt();
        scanner.nextLine();

        Idman idman = new Idman( burpee , pushup , situp,squat );
        System.out.println("İdmanınız başlıyor.");

        while (idman.idmanBittiMi()==false){
            System.out.print("Hareket Türü(Burpee , Pushup , Situp , Squat) = ");
            String tur = scanner.nextLine();
            System.out.print("Bu harekettten kaç tane yapacaksınız. =");
            int sayi = scanner.nextInt();
            scanner.nextLine();

            idman.hareketYap(tur,sayi);

        }
    }
}