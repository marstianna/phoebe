package org.phoebe.domain;

/**
 * Created by niefeng on 16/8/19.
 */
public class NodeDO {
    private int id;
    private int parentId;
    private String nodeName;
    private int expressionCollectionId;
    private String value;
    private int isActive;
    private int isLeaf;
    private int isValid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public int getExpressionCollectionId() {
        return expressionCollectionId;
    }

    public void setExpressionCollectionId(int expressionCollectionId) {
        this.expressionCollectionId = expressionCollectionId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public int getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(int isLeaf) {
        this.isLeaf = isLeaf;
    }

    public int getIsValid() {
        return isValid;
    }

    public void setIsValid(int isValid) {
        this.isValid = isValid;
    }
}
