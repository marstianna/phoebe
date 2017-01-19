package org.phoebe.commons.enums;

/**
 * Created by niefeng on 16/8/19.
 */
public enum  OperationEnum {
    EQUALS(1,"=="),NOT_EQUALS(2,"!="),IN(3,"in"),NOT_IN(4,"not-in"),BIGGER(5,">"),LITTLE(6,"<"),BIGGER_EQUALS(7,">="),LITTLE_EQUALS(8,"<="),
    AND(9,"&&"),OR(10,"||"),LEFT_BRACKET(11,"("),RIGHT_BRACKET(12,")");

    private int code;
    private String symbol;

    OperationEnum(int code,String symbol) {
        this.code = code;
        this.symbol = symbol;
    }

    public OperationEnum getEnumByCode(int code){
        OperationEnum[] values = OperationEnum.values();
        for(OperationEnum operation : values){
            if(operation.code == code){
                return operation;
            }
        }
        return null;
    }
}
