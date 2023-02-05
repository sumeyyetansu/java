public class Main {
    public static void main(String[] args) {
        Seyirci seyirci1 = new Seyirci("Yusuf");
        Seyirci seyirci2 = new Seyirci("Sümeyye");
        seyirci1.oyun_seyret();
        seyirci2.oyun_seyret();

        System.out.println("Seyirci Sayısı: " + seyirci1.seyirci_sayisi);
        System.out.println("Seyirci Sayısı: " + seyirci2.seyirci_sayisi);

    }
}
