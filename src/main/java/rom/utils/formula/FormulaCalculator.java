package rom.utils.formula;

import java.util.ArrayList;
import java.util.List;
import rom.utils.formula.parser.FormulaElementsParser;
import rom.utils.formula.parser.level01.strtoelem.Level01Parser;
import rom.utils.formula.parser.level02.Level02Parser;
import rom.utils.formula.parser.model.FormulaElement;

public class FormulaCalculator {

    private List<FormulaElementsParser> parsers;

    public FormulaCalculator(String formula) {

        parsers = new ArrayList<>();
        parsers.add(new Level01Parser(formula));
        parsers.add(new Level02Parser());

    }

    FormulaCalculator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<FormulaElement> calc() {

        List<FormulaElement> elem = new ArrayList<>();

        for (FormulaElementsParser parser : parsers) {

            elem = parser.parse(elem);
            parser.validate(elem);
        }

        return elem;
    }

}
