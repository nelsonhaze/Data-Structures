/*
 * CSCI 230
 * Fall 2012
 * Nelson Hazelbaker
 * 
 * Driver class for Programming Assignment 3
 * 
 */
package p3;

/**
 *
 * @author Nelson Hazelbaker
 */
public class Driver {

    public static void main(String[] args) {

        String infixExpression = "( ( 3 * 5 ) + ( ( 7 * 3 ) * 6 ) ) / ( 7 * 2 )";

        System.out.println("Infix expression: "
                + infixExpression);

        String postfixExpression = ArithmeticExpressionConversions.convertInfixToPostfix(infixExpression);
        System.out.println("Postfix expression: " 
                + postfixExpression);

        System.out.println("Integer evaluation: " +
                ArithmeticExpressionConversions.evaluatePostfixExpression(postfixExpression));
    }
}

