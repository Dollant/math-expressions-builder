package com.pluralsight;

public class MathExpressionBuilder {
    public static void main(String[] args) {
// STEP 1: Declare your variables
        int x = 12;
        int y = 7;
        int z = 2;
        double w = 1.8;

        System.out.println("Mathematical Expression Builder");

// STEP 2: Show the original expression as a label
        System.out.println("Original expression: " + x + " + " + y + " * " + z + " - " + w);

// STEP 3: Step-by-step calculation
        double multiplyFirst = y * z;       // 7 * 2 = 14
        double stepByStep = x + multiplyFirst - w;  // 12 + 14 - 1.8 = 24.2

        System.out.println("Step-by-step result: " + stepByStep);

// STEP 4: Direct calculation
        double directCalc = x + y * z - w;  // Java reads: 12 + (7*2) - 1.8

        System.out.println("Direct calculation: " + directCalc);

// STEP 5: Force a different order with parentheses
        double withParentheses = (x + y) * z - w;  // (12+7)*2 - 1.8 = 36.2

        System.out.println("\nWith parentheses: (" + x + " + " + y + ") * " + z + " - " + w + " = " + withParentheses);

// STEP 6: Show the difference
        double difference = withParentheses - directCalc;  // 36.2 - 24.2 = 12.0

        System.out.println("Difference: " + difference);


    }
}
