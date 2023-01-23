public class Main {
    public static void main(String[] args) {
        String a= "Sümeyye";
        String b = new String("Sümeyye");
        System.out.println(b);

        System.out.println("Harf sayısı:" + b.length());// Stringin boyunu bulmak için kullanılır.
        // Stringlerin indexlenmesi Arraylerle aynı

        //a[0]; erişemeyiz.
      /*  System.out.println("0. index : " + b.charAt(0));
        System.out.println("2. index : " + b.charAt(2));
        System.out.println("Son eleman :" + b.charAt(b.length()-1));// son eleman bulmak için
        System.out.println(b.startsWith("Sü")); // başlıyor mu true yada false döner
        System.out.println(b.endsWith("ye"));// bitiyor mu true yada false döner
        System.out.println(b.indexOf('c')); //içerisinde harf aramak için
        System.out.println(b.lastIndexOf('y'));// son harfini bulmak için
        System.out.println(b.toLowerCase());//büyük harfleri küçüğe çevirmek için.
        System.out.println(b.toUpperCase());//küçük harfleri büyüğe çevirmek için.

       */

        for(int i = 0 ; i < b.length() ; i++)
        {
            System.out.println(b.charAt(i)); // harfleri tek tek yazdırmak için.
        }

        /*String a1 = "1923";
        int b1 = Integer.parseInt(a1); // Stringi integera çevirmek için
        System.out.println(b1-42);

         */
        int b1= 1923;
        String a1 = String.valueOf(b1); // integeri Stringe çevirmek için.

        String a2 = "sümeyye";
        String b2 = "sümeyye";// bellekte aynı yeri gösterir.

        if (a2==b2) {
            System.out.println("Eşitler");
        }

        String b3 = new String("sümeyye");
        String a3 = new String("sümeyye");

        if(b3==a3){
            System.out.println("eşitler");

        }else {
            System.out.println("eşit değil");
        }
        if(b3.equals(a3)){          // içeriğini kontrol etmiş oluyoruz. eşit olur.
            System.out.println("eşitler");
        }


    }
}