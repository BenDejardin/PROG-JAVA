import java.util.Scanner;
public class tarificationDegressive {
    public static void main(String[] args){
        Scanner myObjectScanner = new Scanner(System.in);
        System.out.print("Combien d'article(s) voulez-vous ? : ");
        int quantite = myObjectScanner.nextInt();
        int prix = 0;

        if (quantite < 10){
            prix = quantite * 150;
            System.out.print("Le prix sera de "+prix+" €");
        }
        else if (quantite > 49){
            prix = quantite * 110;
            System.out.print("Le prix sera de "+prix+" €");
        }
        else {
            prix = quantite * 135;
            System.out.print("Le prix sera de "+prix+" €");
        }
    }
}
