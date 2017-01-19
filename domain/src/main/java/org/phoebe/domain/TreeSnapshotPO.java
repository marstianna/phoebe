package org.phoebe.domain;

import lombok.Data;

/**
 * Created by niefeng on 16/8/19.
 */
@Data
public class TreeSnapshotPO {
    private int id;
    private int treeId;
    private String treeJsonString;
    private int version;
}
