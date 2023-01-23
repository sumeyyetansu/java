public class Kopek extends Hayvan {
    private int dis_sayisi ;
    public Kopek(String isim ,int kilo , String boy , int bacak_sayisi , int dis_sayisi){
        super(isim, kilo, boy , bacak_sayisi );
        this.dis_sayisi = dis_sayisi;
    }
    public void kos( int hiz){
        System.out.println("Köpek koşuyor...");
        super.harekete_gec(hiz);

    }
}
