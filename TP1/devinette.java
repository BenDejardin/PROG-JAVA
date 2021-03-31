import java.util.Scanner;
import java.util.Random;
public class devinette {
    public static void main(String[] args){
        Scanner myObjectScanner = new Scanner(System.in);
        int nbAleatoire = (int) (Math.random() * 10 + 1) ;
        boolean reponse = false;
        int essai = 0;

        System.out.println("Trouver le Chiffre Choisi par l'IA");

        while (reponse == false){
            System.out.print("Votre Supposition : ");
            int nbChoisi = myObjectScanner.nextInt();

            if (nbChoisi == nbAleatoire){
                System.out.print("Gagner !!! || Au bout de "+essai+" essai(s)");
                reponse = true;
            }
            else{
                essai++;
                System.out.println("Réessayer || "+essai+" ème essai(s)");
            }
        }



    }
}
