package AH;

public class Plateau {

    Pion[][] pions;

    // déclarer la grille
    public Plateau() {
        this.pions = new Pion[3][3];
        for (int x = 0; x < pions.length; x++) {
            for (int y = 0; y < pions[x].length; y++) {
                pions[x][y] = Pion.EMPTY;
            }
        }
    }

    // afficher la grille

    public void display() {
        System.out.println();
        System.out.print(" ");
        for (int x = 0; x < pions.length; x++) {
            System.out.print(" " + x);
        }
        System.out.println();
        for (int x = 0; x < pions.length; x++) {
            System.out.print(x);
            for (int y = 0; y < pions[x].length; y++) {
                System.out.print("|" + pions[x][y].getSymbol());
            }
            System.out.println("|");
        }

    }

    // poser pion sur case
    public void put(Pion pion, int x, int y) {
        this.pions[x][y] = pion;
    }

    public boolean troisEnligne() { 
        if (this.pions[0][0].equals(Pion.CROIX) && this.pions[0][1].equals(Pion.CROIX)
                && this.pions[0][2].equals(Pion.CROIX)
                || this.pions[0][0].equals(Pion.ROND) && this.pions[0][1].equals(Pion.ROND)
                        && this.pions[0][2].equals(Pion.ROND)) {
            return true;
        } else if (this.pions[1][0].equals(Pion.CROIX) && this.pions[1][1].equals(Pion.CROIX)
                && this.pions[1][2].equals(Pion.CROIX)
                || this.pions[1][0].equals(Pion.ROND) && this.pions[1][1].equals(Pion.ROND)
                        && this.pions[1][2].equals(Pion.ROND)) {
            return true;
        } else if (this.pions[2][0].equals(Pion.CROIX) && this.pions[2][1].equals(Pion.CROIX)
                && this.pions[2][2].equals(Pion.CROIX)
                || this.pions[2][0].equals(Pion.ROND) && this.pions[2][1].equals(Pion.ROND)
                        && this.pions[2][2].equals(Pion.ROND)) {
            return true;
        } else if (this.pions[0][0].equals(Pion.CROIX) && this.pions[1][0].equals(Pion.CROIX)
                && this.pions[2][0].equals(Pion.CROIX)
                || this.pions[0][0].equals(Pion.ROND) && this.pions[1][0].equals(Pion.ROND)
                        && this.pions[2][0].equals(Pion.ROND)) {
            return true;
        } else if (this.pions[0][1].equals(Pion.CROIX) && this.pions[1][1].equals(Pion.CROIX)
                && this.pions[2][1].equals(Pion.CROIX)
                || this.pions[0][1].equals(Pion.ROND) && this.pions[1][1].equals(Pion.ROND)
                        && this.pions[2][1].equals(Pion.ROND)) {
            return true;
        } else if (this.pions[0][2].equals(Pion.CROIX) && this.pions[1][2].equals(Pion.CROIX)
                && this.pions[2][2].equals(Pion.CROIX)
                || this.pions[0][2].equals(Pion.ROND) && this.pions[1][2].equals(Pion.ROND)
                        && this.pions[2][2].equals(Pion.ROND)) {
            return true;
        } else if (this.pions[0][0].equals(Pion.CROIX) && this.pions[1][1].equals(Pion.CROIX)
                && this.pions[2][2].equals(Pion.CROIX)
                || this.pions[0][0].equals(Pion.ROND) && this.pions[1][1].equals(Pion.ROND)
                        && this.pions[2][2].equals(Pion.ROND)) {
            return true;
        } else if (this.pions[0][2].equals(Pion.CROIX) && this.pions[1][1].equals(Pion.CROIX)
                && this.pions[2][0].equals(Pion.CROIX)
                || this.pions[0][2].equals(Pion.ROND) && this.pions[1][1].equals(Pion.ROND)
                        && this.pions[2][0].equals(Pion.ROND)) {
            return true;
        }
        return false;
    }

}
