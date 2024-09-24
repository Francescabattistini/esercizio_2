import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("esercizio 1");
         String test1 = "ciao";
         String test2= "amicoo";
         System.out.println(stringPariDispari( test1));
         System.out.println(stringPariDispari(test2));
        System.out.println("esercizio 1.2");
        int anno1 = 2020;
        int anno2 = 1900;
        int anno3 = 2025;

        System.out.println(annoBisestile(anno1));
        System.out.println(annoBisestile(anno2));
        System.out.println(annoBisestile(anno3));
        System.out.println("esercizio 2");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero tra 0 e 3: ");

        int numero = scanner.nextInt();

        switch (numero) {
            case 0:
                System.out.println("Zero");
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
        scanner.close();


    }
//esercizio 1
    public static boolean stringPariDispari(String str){
        return str.length()%2==0;
    }
    //esercizio 2
    public static boolean annoBisestile(int  anno){
        if (anno% 4==0){
            if(anno % 100==0){
                return anno % 400 == 0;
            }
            return true;
        }
        return false;
    }
}

