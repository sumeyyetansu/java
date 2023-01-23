import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*int [][] array = new int [2] [2];

        int [][] array2 = {{10,20}, {30 ,40 }};
        array2 [0][0] = 10;
        array2 [1][1] = 30;

         */
        int [][] array2 = new int[2][2];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i< 2; i++){
            for (int j = 0; j<2; j++){

              array2 [i][j]= scanner.nextInt();
            }
        }
        for (int i = 0; i< 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println(" ");
        }


    }
}