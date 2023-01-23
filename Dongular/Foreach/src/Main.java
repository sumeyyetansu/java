public class Main {
    public static void main(String[] args) {


        String [] array1 = {"Elma","Armut","Kiraz"};
        int [] array2 = {1, 2, 3, 4, 5, 6 ,7};

        for ( int i : array2 ){
            System.out.println(i);
        }
        for ( String i : array1 ){
            System.out.println(i);
        }

        Deneme [] array3 = { new Deneme("Mustafa") ,new Deneme("Murat") ,new Deneme("Coşkun")};
        for (Deneme d : array3 ){
            d.yaz();
        }
    }
}