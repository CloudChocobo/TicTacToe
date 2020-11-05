package AH;

import java.util.Scanner;

public class Morpion {

    private Board board;
    private Pion currentSquare;
    private Joueur player;


    // public void player(Joueur player1, Joueur player2) {
    // }
        
    public Morpion() {
        this.board = new Board();
        this.player = new Joueur("Kiki");
        
        System.out.println("\n" + "Bienvenue au jeu du morpion ! <3 <3 <3" + "\n");

    }

    public void newGame() {
        System.out.println("XO XO Commençons une nouvelle partie. XO XO");
        board.display();

        this.currentSquare = Pion.Croix;
       
        System.out.println("\n"+ this.player.name + "\n"); 
        play();
        System.out.println("\n"+ this.player.name + "\n");
        play();
        System.out.println("\n"+ this.player.name + "\n"); 
        play();
        System.out.println("\n"+this.player.name + "\n");
        play();
        System.out.println("\n"+ this.player.name + "\n");
        play();
        System.out.println("\n"+ this.player.name + "\n");
        play();
        System.out.println("\n"+ this.player.name + "\n");
        play();
        System.out.println("\n"+ this.player.name + "\n");
        play();
        System.out.println("\n"+ this.player.name + "\n");
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
