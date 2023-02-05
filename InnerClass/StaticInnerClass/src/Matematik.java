public class Matematik {
    private static double PI = Math.PI;
    public static class Alan{
        public void daire_alan (int yaricap){
                System.out.println("Dairenin alanı : " + (yaricap * yaricap * PI));
                // static olan bir , method static olmayan bir classtan referans alamaz. O yüzden  private static double şeklinde yazmamızl azım
        }
    }
}
