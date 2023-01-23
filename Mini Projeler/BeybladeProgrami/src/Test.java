import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        System.out.println("Beyblade Fabrikasına Hoşgeldiniz.");
        System.out.println("Çıkış için 'q' ya basınız.");

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Hangi Beyblad'i üretmek istiyorsunuz? \n" +
                    "Dranza\n" +
                    "Drayga\n" +
                    "Draciel\n" +
                    "Dragon :");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor.");
                break;

            }else {
                BeybladeFabrikasi fabrikasi = new BeybladeFabrikasi();

                Beyblade beyblade =fabrikasi.beybladeUret(islem);

                if (beyblade== null){
                    System.out.println("Lütfen Geçerli Bir Beyblade İsmi Giriniz.");
                }else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCıkar();
                }
            }
        }
    }
}