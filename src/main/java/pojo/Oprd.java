package pojo;

import org.apache.commons.lang3.StringUtils;

public class Oprd {

    private String value;

    public Oprd(String value) {
        this.value = value;
    }

    public boolean isNumber() {
        return StringUtils.isNumeric(value);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
