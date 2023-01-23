public class Idman {
    private int burbee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public int getBurbee_sayisi() {
        return burbee_sayisi;
    }

    public void setBurbee_sayisi(int burbee_sayisi) {
        this.burbee_sayisi = burbee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }

    public Idman(int burbee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
        this.burbee_sayisi = burbee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;


    }
    public void hareketYap (String hareketTuru , int sayi ){
        if ( hareketTuru.equals("burbee") ){
            burbeeYap(sayi);
        } else if (hareketTuru.equals("pushup")) {
            pushupYap(sayi);

        } else if (hareketTuru.equals("situp")) {
            situpYap(sayi);

        } else if (hareketTuru.equals("squat")) {
            squatYap(sayi);
        }else{
            System.out.println("Geçersiz hareket türü.");
        }
    }

    public void burbeeYap(int sayi){
        if(burbee_sayisi==0){

            System.out.println("Yapacak Burbee sayısı kalmadı.");

        } else if (burbee_sayisi - sayi <=0) {

            burbee_sayisi-=sayi=0;
            System.out.println("Hedeflediğiniz Burbee sayısını geçtiniz. Tebrikler.");

        }else {

            burbee_sayisi-=sayi ;
            System.out.println("Kalan Burbee sayısı=" + burbee_sayisi);
        }
    }

    public void pushupYap(int sayi){
        if(pushup_sayisi==0){

            System.out.println("Yapacak Pushup sayısı kalmadı.");

        } else if (pushup_sayisi- sayi<=0) {

            pushup_sayisi-=sayi=0;
            System.out.println("Hedeflediğiniz Pushup sayısını geçtiniz. Tebrikler.");

        }else {

            pushup_sayisi-=sayi ;
            System.out.println("Kalan Burbee sayısı=" + pushup_sayisi );
        }
    }

    public void situpYap(int sayi){
        if(situp_sayisi == 0){

            System.out.println("Yapacak Situp sayısı kalmadı.");

        } else if (situp_sayisi - sayi <=0) {

            situp_sayisi -= sayi=0;
            System.out.println("Hedeflediğiniz Situp sayısını geçtiniz. Tebrikler.");

        }else {

            situp_sayisi -= sayi ;
            System.out.println("Kalan Situp sayısı=" + situp_sayisi);
        }
    }

    public void squatYap(int sayi){
        if(squat_sayisi == 0){

            System.out.println("Yapacak Squat sayısı kalmadı.");

        } else if (squat_sayisi - sayi <= 0) {

            squat_sayisi -= sayi = 0;
            System.out.println("Hedeflediğiniz Squat sayısını geçtiniz. Tebrikler.");

        }else {

            squat_sayisi -= sayi ;
            System.out.println("Kalan Squat sayısı=" + squat_sayisi);
        }

    }
    public boolean idmanBittiMi(){
        return (burbee_sayisi==0)&& (pushup_sayisi==0) && (situp_sayisi==0) && (squat_sayisi==0);
    }
}
