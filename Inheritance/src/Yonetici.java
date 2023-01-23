public class Yonetici extends Calisan
        {
            private int sorumlu_kisi ;
            public Yonetici ( String isim , int maas , String departman , int sorumlu_kisi)  {

                super ( isim, maas, departman);
                this.sorumlu_kisi = sorumlu_kisi ;


            }
            public void zam_yap(int zam_miktari){
                System.out.println("Çalışanlara " + zam_miktari +" tl zam yapıldı.");
            }

            public void bilgilerigoster (){
                super.bilgilerigoster();
                System.out.println("Sorumlu kişi sayısı : " + this.sorumlu_kisi );

            }
    }

