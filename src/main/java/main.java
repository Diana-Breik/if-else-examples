import java.lang.String;
public class main {
    public static void main(String[] args) {
        if(istPalindrom("ara")){
            System.out.println("die Zeichenkette ist ein Palindrom");
        }
        else{
            System.out.println("die Zeichenkette ist kein Palindrom");
        }
        int a=10,b=5;
        if(a>b){
            System.out.println("Das Ergebnis des Vergleichens ist: "+ subtract(a,b));//5
        }
        else{
            System.out.println("Das Ergebnis des Vergleichens ist: "+ add(a,b));//15
        }
        double summe= add(5.5,4.4);
        System.out.println("Die Summe ist: "+ summe);
        System.out.println("Die SubWert ist: "+ subtract(6,2));//4
        System.out.println("Die Wert 3 ist: "+ makePositive(3));//3
        System.out.println("Die Wert -3 ist: "+ makePositive(-3));//3 // es gibt noch eine Methode mithilfe Mathe ,sie heißt abs
        int result= istGeradeZahl(5);
        System.out.println(result);
    }
    public static double add(double Anzahl1, double Anzahl2){
        return Anzahl1+Anzahl2;
    }
    public static int subtract(int x1, int x2){
        return x1-x2;
    }

    public static int makePositive(int wert){
        if (wert>=0){
            return wert;
        }
        else{
            return -wert;
        }
    }

    public static int istGeradeZahl(int zahl){
        if(zahl%2 ==0){
            System.out.println("Die Zahl ist ja gerade");
            return zahl;
        }
        else{
            System.out.println("Die Zahl ist ungerade");
            return zahl*2;
        }
    }
    public static boolean istPalindrom(String text){
        if ((text.length() == 1) || (text.length() == 0)) {
            return true;
        }
        if(text.charAt(0)==text.charAt(text.length()-1)){
            return istPalindrom(text.substring(1,text.length()-1));
        }
        return false;
    }


}
