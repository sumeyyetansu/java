import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Lütfen Bir İşlem Giriniz!");
        int islem = scanner.nextInt();


         if ( islem == 1 )
         {
             System.out.println("Birinci işlem");
         }

         else if ( islem== 2) {

             System.out.println("İkinci işlem");
         }
         else if ( islem== 3) {

             System.out.println("Üçüncü işlem");
         }
         else if ( islem== 4) {

             System.out.println("Dördüncü işlem");
         }
         else {
             System.out.println("Geçersiz işlem!");

         }
    }*/
        System.out.println("Lütfen Notunuzu Giriniz!:");
        int not = scanner.nextInt();

        if (not >= 90){
            System.out.println("AA");

        }
        else if ( not >= 85) {
            System.out.println("BA");

        }
        else if ( not >= 80) {
            System.out.println("BB");

        }
        else if ( not >= 75) {
            System.out.println("CA");

        }
        else if ( not >= 70) {
            System.out.println("CC");

        }
        else if ( not >= 65) {
            System.out.println("DC");

        }
        else if ( not >= 60) {
            System.out.println("DD");

        }

        else {
            System.out.println("Dersten Kaldınız!");
        }
    }


}