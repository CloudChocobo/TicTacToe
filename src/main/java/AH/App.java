package AH;


public final class App {
    private App() {
    }
//initialisation morpion

    public static void main(String[] args) {
        Morpion morpion = new Morpion(3);
        morpion.newGame();
    }
}