package AH;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Morpion {

    private Plateau board;
    private int gameSize;
    private Joueur joueur1, joueur2;

    // constructor
    public Morpion(int gameSize) {
        this.gameSize = gameSize;
        System.out.println("\nBienvenue au jeu du morpion ! <3 <3 <3");

        joueur1 = createPlayer(1, Pion.CROIX);
        joueur2 = createPlayer(2, Pion.ROND);
    }

    public void newGame() {
        System.out.println("\nXO XO Commençons une nouvelle partie. XO XO");

        this.board = new Plateau(gameSize);
        board.display();

        // on commence avec Joueur 1
        Joueur joueurActuel = joueur1;

        for (int numeroDeTour = 0; numeroDeTour < gameSize * gameSize; numeroDeTour++) {
            joueUnTour(joueurActuel);
            if (board.troisEnligne()) {
                System.out.println("\nBravo ! " + this.gameSize + " en ligne : '" + joueurActuel.displayNameAndSymbol()
                        + "' a gagné.");
                proposeUneNouvellePartie();
                return;
            }
            if (board.troisALaVerticale()) {
                System.out.println("\nBravo ! " + this.gameSize + " à la verticale : '"
                        + joueurActuel.displayNameAndSymbol() + "' a gagné.");
                proposeUneNouvellePartie();
                return;
            }
            if (board.troisEnDiagonale()) {
                System.out.println("\nBravo ! " + this.gameSize + " en diagonal : '"
                        + joueurActuel.displayNameAndSymbol() + "' a gagné.");
                proposeUneNouvellePartie();
                return;
            }

            if (joueurActuel == joueur1) {
                joueurActuel = joueur2;
            } else {
                joueurActuel = joueur1;
            }
        }

        gereLaFinDePartie();
        proposeUneNouvellePartie();
    }

    private void proposeUneNouvellePartie() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nVoulez-vous rejouer? \n[O]ui, [N]on.");
        String motEntré = scan.nextLine();
        if (motEntré.equalsIgnoreCase("O")) {
            newGame();
        } else {
            System.out.println("\n*****\nBonne journée.");
        }
    }

    private void gereLaFinDePartie() {
        System.out.println("La partie est terminée.");
        System.out.println("Match nul.");
    }

    // entrée des coordonnées abscisse puis ordonnée
    private void joueUnTour(Joueur joueur) {

        boolean error = true;
        int x = 0;
        int y = 0;

        System.out.println("Où voulez-vous jouer " + joueur.displayNameAndSymbol() + " ?");

        while (error) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Entrez le numéro de ligne entre 0 et " + (this.gameSize - 1) + " :");
            try {
                x = scan.nextInt();
                if (x < 0 || x >= this.gameSize) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException ime) {
                System.out.println("@ Vous n'avez pas respecté les entrées possibles ! Merci de recommencer.");
                continue;
            }

            error = false;
        }

        error = true;
        while (error) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Entrez maintenant le numéro de la colonne entre 0 et 2 :");
            try {
                y = scan.nextInt();
                if (y < 0 || y >= this.gameSize) {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException ime) {
                System.out.println("@ Vous n'avez pas respecté les entrées possibles ! Merci de recommencer.");
                continue;
            }

            error = false;
        }

        if (board.isNotEmpty(x, y)) {
            System.out.println("@ Cette case est déjà prise !");
            joueUnTour(joueur);
        }

        this.board.put(joueur.getPion(), x, y);
        this.board.display();
    }

    private Joueur createPlayer(int numeroJoueur, Pion pion) {
        System.out.println("\nQuel est ton nom Joueur" + numeroJoueur + " ?");

        Scanner clavier = new Scanner(System.in);
        String entreeClavier = clavier.nextLine();
        Joueur joueur = new Joueur(entreeClavier, pion);
        System.out.println("\nMerci " + joueur.displayNameAndSymbol() + ".");
        return joueur;
    }
}
