package rom.utils.formula.parser.level01.strtoelem;

import java.util.ArrayList;
import java.util.List;
import rom.utils.formula.parser.FormulaElementsParser;
import rom.utils.formula.parser.model.Bracket;
import rom.utils.formula.parser.model.FormulaElement;
import rom.utils.formula.parser.model.NumberOperand;
import rom.utils.formula.parser.model.Operator;
import rom.utils.formula.parser.model.VariableOperand;
import rom.utils.formula.parser.model.enums.ParserCharacterType;

public class Level01Parser implements FormulaElementsParser {

    private String formula;

    public Level01Parser(String formula) {
        this.formula = formula;
    }

    @Override
    public List<FormulaElement> parse(List<FormulaElement> elem) {

        List<FormulaElement> result = new ArrayList<>();
        formula = formula.replaceAll("\\s", "");

        for (int i = 0; i < formula.length(); i++) {
            result.add(createAtomicEmenet(formula.charAt(i)));
        }

        return result;
    }

    private FormulaElement createAtomicEmenet(char ch) {

        switch (ch) {

            case '(':
                return new Bracket(true);
            case ')':
                return new Bracket(false);

            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case '.':
                return new NumberOperand(ch);

            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return new Operator(ch);

            default:
                return new VariableOperand(ch);
        }

    }

    @Override
    public void validate(List<FormulaElement> elem) {

        int c = 0;

        for (int i = 0; i < elem.size(); i++) {
            if (elem.get(i).getValue().charAt(0) == '(') {
                c++;
            } else if (elem.get(i).getValue().charAt(0) == ')') {
                c--;
            }

            if (c < 0) {
                throw new RuntimeException("Netvarkingas skliaustu uzdarymas/atidarymas");
            }
        }

        if (c != 0) {
            throw new RuntimeException("Nelyginis skliausteliu kiekis");
        }

    }
}
