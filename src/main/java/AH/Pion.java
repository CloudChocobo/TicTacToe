package AH;

public enum Pion {
    CROIX("X"), ROND("O"), EMPTY(" ");

    private String symbol;

    private Pion(String symbol) {
        this.setSymbol(symbol);
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
}
