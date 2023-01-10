import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* while döngüsü ile kullanıcı girişi yazmak
         */
        Scanner scanner = new Scanner(System.in);
        String kullanici_adi ="Sümeyye";
        String kullanici_parola = "12345";
        int count = 3;
        System.out.println("***********************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz.");
        System.out.println("***********************");


        while (true){
            System.out.print("kullanıcı adınıiriniz=");
            String kullanici = scanner.nextLine();
            System.out.print("parolayı giriniz=");
            String parola = scanner.nextLine();

            if (kullanici.equals(kullanici_adi) && parola.equals(kullanici_parola)){
                System.out.println("Hoşgeldiniz" + kullanici );
                break;
            }
            else if (!kullanici.equals(kullanici_adi) && kullanici_parola.equals(parola)) {
                System.out.println("kullanıcı adı hatalı!");
                count  -=1;
                System.out.println("Giriş hakkı=" +count);
            }
            else if (kullanici.equals(kullanici_adi) && !parola.equals(kullanici_parola)) {
                System.out.println("kullnıcı parola hatalı");
                count -=1;
                System.out.println("Giriş hakkı=" +count);

            }
            else {
                System.out.println("kullanıcı adı ve parola hatalıdır.");
                count -=1;
                System.out.println("Giriş hakkı=" +count);
            }
            if ( count==0){
                System.out.println("Giriş Hakkınız Bitti .. Tekrar Bekleriz");
                break;
            }
        }
    }
}