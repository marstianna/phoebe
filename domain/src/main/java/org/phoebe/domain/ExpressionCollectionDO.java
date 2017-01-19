package org.phoebe.domain;

/**
 * Created by niefeng on 16/8/19.
 */
public class ExpressionCollectionDO {
//    id int primary key auto_increment,
//    expression_text text
    private int id;
    private String expressionText;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExpressionText() {
        return expressionText;
    }

    public void setExpressionText(String expressionText) {
        this.expressionText = expressionText;
    }
}
