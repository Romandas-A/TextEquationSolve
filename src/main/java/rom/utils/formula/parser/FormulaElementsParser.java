package rom.utils.formula.parser;

import java.util.List;
import rom.utils.formula.parser.model.FormulaElement;

public interface FormulaElementsParser {

    List<FormulaElement> parse(List<FormulaElement> elem);

    void validate(List<FormulaElement> elem);
}
