package org.phoebe.domain;

import lombok.Data;

/**
 *
 * 字典
 *
 * 例如:dictionaryName:订单状态,value:orderStatus
 * Created by niefeng on 16/8/19.
 */
@Data
public class DictionaryPO {
    private int id;
    private String dictionaryName;
    private String value;
}
