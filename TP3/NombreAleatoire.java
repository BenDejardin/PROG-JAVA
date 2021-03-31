import java.lang.Math;
public class NombreAleatoire {
    public static void main(String[] args){
        int [] tabInt = new int[10];
        for (int i = 0; i < 10; i++){
            int aleatoire = (int)  (Math.random() * (100 + 1));
            tabInt[i] = aleatoire;
        }
        for (int valeur : tabInt) {
            System.out.println(valeur);
        }
    }
}
