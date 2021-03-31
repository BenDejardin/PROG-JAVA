import java.lang.Math;
public class TabPairImpair {
    public static void main(String[] args){
        int [] tabInt = new int[10];
        int somme = 0;
        int produit = 1;
        int min = 101;
        int max = 0;

        for (int i = 0; i < 10; i++){
            int aleatoire = (int)  (Math.random() * (100 + 1));
            tabInt[i] = aleatoire;
            somme = tabInt[i] + somme;
            produit = tabInt[i] * produit;
            if (tabInt[i] < min){
                min = tabInt[i];
            }
            if (tabInt[i] > max){
                max = tabInt[i];
            }
            int result = tabInt[i] % 2;
            if (result == 0){
                
            }
        }

        for (int valeur : tabInt) {
            System.out.println(valeur);
        }
        System.out.println("La somme : "+somme);
        System.out.println("Le produit : "+produit);
        System.out.println("Le Min : "+ min);
        System.out.println("La Max : "+ max);
    }
}
