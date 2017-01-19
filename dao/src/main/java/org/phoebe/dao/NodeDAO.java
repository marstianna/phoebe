package org.phoebe.dao;

import org.phoebe.domain.NodePO;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by niefeng on 19/01/2017.
 */
@Repository
public interface NodeDAO {
    List<NodePO> getNodesByParentId(int parentId);

    List<NodePO> getNodesByTreedId(int treeId);
}
