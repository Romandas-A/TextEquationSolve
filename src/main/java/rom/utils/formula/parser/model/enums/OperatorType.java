package rom.utils.formula.parser.model.enums;

public enum OperatorType {

    PLUS("+"), MINUS("-"), DIVIDE("/"), MULTIPLY("*"), POWER("^");

    private String opSymbol;

    private OperatorType(String opSymbol) {
        this.opSymbol = opSymbol;
    }

    public String getOpSymbol() {
        return opSymbol;
    }

    public OperatorType operatorParser(String symbol) {

        for (OperatorType value : OperatorType.values()) {
            if (value.getOpSymbol().equals(symbol)) {
                return value;
            }
        }

        return null;
    }

}
