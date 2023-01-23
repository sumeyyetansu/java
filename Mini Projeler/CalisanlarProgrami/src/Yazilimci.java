public class Yazilimci extends Calisan {
    private String diller;
    public Yazilimci(String isim, String soyİsim, int ID , String diller) {
        super(isim, soyİsim, ID);
        this.diller = diller;
    }
    public void formatAt (String isletim_sistemi){
        System.out.println(getIsim() + " " +isletim_sistemi + "  yüklüyor.");
    }
    public void bilgileri_goster(){
        super.bilgileri_goster();
        System.out.println("Yazılımcının bildiği diller:  " +diller);
    }
}
