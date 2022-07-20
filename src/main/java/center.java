import java.util.ArrayList;

/**
 * @
 */

public class center {
    static int Variable5 = 5;
    public static void main(String[] args) {

        System.out.println("Hat Thorsti Motivation?");
        Example example = new Example();
        //nicht statisch
                example.giveAnswer();
        //statisch
        Example.giveSecondAnswer();
        int testint = 3, $testint$ = 3, _testint_ = 3, T2 =3;
        // int 2T = 3, !testint! = 3;
       // $testint$ = ++testint  * 5 / testint-- + --testint;
       // $testint$ += 5;
        //$testint$ =+ 5;

        ArrayList myArraylist = new ArrayList<>();
        myArraylist.add("Dies ");
        myArraylist.add("ist ");
        myArraylist.add("ein");
        myArraylist.add("Test");

        for (Object  durchlauf: myArraylist)
        {System.out.println(durchlauf);

        }
        $testint$ -= 5;

        int a=1,b=1;
        a += (b=50);
        a=b++;
        System.out.printf("Der Wert von a ist %d, der Wert von b ist %d %n", a, b);
        String teststring=null;
        String teststring2=new String("Hier kann man de String zuweisen.");
        Integer testinteger= new Integer(5);

        teststring2.concat("gh"); //immutable
        System.out.println(teststring2);
        System.out.println(testinteger);
        System.out.println (6+5+"s"+"96"+6+3);
        System.out.println(_testint_ += 67);
        teststring = "String intialisiert";
        System.out.println(teststring);
        teststring = null;
        System.out.println(teststring);
        System.out.printf( "%d, %d, %d, %d %n" ,testint,$testint$,_testint_,T2);
        System.out.println(testint==$testint$); //false 3,-2
        System.out.println(testint==T2); // true 3,3
center testcenter = new center();
testcenter.testMethode();
StringBuilder stringbuilder1 = new StringBuilder("Ein String");
StringBuilder stringbuilder2 = new StringBuilder("Ein String");
StringBuilder stringbuilder3 = stringbuilder1;
System.out.println(stringbuilder1 == stringbuilder2); //false
System.out.println(stringbuilder1 == stringbuilder3);   //true
System.out.println(stringbuilder1.equals(stringbuilder2) ); //false -> keine implementierung,Referenzvergleich
System.out.println(stringbuilder1.equals(stringbuilder3) ); //true -> keine Implementierung, Referenzvergleich
String string1 = "HalloString", string2="HalloString", string3=string1;
        System.out.println(string1 == string2); //true stringpool
        System.out.println(string1 == string3); //true
        System.out.println(string1.equals(string2)); //true
        System.out.println(string1.equals(string3)); //true
        String string4 =new String("HalloString");
        System.out.println(string1 == string4); //false
        System.out.println(string1.equals(string4)); //true   " HalloString"->false
ArrayList <String> stringArrayList = new ArrayList<>();
stringArrayList.add("Dies ist eine ");
stringArrayList.add("StringArray List ! ");
        System.out.println(stringArrayList);
    }
    public void testMethode () {
        System.out.println("klappt");
    }



}



