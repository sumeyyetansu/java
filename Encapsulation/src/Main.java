public class Main {
    public static void main(String[] args) {
        /*Abone abone = new Abone();
        abone.isim = "Sümeyye";
        abone.bakiye= 120;
        abone.sehir = "İstanbul";
        abone.dogalgaz_kullan(120);

         */
        GelismisAbone abone = new GelismisAbone("Sümeyye", 120 , "İstanbul");
        abone.dogalgaz_kullan(500);



    }
}