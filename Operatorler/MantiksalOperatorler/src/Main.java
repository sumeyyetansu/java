public class Main {
    public static void main(String[] args)
    {
        System.out.println( 3 == 3 && 2 < 3 );
        System.out.println( 3 == 3 && 2 > 3 );
        System.out.println( 3 == 3 && 2 > 3 && " yusuf " == "yusuf " ) ;
        System.out.println( 3 == 3 || 2 < 3 || " yusuf " == " yusuf " );
        System.out.println( 3 == 3 || 2 > 3 || " yusuf " != " yususf" );
        System.out.println( ! true );
        System.out.println( ! false );
        System.out.println( ! ( 3 > 4 ) );
        System.out.println( !( (3 < 4 && "yusuf" == "yusuf")  || 3.4 > 2.1 ) );
    }
}