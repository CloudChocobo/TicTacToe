package AH;

import java.util.Scanner;

public class Morpion {

    private Board board;
    private Pion currentSquare;

    public Morpion() {
        this.board = new Board();
        System.out.println("\n" + "Bienvenue au jeu du morpion ! <3 <3 <3" + "\n");
    }
    
    public void newGame() {
        System.out.println("\n"+"XO XO Commençons une nouvelle partie. XO XO"+"\n");
        board.display();

        this.currentSquare = Pion.Croix;

        play();
        play();
        play();
        play();
        play();
        play();
        play();
        play();
        play();
    }

    private void play() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Où voulez-vous jouer ?");

        int x = scan.nextInt();
        int y = scan.nextInt();

        this.board.put(currentSquare, x, y);
        this.board.display();

        if (currentSquare == Pion.Croix) {
            currentSquare = Pion.Rond;
        } else {
            currentSquare = Pion.Croix;
        }
    }

}
