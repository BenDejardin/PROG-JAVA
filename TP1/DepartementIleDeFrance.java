import java.util.Scanner;
public class DepartementIleDeFrance {
    public static void main(String[] args){
        boolean rep = false;

        Scanner myObjScanner = new Scanner(System.in);
        System.out.print("Indiquez votre département : ");
        int dep = myObjScanner.nextInt();

        int [] depIDF = {75,77,78,91,92,93,94};

        for (int valeur : depIDF){

            if (dep == valeur) {
                System.out.print("Votre Département fais parti de l'Île de France");
                rep = true;
                break;
            }
        }

        if (dep < 1 | dep > 99){
            System.out.print("Votre Département n'existe pas en France");
        }

        else if (rep != true){
            System.out.print("Votre Département ne fais pas parti de l'Île de France");
        }

    }
}
