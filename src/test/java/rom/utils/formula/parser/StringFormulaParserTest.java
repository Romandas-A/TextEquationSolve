package rom.utils.formula.parser;

import org.junit.Test;
import rom.utils.formula.parser.level01.strtoelem.Level01Parser;
import org.junit.Assert;

public class StringFormulaParserTest {

    @Test
    public void testParse() {
        Level01Parser parseTest = new Level01Parser();
        Assert.assertEquals(null, parseTest.parse("("));
        
        
    }
}
