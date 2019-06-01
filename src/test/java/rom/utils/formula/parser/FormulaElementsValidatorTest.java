package rom.utils.formula.parser;

import org.junit.Test;
import rom.utils.formula.parser.StringFormulaParser;
import java.util.List;
import org.junit.Assert;

public class FormulaElementsValidatorTest {

    @Test
    public void testValidator() {
        FormulaElementsValidator validatorTest = new FormulaElementsValidator();
        validatorTest.validate(null);
        
    }
}
