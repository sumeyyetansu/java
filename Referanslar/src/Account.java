public class Account {
    private String hesapNo;
    private double bakiye;
    private String isim;
    private String email;
    private String telefon;

    public Account() {
        this.hesapNo = "Bilgi Yok" ;
        this.bakiye = 0 ;
        this.isim = "Bilgi Yok" ;
        this.email = "Bilgi Yok" ;
        this.telefon = "Bilgi Yok" ;
    }

    public Account( String hesapNo , double bakiye, String isim, String email , String telefon ){
        this.hesapNo = hesapNo ;
        this.bakiye = bakiye ;
        this.isim = isim ;
        this.email = email ;
        this.telefon = telefon ;
    }

    public  Account (String isim , String email , String telefon){
        this("Bilgi yok", 0,isim ,email,telefon );

    }

    public void bilgileriGoster (){
        System.out.println("Hesap No: " + this.hesapNo);
        System.out.println("Bakiye: " + this.bakiye);
        System.out.println("İsim: " + this.isim);
        System.out.println("Email: " + this.email);
        System.out.println("Telefon: " + this.telefon);


    }
    public String getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(String hesapNo) {
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
