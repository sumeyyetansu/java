public class Kare extends Sekil {
    private int kenar;
    public Kare(String isim , int kenar) {
        super(isim);
    }

    @Override
    void alan_hesapla() {
        System.out.println(getIsim() + " alanı " + (kenar * kenar));

    }
    public void cevre_hesapla(){
        System.out.println(getIsim() + "nin cevresi " + (4 * kenar));
    }
}
