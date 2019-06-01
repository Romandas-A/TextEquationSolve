package rom.utils.formula.parser;

import org.junit.Test;
import rom.utils.formula.parser.StringFormulaParser;
import java.util.List;
import org.junit.Assert;
import rom.utils.formula.parser.model.FormulaElement;

public class FormulaSimplifierTest {

    private List<FormulaElement> elem;
    
    @Test
    public void testSimplify() {
        FormulaSimplifier simplifyTest = new FormulaSimplifier();
        
        simplifyTest.simplify(elem);
        
    }
}
