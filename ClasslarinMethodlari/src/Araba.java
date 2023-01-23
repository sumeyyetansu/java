public class Araba {
    private String renk ;
    private int kapilar ;
    private int tekerlekler ;
    private String model ;
    private String motor ;

    public String getRenk (){
        return renk;
    }
    public void setRenk(String renk){
        this.renk = renk;
    }

    public int getKapilar() {
        return kapilar;
    }

    public void setKapilar(int kapilar) {

        if  (kapilar<0){
            System.out.println("Kapı sayısı 0'dan küçük olamaz!");
        }
        this.kapilar = kapilar;
    }

    public int getTekerlekler() {
        return tekerlekler;
    }

    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
