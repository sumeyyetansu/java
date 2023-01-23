public class Test {
    public static void main(String[] args) {


        Account account1 = new Account();
        System.out.println(account1.getEmail());

        Account account2 = new Account("Sümeyye", "example@gmail.com", "05773999");
        System.out.println(account2.getTelefon());
        System.out.println(account2.getBakiye());

        account2.bilgileriGoster();
        account1.bilgileriGoster();


    }
}
