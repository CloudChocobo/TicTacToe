package AH;

public class Plateau {

    private Pion[][] pions;

    // déclarer la grille
    public Plateau(int taille) {
        this.pions = createPlateauWithEmpty(taille);
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
                System.out.print("|"+ pions[x][y].getSymbol());
            }
            System.out.println("|");
        }
    }

    // poser pion sur case
    public void put(Pion pion, int x, int y) {
        this.pions[x][y] = pion;
    }

    boolean troisEnligne() {
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
        }
        return false;
    }

    boolean troisALaVerticale() {
        if (this.pions[0][0].equals(Pion.CROIX) && this.pions[1][0].equals(Pion.CROIX)
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
        }
        return false;
    }

    boolean troisEnDiagonale() {
        if (this.pions[0][0].equals(Pion.CROIX) && this.pions[1][1].equals(Pion.CROIX)
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

    Pion[][] createPlateauWithEmpty(int taille) {
        Pion[][] plateauVide = new Pion[taille][taille];
        for (int x = 0; x < plateauVide.length; x++) {
            for (int y = 0; y < plateauVide[x].length; y++) {
                plateauVide[x][y] = Pion.EMPTY;
            }
        }
        return plateauVide;
    }

    public boolean isNotEmpty(int x, int y) {
        return this.pions[x][y] != Pion.EMPTY;
    }

    public Pion[][] getPions() {
        return pions;
    }

    public void setPions(Pion[][] pions) {
        this.pions = pions;
    }

    private boolean hasAVerticalLine(int numeroColonne, Pion pionActuel) {
        for (int numeroLigne = 0; numeroLigne < pions.length; numeroLigne++) {
            if (pions[numeroLigne][numeroColonne] != pionActuel) {
                return false;
            }
        }
        return true;
    }

    private boolean hasAHorizontalLine(int numeroLigne, Pion pionActuel) {
        for (int numeroColonne = 0; numeroColonne < pions[numeroLigne].length; numeroColonne++) {
            if (pions[numeroLigne][numeroColonne] != pionActuel) {
                return false;
            }
        }
        return true;
    }

    private boolean hasALeftToRightDiagonalLine(Pion pionActuel) {
        for (int numero = 0; numero < pions.length; numero++) {
            if (pions[numero][numero] != pionActuel) {
                return false;
            }
        }
        return true;
    }

    private boolean hasARightToLeftDiagonalLine(Pion pionActuel) {
        for (int numero = 0; numero < pions.length; numero++) {
            if (pions[pions.length - 1 - numero][numero] != pionActuel) {
                return false;
            }
        }
        return true;
    }
}
