import java.util.Scanner;

public class BonjourUser {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Entrer votre nom : ");

        String nom = myObj.nextLine();
        System.out.println("Bonjour " + nom);
    }
}