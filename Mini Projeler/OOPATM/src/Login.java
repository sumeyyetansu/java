import java.util.Scanner;

public class Login {
    public boolean login(Hesap hesap){
        Scanner scanner =new Scanner(System.in);
        String kullanici_adi ;
        String parola ;


        System.out.print("Lütfen kullanıcı adını giriniz=");
        kullanici_adi =scanner.nextLine();

        System.out.print("Lütfen parolanızı giriniz=");
        parola = scanner.nextLine();


        if(hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola) ){
            return true;
        } else if (!hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)) {
            System.out.println("Kullanıcı adı hatalıdır.Tekrar deneyiniz.");
            return false;

        } else if (hesap.getKullanici_adi().equals(kullanici_adi) && hesap.getParola().equals(parola)) {
            System.out.println("Parola hataıdır.Tekrar deneyiniz");
            return false;
        } else {
            System.out.println("Kullanıcı adı ve parola hatalıdır.Tekrar deneyiniz.");
            return false;
        }


    }
}
