import java.util.Scanner;

public class Main {

    public static void arrayi_bastir(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + " : " + array[i]);
        }
    }

    public static double ortalamaBul(int [] array) {
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + " : " + array[i]);
            toplam += array[i];

        }
        return ((double) toplam / array.length);
    }


        public static void main(String[] args) {
        int [] b = {10 ,20 ,30 ,40 ,50, 60};
        arrayi_bastir(b);

        System.out.println("ortalama: " + ortalamaBul(b));



       //int a = 5;

       // int [] a ;
        //double [] b ;
      /*  int [] a = new int [10]; // bellekte 10 elemanlık yer ayırtır.

        a [9] = 50 ; // Arraylerde index kullanılır.Bu indekx 0'dan başlar. Array 2in 9. elemanını gösteriyor.

        int [] b = {30,40,50,60,70};
        System.out.println(a[0]);
        System.out.println(a[2]);
        System.out.println(a[6]);

       */
      /*  int [] a = new int[5];
        for(int i= 0 ; i<5 ; i++ ){
            a[i] = i * 4 + 2 ;
         }

       */


        /*int [] a = new int[5];
        for (int i = 0 ; i<5 ; i++){
            System.out.println(a[i]);
        }

         */

        /*
        int [] a = new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0 ; i<5 ; i++ ){
            a[i] =scanner.nextInt();
            System.out.println(a[i]);
        }

         */

        /* int [] b = {10 ,20 , 30 ,40 ,50};
        System.out.println("Arrayimizin uzunluğu: " +b.length); // arrayin uzunluğunu ölçmek için kullanılır.

         */

    }
}