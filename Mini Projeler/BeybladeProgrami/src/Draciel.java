public class Draciel extends Beyblade {
    private String kutsalCanavar;

    public Draciel(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCAnavar ) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCAnavar ;
    }

    public String getKutsalCanavar() {
        return kutsalCanavar;
    }

    public void setKutsalCanavar(String kutsalCAnavar) {
        this.kutsalCanavar = kutsalCAnavar;
    }
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı : " + kutsalCanavar );
    }

    @Override
    public void kutsalCanavarOrtayaCıkar() {

        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ortaya çıkarıyor" );
        System.out.println(getBeybladeci() + "savunması : Kale Savunması");

    }
}
