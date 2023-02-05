import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islemler = "1 . Karenin Alanını Hesapla\n" +
                "2 . Üçgenin Alanını Hesapla\n" +
                "3 . Dairenin Alanını Hesapla\n" +
                "çıkış için q ya basın";


        while (true){

            System.out.println(islemler);
            System.out.print("Hangi şeklin alanını hesaplamak istyorsunuz : ");
            String sekil_turu= scanner.nextLine();
            Sekil sekil ;


            if (sekil_turu.equals("q")){

                System.out.println("Programdan çıkılıyor...");
                break;
            }

            else if (sekil_turu.equals("1")){

                System.out.print("Karenin kenarı : " );
                int kenar = scanner.nextInt();
                scanner.nextLine();

                sekil = new Kare("Kare1" , kenar) ;

                sekil.alan_hesapla();

            } else if (sekil_turu.equals("2")) {

                System.out.print("Kenar 1 :");
                int kenar1 = scanner.nextInt();

                System.out.print("Kenar 2 :");
                int kenar2 = scanner.nextInt();

                System.out.print("Kenar 3 :");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();

                sekil = new Ucgen( "Ucgen1" , kenar1 , kenar2 , kenar3);

                sekil.alan_hesapla();

            } else if (sekil_turu.equals("3")) {

                System.out.print("Dairenin yarıçapı : ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();

                sekil = new Daire("Daire1" , yaricap );
                sekil.alan_hesapla();

            }else {
                System.out.println("Geçersiz işlem.");
            }
        }

    }
}
