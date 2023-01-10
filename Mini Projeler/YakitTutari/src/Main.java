import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print(" Aracınız Kilometre Başına Kaç Kuruş Yakıyor? ( örnek: 0,75 ) = ");

        double kurus = scanner.nextDouble();

        System.out.print( " Aracınızla Kaç Kilometre Gittniz ? = ");
        int kilometre = scanner.nextInt();

        System.out.print( " Ödemeniz gereken Tutar = " + kurus * kilometre + " Tl dir." );

        }
}