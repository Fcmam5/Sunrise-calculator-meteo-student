import java.util.Scanner;

/**
 * Created by fcmam5 on 1/17/16.
 */
public class Main {


    public static void main(String[] args) {
        /**
         * Formule:
         *          Arcsin(0.4*(sin(w*(j-82))))
         */
        double w =0.0172;
        int j;
        int m;
        int annee;
        Date laDate;
        double nihed;
        Scanner clavier;

        clavier = new Scanner(System.in);

        System.out.println("Please introduce the Days");
        j = clavier.nextInt();

        System.out.println("Please introduce the mounth");
        m = clavier.nextInt();

        System.out.println("Please Introduce the year");
        annee = clavier.nextInt();

        System.out.println("********************\n********************");

        //Crée l'objet Date JJ/MM/AA
        laDate = new Date(j,m,annee);

        //Calcule
        nihed = Math.asin(0.4*Math.sin(w*(laDate.getNbJours()-82)));
        System.out.println("The result is: "+nihed);
    }
}
