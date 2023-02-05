public class Seyirci {
    private String isim ;
    public int seyirci_sayisi = 0;

    public Seyirci (String isim){
        this.isim = isim;
        seyirci_sayisi ++;
    }
    public void oyun_seyret(){
        System.out.println(isim + " oyun seyrediyor.");
    }


}
