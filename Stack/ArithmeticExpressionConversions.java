/*
 * CSCI 230
 * Fall 2012
 * Nelson Hazelbaker
 * 
 * ArithmeticExpressionConversions Class for Programming Assignment 4
 * 
 * 
 */
package p4;

    /**
     * Pre-conditions: infixExpression is an expression with spaces between each character,
     * it contains specific characters such as parentheses, integer operands, 
     * and these common operators: +,-,*,/
     * 
     * Post-condition: returns a String representation of the infixExpression
     * as a postfix expression consisting of integers and operands also separated by single spaces.
     * 
     * @param infixExpression
     * @return 
     */
public class ArithmeticExpressionConversions {

    public static String convertInfixToPostfix(String infixExpression) {
        String postfixExpression = "";

        String[] characters = infixExpression.split(" ");

        StackSLL s = new StackSLL();

        for (int i = 0; i < characters.length; i++) {

            String character = characters[i].trim();

            if (character.compareTo("(") == 0) {
            } else if (character.compareTo(")") == 0) {
                if (!s.isEmpty()) {
                    postfixExpression = postfixExpression + " " + s.pop();
                }
            } else if (character.compareTo("+")== 0 || character.compareTo("-") == 0
                || character.compareTo("/") == 0 || character.compareTo("*") == 0){
                s.push(character);
            } else {
                postfixExpression = postfixExpression + " " + character;
            }
        }

        while (!s.isEmpty()) {
            postfixExpression = postfixExpression + " " + s.pop();
        }

        return postfixExpression;
    }

    public static int evaluatePostfixExpression(String postfixExpression) {
        int eval = 0;

        String[] characters = postfixExpression.split(" ");

        StackSLL s = new StackSLL();

        for (int i = 0; i < characters.length; i++) {
            
            String character = characters[i].trim();

           if (character.compareTo("+")== 0 || character.compareTo("-") == 0
                || character.compareTo("/") == 0 || character.compareTo("*") == 0){
             
                int num1 = Integer.valueOf(s.pop());
                int num2 = Integer.valueOf(s.pop());

                if (character.compareTo("+") == 0) {
                    eval = num2 + num1;

                } else if (character.compareTo("-") == 0) {
                    eval = num2 - num1;

                } else if (character.compareTo("*") == 0) {
                    eval = num2 * num1;

                } else {
                    eval = num2 / num1;
                }

                s.push(String.valueOf(eval));

            } else {
                if (character.length() > 0) {
                    s.push(characters[i]);
                }
           }
        }
        if (!s.isEmpty()) {
            eval = Integer.valueOf(s.pop());
        }
        return eval;
    }
}