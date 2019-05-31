package pojo;

import classes.Operator;
import org.apache.commons.lang3.StringUtils;

public class Oper {

    private Operator value;

    public Oper(String value) {
        this.value = Operator.valueOf(value);
    }

    public Operator getValue() {
        return value;
    }

}
