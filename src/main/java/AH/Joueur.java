package AH;

public class Joueur {

    private String name;
    private Pion pion;

    public Joueur(String name, Pion pion) {
        this.name = name;
        this.pion = pion;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public Pion getPion() {
        return pion;
    }

    public void setPion(Pion pion) {
        this.pion = pion;
    }

    public String displayNameAndSymbol() {
        return name + " (" + pion.getSymbol() + ")";
    }

}
