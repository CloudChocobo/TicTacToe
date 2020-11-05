package AH;

public class Board {

    Pion[][] cases;

    public Board() {
        this.cases = new Pion[3][3];
        for (int x = 0; x < cases.length; x++) {
            for (int y = 0; y < cases[x].length; y++) {
                cases[x][y] = Pion.EMPTY;
            }
        }
    }

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

    public void put(Pion square, int x, int y) {
        this.cases[x][y] = square;
    }
        
    
}
