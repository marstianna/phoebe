package org.phoebe.domain;

/**
 * Created by niefeng on 16/8/19.
 */
public class TreeDO {
    private int id;
    private int firstNodeId;
    private int version;
    private int isActive;
    private int isValid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFirstNodeId() {
        return firstNodeId;
    }

    public void setFirstNodeId(int firstNodeId) {
        this.firstNodeId = firstNodeId;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getIsActive() {
        return isActive;
    }

    public void setIsActive(int isActive) {
        this.isActive = isActive;
    }

    public int getIsValid() {
        return isValid;
    }

    public void setIsValid(int isValid) {
        this.isValid = isValid;
    }
}
