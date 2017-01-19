package org.phoebe.domain;

import lombok.Data;

/**
 * Created by niefeng on 16/8/19.
 */
@Data
public class TreePO {
    private int id;
    private int firstNodeId;
    private int version;
    private int isActive;
    private int isValid;
}
