import java.util.ArrayList;

public class Main {

    public static void yazdir(ArrayList<String>a){
        for (int i =0 ; i<a.size() ; i ++){
            System.out.println("Element " + (i +1) + i ++);
        }
    }
    public static void main(String[] args) {
        ArrayList<String>arrayList = new ArrayList<>();
        arrayList.add("Serdar Ortaç");
        arrayList.add("Emir Can İğrek");
        arrayList.add("Madrigal");
        arrayList.add("KÖFN");
        arrayList.add("Serdar Ortaç");
       /* System.out.println(arrayList.get(3));
        System.out.println(arrayList.get(0));

        */
        arrayList.remove("KÖFN");
        arrayList.remove(3);
        arrayList.set(0, "Yılız Tilbe");

        System.out.println(arrayList.size());


        for( String i : arrayList){
            System.out.println(i);
        }

        //for ( int i = 0; i < arrayList.size() ; i++){
           // System.out.println(arrayList.get(i));
      //  }




        System.out.println(arrayList.indexOf("Serdar Ortaç"));
        System.out.println(arrayList.lastIndexOf("Serdar Ortaç"));

        yazdir(arrayList);



    }
}