package rom.utils.formula.parser.level02;

import java.util.List;
import rom.utils.formula.parser.model.FormulaElement;

public class Level02Validator {

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
