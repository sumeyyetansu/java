public class Main {
    public static void main(String[] args) {
       // PcMuhendisi muhendisi1 = new PcMuhendisi(false,false);
        IMuhendis muhendis1 = new PcMuhendisi(false,false);

        muhendis1.askerlik_durumu_sorgula();
        muhendis1.adli_sicil_kaydi_sorgula();
        System.out.println(muhendis1.mezuniyet_ortalamasi(3.00));
        String[] tecrube ={"vestel" , "Havelsan" , "Turksaat"};
        muhendis1.is_tecrübesi(tecrube);


        MakineMuhendisi muhendisi2 = new MakineMuhendisi(true,false);

        muhendisi2.askerlik_durumu_sorgula();
        muhendisi2.adli_sicil_kaydi_sorgula();
        System.out.println(muhendisi2.mezuniyet_ortalamasi(2.58));
        String[] tecrube2 ={};
        muhendisi2.is_tecrübesi(tecrube2);
        String [] referans = {"Yusuf Tanşu"};
        muhendisi2.calis();
    }
}