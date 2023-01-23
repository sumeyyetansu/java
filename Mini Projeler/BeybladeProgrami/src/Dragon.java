public class Dragon extends Beyblade {
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String beybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar , String gizliYetenek) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek ;
    }

    public String getKutsalCanavar() {
        return kutsalCanavar;
    }

    public void setKutsalCanavar(String kutsalCanavar) {
        this.kutsalCanavar = kutsalCanavar;
    }

    public String getGizliYetenek() {
        return gizliYetenek;
    }

    public void setGizliYetenek(String gizliYetenek) {
        this.gizliYetenek = gizliYetenek;
    }
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal Canavar Adı : " + kutsalCanavar );
        System.out.println("Gizli Yetenek : " + gizliYetenek );
    }

    @Override
    public void kutsalCanavarOrtayaCıkar() {

        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ortaya çıkarıyor" );
        System.out.println(getBeybladeci() + "saldırısı : Hayalet Kasırga");

    }
}
