package org.phoebe.core.parser;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.math.NumberUtils;
import org.phoebe.commons.enums.OperationEnum;
import org.phoebe.core.domain.ExpressionDO;
import org.phoebe.core.exception.IllegalExpressionException;

import java.util.ArrayList;
import java.util.Map;
import java.util.Stack;

/**
 * Created by niefeng on 19/01/2017.
 */
public class ExpressionCollectionParser {
    public static final String SPLIT_MARK = ",";

    public static boolean parse(Map<String,String> inputs, ExpressionDO[] expressions) throws IllegalExpressionException {
        Stack<TmpResult> stack = new Stack<>();
        for(int i = 0; i < expressions.length ; i++ ){
            OperationEnum operation = expressions[i].getOperation();
            //如果表达式为连接符
            if(expressions[i].getName() == null){
                // (
                if(operation.equals(OperationEnum.LEFT_BRACKET)){
                    stack.push(TmpResult.of(OperationEnum.LEFT_BRACKET));
                }
                // &&
                if(operation.equals(OperationEnum.AND)){
                    stack.push(TmpResult.of(OperationEnum.AND));
                }
                // ||
                if(operation.equals(OperationEnum.OR)){
                    stack.push(TmpResult.of(OperationEnum.OR));
                }
                // )
                if(operation.equals(OperationEnum.RIGHT_BRACKET)){
                    boolean b = judgeInParentheses(stack);
                    stack.push(TmpResult.of(b));
                }
            }
            //表达式不为连接符
            else{
                boolean expressionResult = false;
                String value = inputs.get(expressions[i].getName());
                if(value == null){
                    continue;
                    //不再执行下面的判断
                }
                //只有数字才能比较大小
                if(NumberUtils.isNumber(value) && NumberUtils.isNumber(expressions[i].getValue())) {
                    double numberOfInput = NumberUtils.toDouble(value);
                    double numberOfValue = NumberUtils.toDouble(expressions[i].getValue());

                    if (operation.equals(OperationEnum.BIGGER)) {
                        expressionResult = numberOfInput > numberOfValue;
                    }
                    if (operation.equals(OperationEnum.LITTLE)) {
                        expressionResult = numberOfInput < numberOfValue;
                    }
                    if (operation.equals(OperationEnum.BIGGER_EQUALS)) {
                        expressionResult = numberOfInput >= numberOfValue;
                    }
                    if (operation.equals(OperationEnum.LITTLE_EQUALS)) {
                        expressionResult = numberOfInput <= numberOfValue;
                    }
                }

                if(operation.equals(OperationEnum.EQUALS)){
                    expressionResult = value.equals(expressions[i].getValue());
                }
                if(operation.equals(OperationEnum.NOT_EQUALS)){
                    expressionResult = !value.equals(expressions[i].getValue());
                }

                //对于包含关系的判断
                if(operation.equals(OperationEnum.IN)){
                    ArrayList<String> values = Lists.newArrayList(value.split(SPLIT_MARK));
                    expressionResult = values.contains(expressions[i].getValue());
                }
                if(operation.equals(OperationEnum.NOT_IN)){
                    ArrayList<String> values = Lists.newArrayList(value.split(SPLIT_MARK));
                    expressionResult = !values.contains(expressions[i].getValue());
                }
                stack.push(TmpResult.of(expressionResult));
            }
        }
        if (stack.size() > 1){
            return judgeInParentheses(stack);
        }else{
            return stack.pop().result;
        }
    }

    private static boolean judgeInParentheses(Stack<TmpResult> stack){
        boolean judge = false;
        //正常来说,这个一定是奇数
        Stack<TmpResult> tmpStack = new Stack<>();
        while(stack.size() > 0){
            TmpResult result = stack.pop();
            if(!OperationEnum.LEFT_BRACKET.equals(result.operation)){
                tmpStack.push(result);
            }
            //找到第一个左括号,结束掉遍历
            else{
                boolean tmp = tmpStack.pop().result;
                while(tmpStack.size() > 1){
                    TmpResult operation = tmpStack.pop();
                    TmpResult next = tmpStack.pop();
                    if(OperationEnum.AND.equals(operation.operation)){
                        tmp = tmp && next.result;
                    }
                    if(OperationEnum.OR.equals(operation.operation)){
                        tmp = tmp || next.result;
                    }
                }
                judge = tmp;
                break;
            }
        }
        return judge;
    }

    static class TmpResult{
        OperationEnum operation;
        boolean result;

        public static TmpResult of(OperationEnum operation){
            TmpResult tmpResult = new TmpResult();
            tmpResult.operation = operation;
            return tmpResult;
        }

        public static TmpResult of(boolean result){
            TmpResult tmpResult = new TmpResult();
            tmpResult.result = result;
            return tmpResult;
        }
    }



    public static void main(String[] args) {
        //(a.equals("test")) || (b.equals("World"))
        ExpressionDO expression0 = new ExpressionDO();
        expression0.setOperation(OperationEnum.LEFT_BRACKET);

        ExpressionDO expression1 = new ExpressionDO();
        expression1.setName("a");
        expression1.setOperation(OperationEnum.EQUALS);
        expression1.setValue("test");

        ExpressionDO expression2 = new ExpressionDO();
        expression2.setOperation(OperationEnum.RIGHT_BRACKET);

        ExpressionDO expression3 = new ExpressionDO();
        expression3.setOperation(OperationEnum.OR);

        ExpressionDO expression4 = new ExpressionDO();
        expression4.setOperation(OperationEnum.LEFT_BRACKET);

        ExpressionDO expression5 = new ExpressionDO();
        expression5.setName("b");
        expression5.setOperation(OperationEnum.EQUALS);
        expression5.setValue("World1");

        ExpressionDO expression6 = new ExpressionDO();
        expression6.setOperation(OperationEnum.RIGHT_BRACKET);

        try {
            System.out.println(ExpressionCollectionParser.parse(
                    ImmutableMap.of("a","test","b","World"),
                    new ExpressionDO[]{expression0,expression1,expression2,expression3,expression4,expression5,expression6}));
        } catch (IllegalExpressionException e) {
            e.printStackTrace();
        }

    }
}
