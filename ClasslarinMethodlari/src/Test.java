public class Test {
    public static void main(String[]args){
        Araba araba1 = new Araba();

        araba1.setRenk("Kırmızı");
        System.out.println("Arabanın rengi "+ araba1.getRenk());

        araba1.setModel("Bmw");
        System.out.println("Arabanın modeli "+ araba1.getModel());

        araba1.setKapilar(5);
        System.out.println("Araba "+ araba1.getKapilar() +"  kapılıdır.");

        araba1.setMotor("16V");
        System.out.println("Arabanın motoru "+ araba1.getMotor());

        araba1.setTekerlekler(4);
        System.out.println("Araba "+ araba1.getTekerlekler() + " tekerleklidir." );
    }
}
