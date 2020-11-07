package AH;


public class Plateau {
    
	Pion[][] cases;
    private Pion currentSquare;

    // public boolean gameEndBoard() {
    // if (this.cases[0][0].getSymbol().equals("x") && this.cases[0][1].getSymbol().equals("x") && this.cases[0][2].getSymbol().equals("x") || this.cases[0][0].getSymbol().equals("o") && this.cases[0][1].getSymbol().equals("o") && this.cases[0][2].getSymbol().equals("o")) {
        
    //     return  true;
    // } else {
    //     if (this.cases[1][0].getSymbol().equals("x") && this.cases[1][1].getSymbol().equals("x") && this.cases[1][2].getSymbol().equals("x") || this.cases[1][0].getSymbol().equals("o") && this.cases[1][1].getSymbol().equals("o") && this.cases[1][2].getSymbol().equals("o")) {
    //     return true;
        
    //     }if (this.cases[2][0].getSymbol().equals("x") && this.cases[2][1].getSymbol().equals("x") && this.cases[2][2].getSymbol().equals("x") || this.cases[2][0].getSymbol().equals("o") && this.cases[2][1].getSymbol().equals("o") && this.cases[2][2].getSymbol().equals("o")) {
    //     return true; 
        
    //     }if (this.cases[0][0].getSymbol().equals("x") && this.cases[1][0].getSymbol().equals("x") && this.cases[2][0].getSymbol().equals("x") || this.cases[0][0].getSymbol().equals("o") && this.cases[1][0].getSymbol().equals("o") && this.cases[2][0].getSymbol().equals("o")) {
    //     return true;
        
    //     }if (this.cases[0][1].getSymbol().equals("x") && this.cases[1][1].getSymbol().equals("x") && this.cases[2][1].getSymbol().equals("x") || this.cases[0][1].getSymbol().equals("o") && this.cases[1][1].getSymbol().equals("o") && this.cases[2][1].getSymbol().equals("o")) {
    //     return true;
        
    //     }if (this.cases[0][2].getSymbol().equals("x") && this.cases[1][2].getSymbol().equals("x") && this.cases[2][2].getSymbol().equals("x") || this.cases[0][2].getSymbol().equals("o") && this.cases[1][2].getSymbol().equals("o") && this.cases[2][2].getSymbol().equals("o")) {
    //     return true;
        
    //     }if (this.cases[0][0].getSymbol().equals("x") && this.cases[1][1].getSymbol().equals("x") && this.cases[2][2].getSymbol().equals("x") || this.cases[0][0].getSymbol().equals("o") && this.cases[1][1].getSymbol().equals("o") && this.cases[2][2].getSymbol().equals("o")) {
    //     return true;
        
    //     }if (this.cases[2][0].getSymbol().equals("x") && this.cases[1][1].getSymbol().equals("x") && this.cases[0][2].getSymbol().equals("x") || this.cases[2][0].getSymbol().equals("o") && this.cases[1][1].getSymbol().equals("o") && this.cases[0][2].getSymbol().equals("o")) {
    //     return true;
    //     }
    // return false;
    // }
    //}


    
// déclarer la grille
    public Plateau() {
        this.cases = new Pion[3][3];
        for (int x = 0; x < cases.length; x++) {
            for (int y = 0; y < cases[x].length; y++) {
                cases[x][y] = Pion.EMPTY;
            }
        }
    }


    // afficher la grille

    public void display() {
        System.out.println();
        System.out.print(" ");
        for (int x = 0; x < cases.length; x++) {
            System.out.print(" " + x);
        }
        System.out.println();
        for (int x = 0; x < cases.length; x++) {
            System.out.print(x);
            for (int y = 0; y < cases[x].length; y++) {
                System.out.print("|" + cases[x][y].getSymbol());
            }
            System.out.println("|");
        }

    }

    //poser pion sur case
    public void put(Pion Case, int x, int y) {
        this.cases[x][y] = Case;  
    
    }
}
