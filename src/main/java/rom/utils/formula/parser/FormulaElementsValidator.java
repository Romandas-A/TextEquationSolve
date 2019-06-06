package rom.utils.formula.parser;

import java.util.List;
import rom.utils.formula.parser.model.FormulaElement;

public class FormulaElementsValidator {

    public void validate(List<FormulaElement> elem) {

        validateBrackets(elem);

        validateNumericOperand(elem);

    }

    private void validateBrackets(List<FormulaElement> elem) {

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < elem.size(); i++) {
            if (elem.get(i).equals('(')) {
                count1++;
            }
        }

        for (int i = 0; i < elem.size(); i++) {
            if (elem.get(i).equals(')')) {
                count1++;
            }
        }

        int sum = count1 + count2;

        if (sum
                % 2 != 0) {
            throw new RuntimeException();
        }
    }

    private void validateNumericOperand(List<FormulaElement> elem) {

        //StringUtils.isNumeric(value);
    }
}
