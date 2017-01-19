package org.phoebe.core.domain;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.phoebe.core.parser.ExpressionCollectionParser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by niefeng on 19/01/2017.
 */
@Data
public class NodeDO {
    private int id;
    private NodeDO parent;
    private String nodeName;
    private String expressionCollectionStr;
    private List<NodeDO> leaves = new ArrayList<>();
    private boolean leaf;
    private int priority;
    private String value;

    public List<NodeDO> getValidLeaves(){
        return !isLeaf() ? leaves : Collections.EMPTY_LIST;
    }

    public boolean isShoted(Map<String,String> inputs){
        return StringUtils.isBlank(this.expressionCollectionStr) ? true : ExpressionCollectionParser.parser(inputs);
    }

}
