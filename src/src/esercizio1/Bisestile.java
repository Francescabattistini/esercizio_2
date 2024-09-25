package esercizio1;

public class Bisestile {

    public static boolean annoBisestile(int  anno){
    if (anno%4==0){
        if(anno % 100==0){
            return anno % 400 == 0;
        }
        return true;
    }
    return false;
}
}
