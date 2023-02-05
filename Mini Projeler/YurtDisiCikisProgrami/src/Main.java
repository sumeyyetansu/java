public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz...");
        String sartlar ="Yurtdışı çıkış kuralları...\n" +
                "15 tl harç bedelini tam olarak yatırmanız gerekiyor.\n" +
                "Herhangi bir siyasi yasağınızın bulunamaması gerekiyor.\n" +
                "Gideceğiniz ülkeye vizenizin bulunması gerekiyor.";
        String message = "Yurtdışı şartlarının hepsini sağlamanız gerekiyor.";

        while (true){
            System.out.println("******************");
            System.out.println(sartlar);
            System.out.println("******************");

            Yolcu yolcu = new Yolcu();
            System.out.println("Harç bedeli kontrol ediliyor...");
            Thread.sleep(3000);

            if (yolcu.yurtdisiHarciKontrol() == false){
                System.out.println(message);
                continue;
            }

            System.out.println("Siyasi yasak kotrol ediliyor...");
            Thread.sleep(3000);

            if (yolcu.siyasiYasakKontrol() == false){
                System.out.println(message);
                continue;
            }

            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(3000);

            if (yolcu.vizeDurumu() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("İşlemleriniz tamam!Yurtdışına çıkabilrisiniz");
            break;

        }
    }
}