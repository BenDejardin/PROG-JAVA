import java.util.Scanner;
public class Compteur {
    public static void main(String[] args){
        Scanner myObjectScanner = new Scanner(System.in);
        System.out.print("Jusqu'à combien voulez-vous aller : ");
        int nbFin = myObjectScanner.nextInt();
        for(int i=1 ; i<=nbFin ; i++){
            System.out.println(i);
        }
    }
}
