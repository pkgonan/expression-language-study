package com.study;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class Main {

    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("length() > 3");

        String input = "TEST";
        EvaluationContext context = new StandardEvaluationContext(input);

        Boolean result = expression.getValue(context, Boolean.class);

        System.out.println(result);
    }
}
