package AH;

import java.util.Scanner;

public class Morpion {

    
    private Plateau board;
    private Pion currentSquare;
    Joueur joueur1 = new Joueur("player 1");
    Joueur joueur2  = new Joueur("player 2");
    int gameEnd = 0;
	

        
    public Morpion() {
        this.board = new Plateau();
        
        System.out.println("\n" + "Bienvenue au jeu du morpion ! <3 <3 <3" + "\n");

    }


    public void newGame() {
        System.out.println("XO XO Commençons une nouvelle partie. XO XO");

        System.out.println("\n" + this.joueur1.getName() + " tu auras le pion 'x'.");
        board.display();

        //on commence avec X
        this.currentSquare = Pion.Croix;


        // tours de joueurs
        while (this.gameEnd !=1) {
        System.out.println("\n"+ this.joueur1.name); 
        play();

        if (this.gameEnd == 1) {
              System.out.println("La partie est terminée");
        }
        
        System.out.println("\n"+ this.joueur2.name);
        play();
        // if (this.gameEnd == 1) {
        //    System.out.println("La partie est terminée");
        // }     
        
        // if (Pion.gameEndBoard() && player1.getPlaying()) {
        // player2.setWinning(true);
        // System.out.println("Player2 wins");
        // } else if (Pion.gameEndBoard() && player2.getPlaying()) {
        //     player1.setWinning(true);
        //     System.out.println("Player1 wins");
        //     }
        }
        }
   

    //entrée des coordonnées abscisse puis ordonnée
    private boolean play() {
        Scanner scan = new Scanner(System.in);
           
        System.out.println("Où voulez-vous jouer ? Entrez la ligne !");

       int x = scan.nextInt();
       System.out.println("Entrez maintenant la colonne !");
        int y = scan.nextInt(); 
        
        
        this.board.put(currentSquare, x, y);
        this.board.display();

        if (currentSquare == Pion.Croix) {
            currentSquare = Pion.Rond;
            } else {
            currentSquare = Pion.Croix;
        }
        

        
        if ((x < 0 || x >2) || (y <0 || y > 2)) {
             System.out.println("Veuillez entrer des nombres entre 0 et 2 !");
             return false;
         } else if (this.currentSquare != Pion.EMPTY) {
            System.out.println("Veuillez choisir une autre case.");
            return false; 
        }
        return true;
      
    }
    
}



