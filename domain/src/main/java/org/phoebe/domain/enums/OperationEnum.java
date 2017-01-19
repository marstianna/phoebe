package org.phoebe.domain.enums;

/**
 * Created by niefeng on 16/8/19.
 */
public enum  OperationEnum {
    EQUALS(1),NOT_EQUALS(2),IN(3),NOT_IN(4),BIGGER(5),LITTLE(6),BIGGER_EQUALS(7),LITTLE_EQUALS(8);

    private int code;

    OperationEnum(int code) {
        this.code = code;
    }

    public OperationEnum getEnumByCode(int code){
        return null;
    }
}
