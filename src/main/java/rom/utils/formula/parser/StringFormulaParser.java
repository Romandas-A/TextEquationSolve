package rom.utils.formula.parser;

import java.util.ArrayList;
import java.util.List;
import rom.utils.formula.parser.model.Bracket;
import rom.utils.formula.parser.model.FormulaElement;
import rom.utils.formula.parser.model.NumberOperand;
import rom.utils.formula.parser.model.Operator;
import rom.utils.formula.parser.model.VariableOperand;
import rom.utils.formula.parser.model.enums.ParserCharacterType;

public class StringFormulaParser {

    public List<FormulaElement> parse(String formula) {

        List<FormulaElement> result = new ArrayList<>();

        formula = formula.replaceAll("  ", "");
        formula = formula.replaceAll(" ", "");
        formula = formula.replaceAll("  ", "");

        ParserCharacterType chType = detectChType(formula.charAt(0));

        String buff = "";

        for (int i = 0; i < formula.length(); i++) {
            char ch = formula.charAt(i);

            if (!detectChType(ch).equals(chType)) {

                result.add(convertFromBuffer(buff, chType));

                buff = "";
            }
            buff += ch;
            chType = detectChType(ch);
        }

        result.add(convertFromBuffer(buff, chType));

        return result;
    }

    private ParserCharacterType detectChType(char ch) {

        switch (ch) {

            case '(':
                return ParserCharacterType.BRACKETOPEN;
            case ')':
                return ParserCharacterType.BRACKETCLOSE;

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
                return ParserCharacterType.DIGIT;

            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
                return ParserCharacterType.OPERATOR;

            default:
                return ParserCharacterType.TEXT;
        }

    }

    private FormulaElement convertFromBuffer(String buff, ParserCharacterType chType) {

        switch (chType) {
            case BRACKETOPEN:
                return new Bracket(true);
            case BRACKETCLOSE:
                return new Bracket(false);
            case OPERATOR:
                return new Operator(buff);
            case DIGIT:
                return new NumberOperand(buff);
            case TEXT:
                return new VariableOperand(buff);
        }
        throw new RuntimeException();
    }

    private boolean isSymbolTypeChanged(char ch, ParserCharacterType chType) {
        return detectChType(ch).equals(chType);
    }

}
