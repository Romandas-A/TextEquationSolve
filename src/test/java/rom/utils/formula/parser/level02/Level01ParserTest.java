package rom.utils.formula.parser.level02;

import java.util.List;
import rom.utils.formula.parser.level01.strtoelem.Level01Parser;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import rom.utils.formula.parser.model.FormulaElement;

public class Level01ParserTest {
    String txtFormula= "33+55";
    List<FormulaElement> elem;

    @Test
    public void testParse() {

        Level01Parser parseTest = new Level01Parser(txtFormula);
        List<FormulaElement> result = parseTest.parse(elem);
        assertEquals("(5+5)", result);
    }
}
