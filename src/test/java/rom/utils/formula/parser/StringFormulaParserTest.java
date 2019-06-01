package rom.utils.formula.parser;

import org.junit.Test;
import rom.utils.formula.parser.StringFormulaParser;
import java.util.List;
import org.junit.Assert;
import rom.utils.formula.parser.model.FormulaElement;

public class StringFormulaParserTest {

    @Test
    public void testParse() {
        StringFormulaParser parseTest = new StringFormulaParser();

        Assert.assertEquals(null, parseTest.parse("(5+4)"));
    }
}
