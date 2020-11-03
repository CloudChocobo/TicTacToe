package AH;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
       joueur joueur1 = new joueur("Kiki", 1);
        
       System.out.println("Hello " + joueur1 + " !");
    }

}
