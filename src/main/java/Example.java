public class Example {

    public Example() {
    System.out.println("Example-constructor call");
    }

    // nicht static
     public void giveAnswer(){
        System.out.println("Example- method call");
    }
    int weiteresTestInt =5;
    // static
    public static void giveSecondAnswer(){
        System.out.println("Alles statisch");
    }
    {System.out.println("Example-initialization call");}


}

class Test { }

