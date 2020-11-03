package AH;

public class Joueur {

    private String name;
    private int numeroJoueur;

    public Joueur(String name, int numeroJoueur) {
        this.name = name;
        this.numeroJoueur = numeroJoueur;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumeroJoueur() {
        return numeroJoueur;
    }

    public void setNumeroJoueur(int numeroJoueur) {
        this.numeroJoueur = numeroJoueur;
    }

    @Override
    public String toString() {
        return getName() + " " + getNumeroJoueur();
    }
}
