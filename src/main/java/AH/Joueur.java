package AH;

public class Joueur {

    String name;

    private Joueur(String name) {
        this.setName(name);
    }
    
    public String getName() {
         return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    
  
}
