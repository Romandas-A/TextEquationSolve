package rom.utils.formula.parser.model;

import rom.utils.formula.parser.model.enums.OperatorType;
import org.apache.commons.lang3.StringUtils;

public class Operator implements FormulaElement {

    private OperatorType value;

    public Operator(String value) {
        this.value = OperatorType.valueOf(value);
    }

    public OperatorType getValue() {
        return value;
    }

}
