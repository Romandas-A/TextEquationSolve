package classes;

public enum Operator {
    PLUS("+"), MINUS("-"), DIVIDE("/"), MULTIPLY("*"), POWER("^");

    private String symbol;

    private Operator(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
