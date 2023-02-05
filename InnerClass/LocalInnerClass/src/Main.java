public class Main {
    public static void main(String[] args) {


        class Alan {
            public void daire_alan(int yaricap){
                System.out.println("Dairenin alanı : " + (yaricap * yaricap * Math.PI));
            }

        }
        Alan alan = new Alan(); // Sadece oluşturulduğu methodunun içinde tanımlanabilir.
        Alan alan1 = new Alan();
        alan.daire_alan(8);
        alan1.daire_alan(4);
    }
  //
    public static void deneme (){
        // Alan alan = new Alan();  hata verir.Sadece oluşturulduğu methodunun içinde tanımlanabilir.
    }
}