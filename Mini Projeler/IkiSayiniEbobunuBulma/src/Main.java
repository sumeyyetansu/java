import java.util.Scanner;

public class Main {
    public static int ebobBulma (int sayi1 , int sayi2 ){

        int ebob = 1;
        for ( int i=1; i<= sayi1 && i<= sayi2 ; i++){
            if ( sayi1 % i ==0 && sayi2 % i == 0){
            ebob = i;
            }
        }
        return ebob;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz= ");
        int sayi1 = scanner.nextInt();
        System.out.print("İkinci Sayıyı Giriniz= ");
        int sayi2 = scanner.nextInt();

        System.out.print("İki Sayının Ebobu =" + ebobBulma(sayi1 , sayi2 ));
    }
}