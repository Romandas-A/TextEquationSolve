package rom.utils.formula.parser.model;

import org.apache.commons.lang3.StringUtils;

public abstract class Operand implements FormulaElement {

    private String value;

    public Operand(String value) {
        this.value = value;
    }

    public boolean isNumber() {
        return StringUtils.isNumeric(value);
    }

    @Override
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
