package org.phoebe.domain;

/**
 * Created by niefeng on 16/8/19.
 */
public class ParamValueDO {
    private int id;
    private int dictionaryId;
    private String paramName;
    private String paramValue;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDictionaryId() {
        return dictionaryId;
    }

    public void setDictionaryId(int dictionaryId) {
        this.dictionaryId = dictionaryId;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }
}
