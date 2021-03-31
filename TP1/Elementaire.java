import java.util.Scanner;

public class Elementaire {
    public static void main(String[] args) {
        int diff = 0;
        int quotient = 0;

        Scanner myObjScanner = new Scanner(System.in);

        System.out.print("Premier Entier : ");
        int premierEntier = myObjScanner.nextInt();

        System.out.print("Deuxieme Entier : ");
        int deuxiemeEntier = myObjScanner.nextInt();

        int somme = premierEntier + deuxiemeEntier;

        int produit = premierEntier * deuxiemeEntier;

        System.out.println("La Somme de "+premierEntier+" et "+deuxiemeEntier+ " est "+somme);
        System.out.println("Le Produit de "+premierEntier+" et "+deuxiemeEntier+ " est "+produit);

        if(premierEntier > deuxiemeEntier){
            diff = premierEntier - deuxiemeEntier;
            quotient = premierEntier / deuxiemeEntier;
            System.out.println("La Différence entre "+premierEntier+" et "+deuxiemeEntier+ " est "+diff);
            System.out.println("Le Quotient de "+premierEntier+" / "+deuxiemeEntier+ " est "+quotient);

        }
        else {
            diff = deuxiemeEntier - premierEntier;
            quotient = deuxiemeEntier / premierEntier;
            System.out.println("La Différence entre "+deuxiemeEntier+" et "+premierEntier+ " est "+diff);
            System.out.println("Le Quotient de "+deuxiemeEntier+" / "+premierEntier+ " est "+quotient);

        }







    }
}