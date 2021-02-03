import java.util.Scanner;

public class tarifRéduit {
    public static void main(String[] args){
        Scanner myObjScanner = new Scanner(System.in);

        System.out.print("Indiquez votre age : ");
        int age = myObjScanner.nextInt();

        if (age < 26 | age > 65 ){
            System.out.print("Tarif Réduit");
        }
        else {
            System.out.print("Tarif Plein");
        }
    }
}
