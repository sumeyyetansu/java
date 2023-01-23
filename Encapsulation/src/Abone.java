public class Abone {

    public String isim;
    public int bakiye;
    public String sehir;

    public void dogalgaz_kullan(int miktar){

        if (this.bakiye - miktar < 0){
            System.out.println("Yeterli bakiye yok.");
        }
        else {
            this.bakiye -= miktar ;
            if (this.bakiye<=0 ){
                System.out.println("Bakiyeniz bitmiştir.Lütfen en yakın abone merkezine giderek kredi yükleyiniz.");
            }else {
                System.out.println("Yeni bakiyeniz = "+ bakiye);
            }
        }
    }
    public void bakiye_ogren(){
        System.out.println("Bakiye = " +bakiye);
    }
}
