public class Main {
    public static void main(String[] args) {
        System.out.println("esercizio 1");
         String test1 = "ciao";
         String test2= "amicoo";
         System.out.println(stringPariDispari( test1));
         System.out.println(stringPariDispari(test2));
        System.out.println("esercizio 2");
        
    }

    public static boolean stringPariDispari(String str){
        return str.length()%2==0;
    }
}

