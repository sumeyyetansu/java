import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);
        System.out.println("İşlem Giriniz");
        int islem = scanner.nextInt();

        switch (islem) {
        case 1:
            System.out.println("1. işlem");
            break;
        case 2:
            System.out.println("2. işlem");

        case 3:
            System.out.println("3. işlem");
            break;
        case 4:
            System.out.println("4. işlem");
            break;
        default :
            System.out.println("Geçersiz İşlem");
    }
    }
}