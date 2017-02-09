package org.phoebe.core.domain;

import lombok.Data;
import org.apache.commons.lang3.ArrayUtils;
import org.phoebe.core.exception.IllegalExpressionException;
import org.phoebe.core.parser.ExpressionCollectionParser;

import java.util.*;

/**
 * Created by niefeng on 19/01/2017.
 */
@Data
public class NodeDO {
    private int id;
    private NodeDO parent;
    private String nodeName;
    private ExpressionDO[] expressions;
    private List<NodeDO> leaves = new ArrayList<>();
    private boolean leaf;
    private int priority;
    private String value;

    public List<NodeDO> getValidLeaves(){
        return !isLeaf() ? leaves : Collections.EMPTY_LIST;
    }

    public boolean isShoted(Map<String,String> inputs) throws IllegalExpressionException {
        return ArrayUtils.isEmpty(expressions) ? true : ExpressionCollectionParser.parser(inputs,expressions);
    }

}
