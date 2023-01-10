import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner( System.in ) ;
        int birinci_sayi ;
        int ikinci_sayi ;

        System.out.println("Birinci Sayıyı Giriniz: ");
        birinci_sayi = scanner.nextInt();

        System.out.println( " İkinci Sayıyı Girniz: ");
        ikinci_sayi = scanner.nextInt() ;

        System.out.println( " Değiştirilmeden Önce Sayılar : ");
        System.out.println( " Birinci Sayi : " + birinci_sayi + " İkinci Sayı :" + ikinci_sayi );

        int gecici = birinci_sayi;
        birinci_sayi = ikinci_sayi ;
        ikinci_sayi = gecici;

        System.out.println( " Değiştiirldikten Sonra Sayılar : ");
        System.out.println( " Birinci Sayi : " + birinci_sayi + " İkinci Sayı" + ikinci_sayi );





    }
}