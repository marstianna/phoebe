package org.phoebe.service.convert;

import org.phoebe.core.domain.NodeDO;
import org.phoebe.domain.NodePO;
import org.phoebe.service.ExpressionService;
import org.phoebe.service.NodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by niefeng on 10/02/2017.
 */
@Component
public class NodePOToDOConvert {
    @Autowired
    private ExpressionService expressionService;
    @Autowired
    private NodeService nodeService;

    public NodeDO convert(NodePO nodePO){
        return null;
    }

}
