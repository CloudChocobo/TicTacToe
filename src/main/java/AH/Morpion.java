package AH;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Morpion {

    private Plateau board;
    private int gameSize;

    // constructor
    public Morpion(int gameSize) {
        this.gameSize = gameSize;
        System.out.println("\n" + "Bienvenue au jeu du morpion ! <3 <3 <3");
    }

    public void newGame() {
        System.out.println("\nXO XO Commençons une nouvelle partie. XO XO");

        this.board = new Plateau(gameSize);
        board.display();

        // on commence avec X
        Pion pionActuel = Pion.CROIX;

        for (int numeroDeTour = 0; numeroDeTour < gameSize * gameSize; numeroDeTour++) {
            joueUnTour(pionActuel);
            if (board.troisEnligne()) {
                System.out.println(
                        "\nBravo ! " + this.gameSize + " en ligne : '" + pionActuel.getSymbol() + "' a gagné.");
                proposeUneNouvellePartie();
                return;
            }
            if (board.troisALaVerticale()) {
                System.out.println(
                        "\nBravo ! " + this.gameSize + " à la verticale : '" + pionActuel.getSymbol() + "' a gagné.");
                proposeUneNouvellePartie();
                return;
            }
            if (board.troisEnDiagonale()) {
                System.out.println(
                        "\nBravo ! " + this.gameSize + " en diagonal : '" + pionActuel.getSymbol() + "' a gagné.");
                proposeUneNouvellePartie();
                return;
            }

            if (pionActuel == Pion.CROIX) {
                pionActuel = Pion.ROND;
            } else {
                pionActuel = Pion.CROIX;
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
    private void joueUnTour(Pion pion) {

        boolean error = true;
        int x = 0;
        int y = 0;

        System.out.println("Où voulez-vous jouer '" + pion.getSymbol() + "' ?");

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
            joueUnTour(pion);
        }

        this.board.put(pion, x, y);
        this.board.display();
    }
}
