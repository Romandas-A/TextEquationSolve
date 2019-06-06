package rom.utils.formula.parser.model;

public class NumberOperand extends Operand{
    
    public NumberOperand(String value) {
        super(value);
    }
    
    public NumberOperand(char value) {
        super(""+value);
    }
    
}
