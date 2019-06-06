package rom.utils.formula.main;

import java.util.List;
import rom.utils.formula.FormulaCalculator;
import rom.utils.formula.parser.StringFormulaParser;
import rom.utils.formula.parser.model.FormulaElement;

public class Main {

    //static String txtLygtis = "(  (5+8)/3  +  5*2*sqrt(3)  ) +  n";
    static String txtLygtis = "(4876......897^2+5/sin(k))";

    public static void main(String[] args) {

        FormulaCalculator k1 = new FormulaCalculator();
        List<FormulaElement> elements = k1.calc(txtLygtis);

        for (FormulaElement element : elements) {
            System.out.println(element.getClass().getSimpleName() + " " + element.getValue());
        }

        
        //System.out.println(new StringFormulaParser().parse());
    }

}
