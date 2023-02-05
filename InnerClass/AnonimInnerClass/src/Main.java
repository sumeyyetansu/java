public class Main {
    public static void main(String[] args) {
        IOgrenci ogrenci = new IOgrenci() {
            @Override
            public void ders_calis() {
                System.out.println("Ders çalışıyorum");
            }

            @Override
            public void derse_gir() {
                System.out.println("Derse giriyorum.");

            }
        };
        ogrenci.ders_calis();
        ogrenci.derse_gir();
        AOgrenci ogrenci1 = new AOgrenci("Sümeyye" , 48) {
            // ogrenci objesi tanımladığmız için abstrac classın özellikelrini alabiliyoruz.
            @Override
            void kayit_yaptir() {
                System.out.println("Kayıt yapılıyor. " + "isim :" + getIsim() + "numara : " + getNumara());

            }
        };
        ogrenci1.kayit_yaptir();
        ogrenci1.selamla();
    }
    public static abstract class AOgrenci{
        //abstract class birclass olduğu ve gövdeli bir method içerdiği için içindekilere ulaşmamız için static olmak zorunda
        private String isim;
        private int numara;

        public AOgrenci(String isim, int numara) {
            this.isim = isim;
            this.numara = numara;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }

        abstract void kayit_yaptir();
        public void selamla(){
            System.out.println("Selamlar");
        }
    }
    public interface IOgrenci{
        void ders_calis();
        void derse_gir();
    }
}