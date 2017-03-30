package org.phoebe.domain;

import lombok.Data;

/**
 * 字典的常量
 *
 * 例如:
 * dictionaryId:1{
 *      dictionaryName:订单状态,value:orderStatus
 * }
 * 此时
 * paramName:买家已付款,paramValue:1
 * paramName:卖家已发货,paramValue:2
 *
 * Created by niefeng on 16/8/19.
 */
@Data
public class ParamValuePO {
    private int id;
    private int dictionaryId;
    private String paramName;
    private String paramValue;
}
