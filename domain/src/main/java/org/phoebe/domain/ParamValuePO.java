package org.phoebe.domain;

import lombok.Data;

/**
 * Created by niefeng on 16/8/19.
 */
@Data
public class ParamValuePO {
    private int id;
    private int dictionaryId;
    private String paramName;
    private String paramValue;
}
