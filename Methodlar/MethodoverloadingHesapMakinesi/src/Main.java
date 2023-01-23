import java.util.Scanner;

public class Main {
    //methodoverloading kulllanarak hesap makiensi toplama ve çarpma işlemi 2 veya 3 parametreli olacak şekilde tasarlanacak.
    public static int toplama(int a, int b) {
        return a + b;
    }

    public static int toplama(int a, int b, int c) {
        return a + b + c;
    }

    public static int cikarma(int a, int b) {
        return a - b;
    }

    public static int carpma(int a, int b) {
        return a * b;
    }

    public static int carpma(int a, int b, int c) {
        return a * b * c;
    }

    public static double bolme(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String islem = "1. işlem = toplama \n" + "2. işlem = çıkarma \n" + "3. işlem = çarpma\n" + "4. işlem = bölme \n" + "q = sistemden çıkış";
        System.out.println("******************");
        System.out.println("İşlemler \n" + islem);
        System.out.println("******************");

        while (true) {
            System.out.print("Bir işlem seçiniz= ");
            islem = scanner.nextLine();
            if (islem.equals("q")) {
                System.out.print("sistemden çıkılıyor.");
                break;
            } else if (islem.equals("1")) {
                System.out.print("Kaç değer toplayacaksınız? ( 2 veya 3 değer girebilirisiniz.)=");
                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {
                    System.out.print("sayı 1=");
                    int a = scanner.nextInt();
                    System.out.print("sayı 2=");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen değerlerin toplamı= " + toplama(a, b));
                } else if (kacsayi == 3) {
                    System.out.print("sayı 1=");
                    int a = scanner.nextInt();
                    System.out.print("sayı 2=");
                    int b = scanner.nextInt();
                    System.out.print("sayı 3=");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Girilen değerlerin toplamı= " + toplama(a, b, c));

                } else {
                    System.out.print("Geçersiz işlem.");
                }

            } else if (islem.equals("2")) {
                System.out.print("sayı 1=");
                int a = scanner.nextInt();
                System.out.print("sayı 2=");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen değerlerin çıkarımı=" + cikarma(a, b));

            } else if (islem.equals("3")) {
                System.out.println("Kaç değer çarpacaksınız? ( 2 veya 3 değer girebilirisiniz.)=");
                int kacsayi = scanner.nextInt();

                if (kacsayi == 2) {
                    System.out.print("sayı 1=");
                    int a = scanner.nextInt();
                    System.out.print("sayı 2=");
                    int b = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Girilen değerlerin çarpımı= " + carpma(a, b));
                } else if (kacsayi == 3) {
                    System.out.print("sayı 1=");
                    int a = scanner.nextInt();
                    System.out.print("sayı 2=");
                    int b = scanner.nextInt();
                    System.out.print("sayı 3=");
                    int c = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Girilen değerlerin çarpımı= " + carpma(a, b, c));
                }

            } else if (islem.equals("4")) {
                System.out.print("sayı 1=");
                int a = scanner.nextInt();
                System.out.print("sayı 2=");
                int b = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Girilen değerlerin bölünmesi=" + bolme(a, b));

            } else {
                System.out.println("Bu method için uygun işlem bulunmuyor. Tekrar deneyiniz.");
            }
        }
    }
}