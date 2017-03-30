package org.phoebe.domain;

import lombok.Data;

/**
 * Node in the tree
 *
 * Created by niefeng on 16/8/19.
 */
@Data
public class NodePO {
    //primary key in databse
    private int id;
    //parent node primary key,if its value is 0 means this is root
    private int parentId;
    //node name
    private String nodeName;
    //该节点的判断条件表达式ID
    private int expressionCollectionId;
    //如果命中该节点得到的结果
    private String value;
    //所属的树的ID
    private int treeId;
    //优先级
    private int priority;
    //是否为叶子结点
    private int leaf;
    //是否有效
    private int valid;
}
