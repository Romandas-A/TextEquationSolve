package rom.utils.formula.parser.model;

public class VariableOperand extends Operand {
    
    public VariableOperand(String value) {
        super(value);
    }
    
    public VariableOperand(char value) {
        super(""+value);
    }
    
}
