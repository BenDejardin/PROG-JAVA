import java.util.Scanner;
public class FigureGeometrique {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 : Carré");
        System.out.println("2 : Triangle");
        System.out.println("3 : Pyramide");
        System.out.print("Tapez le numéro de votre choix : ");

        int numero = sc.nextInt();

        if (numero == 1){
            System.out.print("Entrer un nombre de ligne : ");
            int nbLigne = sc.nextInt();
            for(int $i = 0 ; $i < nbLigne ; $i++)
            {
                for(int $j = 0 ; $j < nbLigne ; $j++)
                {
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }

        else if (numero == 2){
            System.out.print("Entrer un nombre de ligne : ");
            int nbLigne = sc.nextInt();
            for(int $i = 0 ; $i < nbLigne ; $i++)
            {
                for(int $j = 0 ; $j <= $i ; $j++)
                {
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }

        else if (numero == 3){
            System.out.print("Entrer un nombre de ligne : ");
            int nbLigne = sc.nextInt();
            int k = 0;

            for (int i = 1; i <= nbLigne; ++i, k = 0) {
                for (int space = 1; space <= nbLigne - i; ++space) {
                    System.out.print("  ");
                }

                while (k != 2 * i - 1) {
                    System.out.print("* ");
                    ++k;
                }

                System.out.println();
            }

        }
    }
}
