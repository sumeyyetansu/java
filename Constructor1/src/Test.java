import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Account account1 = new Account("12345678", 10000, "Sümeyye ", "sumeyye.gmail.com", "89839578");

        System.out.println(account1.getBakiye());

        Scanner scanner = new Scanner(System.in);
        String islemler = "Para yatırma= 1 \n" +
                "Para Çekme= 2 \n" + "Bakiye öğrenme = 3\n" +
                "Çıkış = q";
        System.out.println("**************************");
        System.out.println("İşlemler \n" +islemler);
        System.out.println("**************************");

        while (true) {
            System.out.print("Lütfen yapmak istediğiniz işlemi giriniz=");
            String islem = scanner.nextLine();

            if (islem.equals("1")) {

                System.out.print("Lütfen yatırmak istediğiniz miktarı giriniz= ");
                double miktar = scanner.nextInt();
                account1.paraYatirma(miktar);
                scanner.nextLine();

            } else if (islem.equals("2")) {
                System.out.print("Lütfen çekmek istediğiniz miktarı giriniz= ");
                double miktar = scanner.nextInt();
                scanner.nextLine();
                account1.paraCekme(miktar);

            } else if (islem.equals("3")) {
                System.out.println("Bakiyeniz" + account1.getBakiye());

            } else if (islem.equals("q")) {
                System.out.print("Sistemden çıkılıyor.");
                break;

            } else {
                System.out.print("Geçersiz işlem");
            }

        }
    }
}
