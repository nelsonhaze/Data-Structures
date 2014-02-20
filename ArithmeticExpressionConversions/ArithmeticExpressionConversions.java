

/*
 * CSCI 230
 * Fall 2012
 * Nelson Hazelbaker
 * 
 * Arithmetic Expression Conversions for Programming Assignment 3
 * (Code based on Dr. Bowrings Model)
 */
package p3;

import java.util.ArrayList;

/**
 *
 * @author Nelson Hazelbaker
 */
public class ArithmeticExpressionConversions {

    static final ArrayList<String> operators = new ArrayList<String>();

    static {
        operators.add("+");
        operators.add("-");
        operators.add("*");
        operators.add("/");
    }

    public static String convertInfixToPostfix(String infixExpression) {
        String postfixExpression = "";

        String[] characters = infixExpression.split(" ");

        Stack s = new Stack();

        for (int i = 0; i < characters.length; i++) {

            String character = characters[i].trim();

            if (character.compareTo("(") == 0) {
            } else if (character.compareTo(")") == 0) {
                if (!s.empty()) {
                    postfixExpression = postfixExpression + " " + s.pop();
                }

            } else if (operators.contains(character)) {
                s.push(character);

            } else {
                postfixExpression = postfixExpression + " " + character;
            }
        }

        while (!s.empty()) {
            postfixExpression = postfixExpression + " " + s.pop();
        }

        return postfixExpression;
    }

    public static int evaluatePostfixExpression(String postfixExpression) {
        int evaluation = 0;

        String[] characters = postfixExpression.split(" ");

        Stack s = new Stack();

        for (int i = 0; i < characters.length; i++) {
            String character = characters[i].trim();

            if (operators.contains(character)) {
                int val1 = Integer.valueOf(s.pop());
                int val2 = Integer.valueOf(s.pop());

                if (character.compareTo("+") == 0) {
                    evaluation = val2 + val1;

                } else if (character.compareTo("-") == 0) {
                    evaluation = val2 - val1;

                } else if (character.compareTo("*") == 0) {
                    evaluation = val2 * val1;

                } else {
                    evaluation = val2 / val1;
                }

                s.push(String.valueOf(evaluation));

            } else {
                if (character.length() > 0) {
                    s.push(characters[i]);
                }
            }

        }
        if (!s.empty()) {
            evaluation = Integer.valueOf(s.pop());
        }
         return evaluation;
    }
}