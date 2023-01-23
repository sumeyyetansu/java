public class Hayvan {

    private String isim ;
    private int kilo ;
    private String boy ;
    private int bacak_sayisi ;

    public Hayvan(String isim, int kilo, String boy, int bacak_sayisi) {
        this.isim = isim;
        this.kilo = kilo;
        this.boy = boy;
        this.bacak_sayisi = bacak_sayisi;
    }

    public void harekete_gec ( int hiz ){
        System.out.println( isim  + hiz + " ile harekete geçiyor.");
    }

    public void yemek_ye(){
        System.out.println( isim + " şu anda yemek yiyor." );
    }
}
