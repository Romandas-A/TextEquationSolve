package rom.utils.formula.parser.model;

import rom.utils.formula.parser.model.enums.OperatorType;

public class Operator implements FormulaElement {

    private OperatorType value;

    public Operator(String value) {
        this.value = OperatorType.operatorParser(value);
    }
    
     public Operator(char value) {
        this.value = OperatorType.operatorParser(""+value);
    }

    public OperatorType getOperatorValue() {
        return value;
    }

    @Override
    public String getValue() {
        return value.getOpSymbol();
    }

}
