import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz!:");
        int a = scanner.nextInt();

        System.out.print("İkinci Sayıyı Giriniz!:");
        int b = scanner.nextInt();

        System.out.print("Üçüncü Sayıyı Giriniz!:");
        int c = scanner.nextInt();

       int max = -10000 ;

       if ( a>=b && a>=c ) {
            max = a;
        }
        else if ( b>=a && b>=c) {
            max= b;
        }
        else {
            max = c;
        }


        System.out.println("Maksimum sayı:" + max );






    }
}