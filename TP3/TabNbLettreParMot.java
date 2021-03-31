import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;
public class TabNbLettreParMot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez votre phrase : ");
        String phrase = sc.nextLine();
        String[] tabPhrase = phrase.split(" ");
        int [] frequence = new int [26];
        //System.out.println(frequence.length);
        for (String valeur:tabPhrase) {
            int nbLettre = valeur.length();
            //System.out.print(nbLettre+" ");
            frequence[nbLettre] += 1;

            //System.out.println(frequence.length);
        }
        //System.out.println("");
        for (int value:frequence) {
            //System.out.print(value +" ");
        }
        for (int n = 0; n < 26; n++){
            if (frequence[n] != 0) {
                System.out.println(n + ":" + frequence[n]);
            }
        }
    }
}
