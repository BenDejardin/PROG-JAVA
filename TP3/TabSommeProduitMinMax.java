import java.lang.Math;
public class TabSommeProduitMinMax {
    public static void main(String[] args){
        int [] tabInt = new int[10];
        int somme = 0;
        int produit = 1;
        int min = 101;
        int max = 0;

        for (int i = 0; i < 10; i++){
            int aleatoire = (int)  (Math.random() * (100 + 1));
            tabInt[i] = aleatoire;
        }
        for (int j = 0; j < 10; j++){
            somme = tabInt[j] + somme;
            produit = tabInt[j] * produit;
            if (tabInt[j] < min){
                min = tabInt[j];
            }
            if (tabInt[j] > max){
                max = tabInt[j];
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
