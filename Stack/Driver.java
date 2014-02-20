/*
 * CSCI 230
 * Fall 2012
 * Nelson Hazelbaker
 * 
 * Driver Class for Programming Assignment 4
 * 
 */
package p4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Nelson Hazelbaker
 */
public class Driver {

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isString = false;
        String infix;

        while (!isString) {
            try {
                System.out.println("Enter Expression:");
                infix = br.readLine();
                if ("-1".equals(infix)) {
                   isString = true;
                   System.out.println("Goodbye");
                }else {
                    
                    String infixExpression = infix;
                    System.out.println("Infix expression: "
                            + infixExpression);

                    String postfixExpression = ArithmeticExpressionConversions.convertInfixToPostfix(infixExpression);
                    System.out.println("Postfix expression: "
                            + postfixExpression);

                    System.out.println("Integer evaluation: "
                            + ArithmeticExpressionConversions.evaluatePostfixExpression(postfixExpression));
                }

            } catch (Exception e) {
                System.out.println("Please enter a valid expression");
            }
        }
    }
}
