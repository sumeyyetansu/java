public class PcMuhendisi implements IMuhendis {

    private boolean askerlik ;
    private boolean adli_sicil ;

    public PcMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void askerlik_durumu_sorgula() {
        if (askerlik == true){
            System.out.println("Askerliğimi yaptım");
        }
        else{
            System.out.println("Askerliğimi henüz yapmadım.");
        }

    }

    @Override
    public void adli_sicil_kaydi_sorgula() {
        if (adli_sicil==true){
            System.out.println("Adli sicil kaydım bulunuyor.");
        }
        else {
            System.out.println("Herhangi bir asli sicil kaydım bulunmuyor");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return "Ortalama : " + derece ;
    }

    @Override
    public void is_tecrübesi(String[] array) {
        if (array.length == 0){
            System.out.println("Herhangi bir iş tecrübem bulunmuyor.");
        }
        else {
        System.out.println("Bilgisayar mühendisi olarak şu şirketlerde çalıştım :");
        for (int i =0 ; i<array.length ; i++){
            System.out.println(array[i]);
            }
        }
    }
}
