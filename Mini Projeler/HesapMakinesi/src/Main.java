import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**************");
        String islemler =  " + Toplama İşlemi \n" +
                " - Çıkarma İşlemi \n" +
                " * Çarpma İşlemi \n"+
                " / Bölme İşlemi ";
        System.out.println( islemler);
        System.out.println("İşlemi Seçiniz !");
        String islem = scanner.nextLine();
        System.out.println("**************");
         int a ;
         int b ;

        /* switch (islem){
            case "+" :
                System.out.print("Birinci Sayı=");
                a =scanner.nextInt();
                System.out.print("İkinci Sayı=");
                b =scanner.nextInt();
                System.out.print( "Girilen Değerlerin Toplamı= " + (a+b)  );
                break;
            case "-" :
                System.out.print("Birinci Sayı=");
                a =scanner.nextInt();
                System.out.print("İkinci Sayı=");
                b =scanner.nextInt();
                System.out.print( "Girilen Değerlerin Çıkarımı= " + (a-b)  );
                break;

            case "*" :
                System.out.print("Birinci Sayı=");
                a =scanner.nextInt();
                System.out.print("İkinci Sayı=");
                b =scanner.nextInt();
                System.out.print( "Girilen Değerlerin Çarpımı= " + (a*b)  );
                break;
            case "/" :
                System.out.print("Birinci Sayı=");
                a =scanner.nextInt();
                System.out.print("İkinci Sayı=");
                b =scanner.nextInt();
                System.out.print( "Girilen Değerlerin Bölümü= " + ((double)a/b)  );
                break;
            default:
                System.out.print("Geçersiz İşlem");
                break;
        }

         */

        if (islem.equals("+")) {
            System.out.print("Birinci Sayı=");
            a =scanner.nextInt();
            System.out.print("İkinci Sayı=");
            b =scanner.nextInt();
            System.out.print( "Girilen Değerlerin Toplamı= " + (a+b)  );

        }
        else if (islem.equals("-")) {
            System.out.print("Birinci Sayı=");
            a =scanner.nextInt();
            System.out.print("İkinci Sayı=");
            b =scanner.nextInt();
            System.out.print( "Girilen Değerlerin Çıkarımı= " + (a-b)  );

        }
        else if (islem.equals("*")){
            System.out.print("Birinci Sayı=");
            a =scanner.nextInt();
            System.out.print("İkinci Sayı=");
            b =scanner.nextInt();
            System.out.print( "Girilen Değerlerin Çarpımı= " + (a*b)  );
        }
        else if (islem.equals("/")){
            System.out.print("Birinci Sayı=");
            a =scanner.nextInt();
            System.out.print("İkinci Sayı=");
            b =scanner.nextInt();
            System.out.print( "Girilen Değerlerin Bölümü= " + ((double)a/b));
        }
        else {
            System.out.print("Geçersiz İşlem");
        }

    }
}