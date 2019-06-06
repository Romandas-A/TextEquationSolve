package rom.utils.formula.parser.model;

public class Bracket implements FormulaElement {

    private boolean opening;

    public Bracket(boolean opening) {
        this.opening = opening;
    }

    public boolean isOpening() {
        return opening;
    }

    public void setOpening(boolean opening) {
        this.opening = opening;
    }

    @Override
    public String getValue() {
        return opening?"(":")";
    }

}
