import java.util.Scanner;
public class multiple {
    public static void main(String[] args){
        Scanner myObjectScanner = new Scanner(System.in);

        System.out.print("Nombre multiple : ");
        int nb = myObjectScanner.nextInt();

        System.out.print("Jusqu'à : ");
        int nbFin = myObjectScanner.nextInt();

        int result = 0;

       for(int i = 0 ; result < nbFin ; i++){
            result = nb * i;
            System.out.println(result);
        }
    }
}
