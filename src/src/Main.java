import esercizio1.Bisestile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //esercizio 1
        System.out.println("esercizio 1");
         String test1 = "ciao";
         String test2= "amicfoo";
         System.out.println(stringPariDispari( test1));
         System.out.println(stringPariDispari(test2));
        System.out.println("esercizio 1.2");
        int anno1 = 2020;
        int anno2 = 1900;
        int anno3 = 2025;

        System.out.println(Bisestile.annoBisestile(anno1));
        System.out.println(Bisestile.annoBisestile(anno2));
        System.out.println(Bisestile.annoBisestile(anno3));

        // esercizio 2

        System.out.println("esercizio 2");

        Scanner gino = new Scanner(System.in);

        System.out.print("Inserisci un numero intero tra 0 e 5: ");

        int numero = gino.nextInt();

        switch (numero) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:

                System.out.println("Errore: numero fuori dall'intervallo");
        }
        gino.close();


    }
//esercizio 1
    public static boolean stringPariDispari(String str){
        return str.length()%2==0;
    }


}

