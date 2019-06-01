package rom.utils.formula;

import org.junit.Test;
import rom.utils.formula.parser.StringFormulaParser;
import java.util.List;
import org.junit.Assert;
import rom.utils.formula.parser.model.FormulaElement;

public class FormulaCalculatorTest {

    @Test
    public void testCalc() {
        FormulaCalculator calcTest = new FormulaCalculator();
        calcTest.calc(null);
    }

}
