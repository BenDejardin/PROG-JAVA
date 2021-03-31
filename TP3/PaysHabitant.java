import java.util.*;

public class PaysHabitant {
    public static void main (String[] args){
        String [] pays = {"France","Allemagne","Russie","USA","Chine"};
        int [] population = {62,82,288,200,1290};
        int min = 10000;
        int n = 0;
        ArrayList<String> paysSup200 = new ArrayList<String>();

        for (int i = 0; i < population.length; i++){
            if (population[i] < min){
                min = population[i];
            }
            if (population[i] <= 200){
                paysSup200.add(pays[i]);
            }
        }
        for (String valeur:paysSup200) {
            System.out.println(valeur);
        }
        System.out.print(min+" millions");
    }
}
