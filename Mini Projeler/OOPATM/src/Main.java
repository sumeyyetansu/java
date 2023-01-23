public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM() ;

        Hesap hesap = new Hesap("Sümeyye", "123456",500000 );
        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor.");
    }
}