import java.util.Scanner;

public class Main {
    public static void faktoriyel_fonksiyon (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz=");
        int sayi = scanner.nextInt();
        int faktoriyel = 1;
        while (sayi>0 ){

            faktoriyel *= sayi ;
            sayi --;
        }
        System.out.println("Faktöriyel=" +faktoriyel);

    }
    public static void main(String[] args) {

        faktoriyel_fonksiyon();
        faktoriyel_fonksiyon();

    }
}