public class Main {
    public static void main(String[] args) {
       char a= 'A';
       char b= '?';
       char c= 2000;
       char d= '\u00D0';
       char x = '\u2665';


        // char d= 'U+00D0' bunu java diline çevirmek için char d= ' \u00D0'; yazarız

        System.out.println( d );
        System.out.println("❤");
        System.out.println("\u2665\n");
        System.out.println(x);
        System.out.printf("\u1F498\n");
    }
}