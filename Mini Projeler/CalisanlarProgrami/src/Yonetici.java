public class Yonetici extends Calisan{
    private int sorumlu_kisi_sayisi;

    public Yonetici(String isim, String soyİsim, int ID , int sorumlu_kisi_sayisi) {
        super(isim, soyİsim, ID);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi ;
    }
    public void zamYap ( int zamMiktari ){
        System.out.println(getIsim() + " " +  zamMiktari + " tl zam yapıyor.");
    }

    @Override
    public void bilgileri_goster() {
        super.bilgileri_goster();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı :" + sorumlu_kisi_sayisi);

    }
}
