import java.util.ArrayList;

public class Sarkicilar {
    private ArrayList<String>sarkici_listesi = new ArrayList<String>();

    public void sarkicilari_bastir(){
        System.out.println("Şarkıcı Listesinde " + sarkici_listesi.size() + " kadar şarkıcı var.");
        for (int i = 0 ; i<sarkici_listesi.size() ; i++){
            System.out.println("Şarkıcı : " + sarkici_listesi.get(i));
        }
    }
    public void sarkicilari_ekle(String isim ) {
        sarkici_listesi.add(isim);
        System.out.println("Şarkıcı listesi güncellendi.");
    }
    public void sarkicilari_guncelle(String yeni_isim , int poziyon){
        sarkici_listesi.set(poziyon-1 , yeni_isim);
        System.out.println("Şarkıcı listesi güncellendi.");
    }
    public void sarkicilari_sil(int pozisyon){
        String isim = sarkici_listesi.get(pozisyon -1);
        sarkici_listesi.remove(pozisyon-1);
        System.out.println(isim + " isimli şarkıcı listeden silindi.");
    }
    public void sarkicilari_ara(String sarkici_ismi){
        int pozisyon = sarkici_listesi.indexOf(sarkici_ismi);
        if (pozisyon >= 0 ){
            System.out.println("Şarkıcı bulundu...");
            System.out.println(sarkici_ismi + " isimli şarkıcı " + pozisyon + " pozisyonda.");
        }else {
            System.out.println("Şarkıcı bulunamadı.");
        }

    }

}
