package rom.utils.formula.parser;

import java.util.List;
import rom.utils.formula.parser.model.FormulaElement;

public class FormulaElementsValidator {

    public void validate(List<FormulaElement> elem) {

        validateBrackets(elem);

        validateNumericOperand(elem);

    }

    StringFormulaParser k1 = new  StringFormulaParser();

    private void validateBrackets(List<FormulaElement> elem) {
        

    }

    private void validateNumericOperand(List<FormulaElement> elem) {

    }
}
