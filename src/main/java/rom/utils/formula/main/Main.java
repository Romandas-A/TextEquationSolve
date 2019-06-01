package rom.utils.formula.main;

import rom.utils.formula.FormulaCalculator;

public class Main {

    //static String txtLygtis = "(  (5+8)/3  +  5*2*sqrt(3)  ) +  n";
    static String txtLygtis = "(4+5)";

    public static void main(String[] args) {

        FormulaCalculator k1 = new FormulaCalculator();
        System.out.println(k1.calc(txtLygtis));

    }

}
