import java.util.Scanner;
public class PairImpair_10 {
    public static void main(String[] args){
        Scanner myObjectScanner = new Scanner(System.in);
        System.out.print("Votre Nombre : ");
        int nb = myObjectScanner.nextInt();
        int result = nb % 2;
        if (result == 0){
            System.out.print("Votre nombre est pair");
        }
        else{
            System.out.print("Votre nombre est impair");
        }
        for (int i = nb ; i < nb+20 ; i+=2){
            System.out.println(i);
        }
    }
}
