package rom.utils.formula.parser;

import org.junit.Test;

public class FormulaElementsValidatorTest {

    @Test
    public void testValidator() {
        FormulaElementsValidator validatorTest = new FormulaElementsValidator();
        validatorTest.validate(null);

    }
}
