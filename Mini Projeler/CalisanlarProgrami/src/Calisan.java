public class Calisan {
    private String isim ;
    private String soyİsim;
    private int ID;

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyİsim() {
        return soyİsim;
    }

    public void setSoyİsim(String soyİsim) {
        this.soyİsim = soyİsim;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Calisan(String isim, String soyİsim, int ID) {
        this.isim = isim;
        this.soyİsim = soyİsim;
        this.ID = ID;
    }
    public void bilgileri_goster (){
        System.out.println("Çalışan Bilgileri:");
        System.out.println("İsim: " + isim);
        System.out.println("Soyisim: " + soyİsim);
        System.out.println("Çalışan ID:" + ID);

    }
}
