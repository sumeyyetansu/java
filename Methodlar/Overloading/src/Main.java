public class Main {
    /*public static void toplama( int a,int b){
        System.out.println("Toplamları="+ (a+b));
    }
    public static void toplama(int a ,int b,int c){
        System.out.println("Toplamları="+(a+b+c));
    }
    public static void toplama(String a,String b){
        System.out.println(a+" "+b); // "" arada boşluk olsun diye koyuldu
    }

     */
    public static void skorhesaplama(String isim, int puan){
        System.out.println(isim + " adlı oyuncunun "+puan+" puanı var. ");
    }
    public static void skorhesaplama(String isim){
        System.out.println(isim + " adlı oyuncunun hiç puanı yok.");
    }
    public static void skorhesaplama(int puan){
        System.out.println("isimsiz oyuncun "+ puan +" puanı var");
    }
    public static void main(String[] args) {

       /* toplama(3,5,6);
        toplama(4,5);
        toplama("sümeyye","yusuf");
        */
        skorhesaplama("Sümeyye" , 15000);
        skorhesaplama(10000);
        skorhesaplama("Yusuf");

    }
}