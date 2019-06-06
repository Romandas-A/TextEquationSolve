package rom.utils.formula.parser;

import rom.utils.formula.parser.level01.strtoelem.Level01Validator;
import org.junit.Test;

public class FormulaElementsValidatorTest {

    @Test
    public void testValidator() {
        Level01Validator validatorTest = new Level01Validator();
        validatorTest.validate(null);

    }
}
