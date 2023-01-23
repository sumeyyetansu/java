import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){
        Login login = new Login();

        System.out.println("BANKAMIZA HOŞGELDİNİZ.");
        System.out.println("*********************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("*********************");
        Scanner scanner = new Scanner(System.in);
        int girishakki = 3;

        while (true){

            if (login.login(hesap)){
                System.out.println("Giriş başarılı.");
                break;

            } else {
                System.out.println("Giriş başarısız");
                girishakki -= 1;
                System.out.println("Kalan giriş hakıınız " + girishakki);
                
            }
            if (girishakki == 0 ) {
                System.out.println("Giriş Hakkınız Bitmiştir.");
                return;
            }

        }
        String islemler = "1.Bakiye öğrenme\n" +
                "2.Para Yatırma\n" +
                "3.Para Çekme\n" +
                "q Çıkış";

        System.out.println("*****************************");
        System.out.println("İşlemler = \n"+ islemler);
        System.out.println("*****************************");

        while (true){
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");
            String islem = scanner.nextLine();

            if (islem.equals("1")){
                System.out.println(hesap.getBakiye());

            } else if (islem.equals("2")) {
                System.out.print("Yatırmak istediğiniz tutar = ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.para_yatirma(tutar);
                
            } else if (islem.equals("3")) {
                System.out.print("Çekmek istediğiniz tutar= ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.para_cekme(tutar);
                
            } else if (islem.equals("q")) {
                break;
                
            }else {
                System.out.println("Geçersiz işlem");
            }
        }
    }
}
