import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz:");
        while (true) {
            int sayi = scanner.nextInt();
            if (sayi == -1){
                System.out.println("Döngüden çıkılıyor.");
                break;
            }
            System.out.println("Sayı=" +sayi);
        }

        */


        /*for (int i=0; i<10; i++) {
            if(i==3 || i==5){
            continue;}
            System.out.println("i=" +i );
        }

         */
        int i = 0;
        while (i<10){
            if( i==3 || i==5 ) {
                i++; // bunu yazmazsak döngü sonsuz döngü olur. For döngüsünde olmaz çünkü bu durumu for döngüsünde baştan tanımlıyoruz.
                continue;
            }
            System.out.println("i="+i);
        }
    }
}