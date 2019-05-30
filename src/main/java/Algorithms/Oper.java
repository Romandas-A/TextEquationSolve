package Algorithms;


import org.apache.commons.lang3.StringUtils;

public class Oper {

    private Operator value;

    
    public Oper(String value) {
        this.value = Operator.valueOf(value);
    }

    

    //pPirmiausia reikia ivyktyti sudeties ir atimties veiksmus tarp 
    //gretimų skaitmenų ir rezultatus vėl gražinti String kintamajam išlaikant formules eiliskuma. 
    public Operator getValue() {
        return value;
    }

   

}
