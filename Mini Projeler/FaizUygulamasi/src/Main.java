import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Kullancıdan ana para değeri ve paasını kaç yıl vadeli yatırmak istediği bilgisi alınır veher sene sonunda toplam para miktarı ekrana yazdırılır.
        faiz oranı =%6faiz oranı
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("**************************");
        System.out.println("Bankamıza Hoşgeldiniz.");
        System.out.println("Bakamızın Faiz Oranı %6'dır.");
        System.out.println("**************************");

        int anapara ,vade ;
        System.out.print(" Yatırmak İstediğiniz Tutarı Giriniz = ");
        anapara = scanner.nextInt();
        System.out.print("Paranızı Kaç Yıl Vade İle Yatırmak İstersiniz =");
        vade = scanner.nextInt();

        double toplampara = anapara;
        double faiz_Orani = 0.06 ;

        for ( int i=1 ; i<= vade ; i++ ){

            toplampara = (toplampara * faiz_Orani) +toplampara ;

            System.out.println(i + ".yılın sonuda toplam paranız=" + (int)toplampara);

        }
    }
}