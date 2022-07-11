/**
 * @
 */

public class center {
    public static void main(String[] args) {

        System.out.println("Hat Thorsti Motivation?");
        Example example = new Example();
        //nicht statisch
                example.giveAnswer();
        //statisch
        Example.giveSecondAnswer();
        int testint = 3, $testint$ = 3, _testint_ = 3, T2 =3;
        // int 2T = 3, !testint! = 3;
        System.out.printf( "%d, %d, %d, %d %n" ,testint,$testint$,_testint_,T2);

        }



}



