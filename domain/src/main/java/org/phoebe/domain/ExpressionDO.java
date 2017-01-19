package org.phoebe.domain;

/**
 * Created by niefeng on 16/8/19.
 */

public class ExpressionDO {
    private int id;
    //@see OperationEnum
    private int operation;
    private int dictionaryId;
    private String paramValueList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public int getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId(int dictionaryId) {
        this.dictionaryId = dictionaryId;
    }

    public String getParamValueList() {
        return paramValueList;
    }

    public void setParamValueList(String paramValueList) {
        this.paramValueList = paramValueList;
    }
}
