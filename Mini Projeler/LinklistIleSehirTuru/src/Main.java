import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void islemler_bastir(){
        System.out.println("0-İşlemler Görüntüle");
        System.out.println("1-Sonraki Şehre Git");
        System.out.println("2-Önceki Şehre Git");
        System.out.println("3-Uygulamadan Çık");
    }

    public static void sehrileri_turla(LinkedList<String> sehirler)
    {
        ListIterator <String> iterator = sehirler.listIterator();

        int islem ;
        islemler_bastir();
        Scanner scanner = new Scanner(System.in);

        if (!iterator.hasNext()){
            System.out.println("Herhangi bir şehir bulunmuyor");

        }
        boolean cikis = false;
        boolean ileri = true;

        while (!cikis){
            System.out.println("Bir işlem seçiniz : ");
            islem = scanner.nextInt();

            switch (islem){
                case 0:
                    islemler_bastir();
                    break;
                case 1:
                    if (!ileri){
                        if (iterator.hasNext()){
                            iterator.next();
                        }
                        ileri = true;
                    }
                    if (iterator.hasNext()) {
                        System.out.println("Şehre gidiliyor:" + iterator.next());
                    }
                    else {
                        System.out.println("Gidilecek şehir kalmadı.");
                    }

                    break;
                case 2:

                    if (ileri){
                        if (iterator.hasPrevious()){
                            iterator.previous();
                        }
                        ileri = false;
                    }
                    if (iterator.hasPrevious())
                        System.out.println("Şehre gidiliyor:" + iterator.previous());
                    else {
                        System.out.println("Şehir turu başladı...");
                    }

                    break;
                case 3:
                    cikis = true;
                    System.out.println("Uygulamadan çıkılıyor.");
                    break;
            }
        }


    }
    public static void main(String[] args) {
        LinkedList<String> sehirler = new LinkedList<>();
        sehirler.add("Ankara");
        sehirler.add("ESkişehir");
        sehirler.add("Afyon");
        sehrileri_turla(sehirler);

    }
}