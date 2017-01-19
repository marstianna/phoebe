package org.phoebe.domain;

import lombok.Data;

/**
 * Created by niefeng on 16/8/19.
 */
@Data
public class ExpressionPO {
    private int id;
    //@see OperationEnum
    private int operation;
    private int dictionaryId;
    private String paramValueList;
}
