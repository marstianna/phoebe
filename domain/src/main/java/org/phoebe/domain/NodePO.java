package org.phoebe.domain;

import lombok.Data;

/**
 * Created by niefeng on 16/8/19.
 */
@Data
public class NodePO {
    private int id;
    private int parentId;
    private String nodeName;
    private int expressionCollectionId;
    private String value;
    private int treeId;
    private int priority;
    private int isActive;
    private int isLeaf;
    private int isValid;
}
