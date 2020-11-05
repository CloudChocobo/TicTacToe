package AH;

public enum Pion {
    Croix("x"), Rond("o"), EMPTY(" ");

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
