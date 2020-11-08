package AH;

import java.util.Scanner;

public class Morpion {

    private Plateau board;
    Joueur joueur1 = new Joueur("player 1");
    Joueur joueur2 = new Joueur("player 2");
    int gameEnd = 0;

    // constructor
    public Morpion() {
        this.board = new Plateau();

        System.out.println("\n" + "Bienvenue au jeu du morpion ! <3 <3 <3" + "\n");

    }

    public void newGame() {
        System.out.println("XO XO Commençons une nouvelle partie. XO XO");

        System.out.println("\n" + this.joueur1.getName() + " vous aurez le pion 'X'.");
        board.display();

        // on commence avec X
        Pion pionActuel = Pion.CROIX;
        
        for (int numeroDeTour = 0; numeroDeTour < 3; numeroDeTour++) {
            joueUnTour(pionActuel);
            if (pionActuel == Pion.CROIX) {
                pionActuel = Pion.ROND;
            } else {
                pionActuel = Pion.CROIX;
            }
        }
        System.out.println("La partie est terminée.");
        System.out.println("Match nul.");

        System.out.println("\n*****\nBonne journée.");
    }

    // entrée des coordonnées abscisse puis ordonnée
    private void joueUnTour(Pion pion) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Où voulez-vous jouer ?\nEntrez le numéro de ligne entre 0 et 2 :");
        int x = scan.nextInt();

        System.out.println("Entrez maintenant le numéro de la colonne entre 0 et 2 :");
        int y = scan.nextInt();

        this.board.put(pion, x, y);
        this.board.display();
    }
}
