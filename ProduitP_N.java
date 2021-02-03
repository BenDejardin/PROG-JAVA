import java.util.Scanner;
public class ProduitP_N {
    public static void main(String[] args){
        Scanner myObjetScanner = new Scanner(System.in);

        System.out.print("Premier Nombre : ");
        int nb1 = myObjetScanner.nextInt();

        System.out.print("Deuxième Nombre : ");
        int nb2 = myObjetScanner.nextInt();

        if (nb1 < 0 | nb2 < 0){
            System.out.print("Produit Négatif");
        }

        else{
            System.out.print("Produit positif");
        }
    }
}
