import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* while döngüsü ile bir ATM programı yapımı
        işlemler=
        1.işlem : bakiye öğrenme
        2.işlem : para çekme
        3.işlem : para yatırma
        çıkış:q
         */
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        System.out.println("***************");
        String islemler = "1.işlem : bakiye öğrenme\n" +
                "        2.işlem : para çekme\n" +
                "        3.işlem : para yatırma\n" +
                "        çıkış:q ";
        System.out.println("İşlemler" +islemler);
        System.out.println("***************");

       while(true){
           System.out.print("İşlemi seçiniz=");
           String islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor!");
                break;

            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz=" + bakiye);

            }
            else if (islem.equals("2")) {
                System.out.print("Lütfen çekmek istediğiniz tutarı giriniz=");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                if (bakiye<tutar){
                    System.out.println("Yeteresiz Bakiye! Bakiyeniz=" + bakiye);
                }
                else{
                    bakiye-=tutar;
                    System.out.println("Yeni bakiyeniz=" +bakiye);
                }
            }
            else if (islem.equals("3")) {
                System.out.print("Lütfen yatırmak istediğiniz tutarı giriniz=" );
                int tutar= scanner.nextInt();
                scanner.nextLine();
                bakiye+=tutar;
                System.out.println("Yeni bakiyeniz="+bakiye);
            }
            else {
                System.out.println("Geçersiz işlem!");
            }
        }

    }
}