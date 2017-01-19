package org.phoebe.domain;

/**
 * Created by niefeng on 16/8/19.
 */
public class TreeSnapshotDO {
    private int id;
    private int treeId;
    private String treeJsonString;
    private int version;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTreeId() {
        return treeId;
    }

    public void setTreeId(int treeId) {
        this.treeId = treeId;
    }

    public String getTreeJsonString() {
        return treeJsonString;
    }

    public void setTreeJsonString(String treeJsonString) {
        this.treeJsonString = treeJsonString;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
