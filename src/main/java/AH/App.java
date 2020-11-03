package AH;

import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
       joueur joueur1 = new joueur("Kiki", 1);
     
       grille plateau = new grille();

       plateau.fillPlateau();

       System.out.println("\n" + "Bienvenue Joueur, quel est ton nom?" + "\n");
       Scanner scan = new Scanner(System.in);
       String nom = scan.next("[0-9A-Za-z]*");

       System.out.println("\n" + "merci " + nom + ", choisis un pion, X ou O." + "\n");

       char pickPion = scan.next().charAt(0);

       System.out.println("\n" + "Tu as choisis: " + pickPion + "\n");

       

       //System.out.println("Hello " + joueur1 + " !");
     
    }

}
