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

        /* CREATION DES JOUEURS */ 
        Joueur joueur1 = new Joueur("Player_1", ' '); 
        Joueur joueur2 = new Joueur("Player_2", ' '); 

        /*CREATION DE LA GRID */
        Grille plateau = new Grille(); 


        /* START PLAYING */ 

        System.out.println("\n" + "Bienvenue à toi, quel est ton nom ? " + "\n");
        Scanner scan = new Scanner(System.in); 
        String nom = scan.next("[0-9A-Za-z]*");

        System.out.println("\n" + "Merci " + nom + ". Choisis une lettre, soit X, soit O : " + "\n");

        /*CHOOSE SYMBOL*/
        joueur1.chooseSymboleJoueur1();
        //joueur.displayChoice();
        if (joueur1.getsymbolJoueur() == 'x' || joueur1.getsymbolJoueur() == 'X') {
            joueur2.setsymbolJoueur('o');
        } else {
            joueur2.setsymbolJoueur('x');
        }
        // aficher console le choix du joueur 2
        
        
        /*PRESENTATION DU TABLEAU */ 
        
        plateau.remplirTableau();

        
    }
}


