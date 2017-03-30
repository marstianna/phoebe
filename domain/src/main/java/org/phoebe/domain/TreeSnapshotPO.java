package org.phoebe.domain;

import lombok.Data;

/**
 * 树的快找
 *
 * Created by niefeng on 16/8/19.
 */
@Data
public class TreeSnapshotPO {
    private int id;
    private int treeId;
    private String treeJsonString;
    private int version;
}
