import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    // beden kitle endekis=kilo/(boy*boy)
    {
        /* vki < 18.5 ise zayıf
           vki 18.5 ile 25 arasında ise normal
           vki 25 ile 30 arasında ise fazla kilolu
           vki 30 dan fazla ise obez
         */

       Scanner scanner = new Scanner(System.in);
        System.out.print("Kilonuzu Giriniz! =");
        int kilo = scanner.nextInt();

        System.out.print("Boyunuzu Giriniz! Örnek:1,82=");
        double boy = scanner.nextDouble();

        double vki = kilo / ( boy * boy );
        System.out.print("Vücut Kitle İndeksiniz= " + vki);

        if ( vki< 18.5 ){
            System.out.print(" Zayıf");
        }
        else if ( 18.6 <vki && vki < 25 ) {
            System.out.print(" Normal ");
        }
        else if ( 25< vki && vki < 30 ){
            System.out.print(" Fazla kilolu ");
        }
        else {
            System.out.print(" Obez ");
        }


    }
}