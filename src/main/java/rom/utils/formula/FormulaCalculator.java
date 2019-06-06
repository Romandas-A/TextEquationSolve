package rom.utils.formula;

import java.util.List;
import rom.utils.formula.parser.FormulaElementsValidator;
import rom.utils.formula.parser.FormulaSimplifier;
import rom.utils.formula.parser.StringFormulaParser;
import rom.utils.formula.parser.model.FormulaElement;

public class FormulaCalculator {

    public List<FormulaElement> calc(String formulaStr) {

        List<FormulaElement> elements = new StringFormulaParser().parse(formulaStr);

        new FormulaElementsValidator().validate(elements);

        return new FormulaSimplifier().simplify(elements);
    }

//    private String elementsToString(List<FormulaElement> elements) {
//        return "bet kas";
//    }

}
