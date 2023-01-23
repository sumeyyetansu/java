import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("Çalışanlar programına hoşgeldiniz....");
        String islemler = "İşlemler\n" +
                "1. Yazılımcı İşlemleri\n"+
                "2.Yönetici İşlemleri\n" +
                "Çıkmak için q'ya basınız.";

        System.out.println("************************");
        System.out.println(islemler);
        System.out.println("************************");

        while (true){
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
            String islem =scanner.nextLine();
            
            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor.");
                break;

            } else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Sümeyye", "Tanşu", 123 , "Java, C++ ");
                String yazilimci_islemleri = "Yazılımcı İşlemleri\n" +
                        "1. Yazılımcı Bilgilerini Göster\n" +
                        "2. Format At\n" +
                        "Yazılımcı İşlemlerinden Çıkmak için q'ya basınız";
                System.out.println("************************");
                System.out.println(yazilimci_islemleri);
                System.out.println("************************");

                while (true){
                    System.out.print("Lütfen yapmak istediğiniz yazılımcı işlemini seçiniz: ");
                    String yazilimci_islem =scanner.nextLine();

                    if (yazilimci_islem.equals("q")){
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor.");
                        break;

                    } else if (yazilimci_islem.equals("1")) {
                        yazilimci.bilgileri_goster();

                    }else if (yazilimci_islem.equals("2")){
                        System.out.print("İşletim sistemi:" );
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);

                    }else {
                        System.out.println("Geçersiz yazılımcı işlemi.Tekrar deneyiniz");
                    }

                }

                
            }else if (islem.equals("2")){
                Yonetici yonetici = new Yonetici("Yusuf", "Tanşu" , 456, 1);
                String yonetici_islemleri = "Yönetici İşlemleri \n" +
                        "1. Yönetici Bilgilerini Göster\n" +
                        "2. Zam Yap.\n" +
                        "Yönetici İşlemlerinden Çıkmak İçin q'ya Basınız.";
                System.out.println("************************");
                System.out.println(yonetici_islemleri);
                System.out.println("************************");

                while (true){
                    System.out.print("Lütfen yapmak istediğiniz yönetici işlemini seçiniz: ");
                    String yonetici_islem =scanner.nextLine();

                    if (yonetici_islem.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkılıyor.");
                        break;

                    }else if (yonetici_islem.equals("1")){
                        yonetici.bilgileri_goster();

                    } else if (yonetici_islem.equals("2")) {
                        System.out.print("Yapılmasını istediğiniz zam miktarı:");
                        int zam_miktari = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zam_miktari);

                    }else {
                        System.out.println("Geçersiz yönetici işlemi.Tekrar deneyiniz");
                    }
                }

            }else {
                System.out.println("Geçersiz işlem.Tekrar deneyiniz");
            }
        }
        

    }
}