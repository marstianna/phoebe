package org.phoebe.core.domain;

import lombok.Data;
import org.phoebe.commons.enums.OperationEnum;

/**
 * Created by niefeng on 06/02/2017.
 */
@Data
public class ExpressionDO {
    private int id;
    private String name;
    private String value;
    private OperationEnum operation;
}
