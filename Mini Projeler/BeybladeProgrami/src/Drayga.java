public class Drayga extends Beyblade {

    private String kutsalCanavar;


    public Drayga(String beybladeci, int donusHizi, int saldiriGucu , String kutsalCanavar ) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    public String getKutsalCanavar() {
        return kutsalCanavar;
    }

    public void setKutsalCanavar(String kutsalCanavar) {
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı : " + kutsalCanavar );
    }

    @Override
    public void kutsalCanavarOrtayaCıkar() {

        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ortaya çıkarıyor" );
        System.out.println(getBeybladeci() + "saldırısı : Kaplan Pençesi");

    }
}
