package rom.utils.formula;

import org.junit.Test;
import rom.utils.formula.parser.level01.strtoelem.Level01Parser;
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
