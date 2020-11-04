package AH;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Joueur{
    
    // Attributs de class
    private String name; 
    private char symbolJoueur; 
    private App app; 

    // Constructor
    public Joueur(String name, char symbolJoueur) {
        this.name = name; 
        this.symbolJoueur = symbolJoueur; 
    }
    /*GETTER & SETTER */ 
	public String getName() {
		return name;
	} 
	public void setName(String name) {
		this.name = name;
	}
	public int getsymbolJoueur() {
		return symbolJoueur;
	}
	public void setsymbolJoueur(char symbolJoueur) {
		this.symbolJoueur = symbolJoueur;
    }
    ///////////////////////////////

    @Override
    public String toString() {
        return
            getName()+ " " /*+ getNumJoueur()*/;
    }

    /*CHOISIR SYMBOLE POUR LES PLAYERS */ 

    
    public void chooseSymboleJoueur1(){
        Scanner scan = new Scanner(System.in);
        try {
            char chooseSymbol = scan.next("[O|Xo|x]*").charAt(0);
            if(chooseSymbol == 'x' || chooseSymbol =='X'){
              this.symbolJoueur = 'X';  
            }else if(chooseSymbol == 'o' || chooseSymbol =='O'){
                this.symbolJoueur = 'O';  
              }
            System.out.println("\n" + "Tu es donc le " + this.name + " et tu auras le symbole : "  + this.symbolJoueur + "\n");
        } catch (InputMismatchException e) {
            System.out.println("Choisit une lettre, soit X, soit O !");
        }
        
    }
    
         
        System.out.println("\n" + "Le " + this.name + " auras donc le symbole : "  + this.symbolJoueur + "\n");
    }

}