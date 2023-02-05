public class Main {
    public static void main(String[] args) {
        //Sekil sekil = new Sekil()  Hata verir çünkü abstract class

        Kare kare1 = new Kare("Kare1" , 5);
        Daire daire1 = new Daire("Daire1" ,3 );
        kare1.alan_hesapla();
        daire1.alan_hesapla();
        Sekil sekil;
        sekil = new Kare("Kare2" , 6)  ; // abstract classın referansını alt sınıflar eşitleyebliyor.








    }
}
