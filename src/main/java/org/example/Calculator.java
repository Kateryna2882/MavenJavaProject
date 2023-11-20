package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter operand1: ");
        double operand1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, x, /): ");
        String operator = scanner.next();

        System.out.print("Enter operand2: ");
        double operand2 = scanner.nextDouble();
        if (operand1 == 0 && operand2 == 0
                && ("/".equals(operator) || "x".equals(operator)
                || ":".equals(operator) || "*".equals(operator))){
            System.out.println(
                    "Error : Cannot perform operation with both operands being zero.");
        }

            double result = calculateResult(operand1, operator, operand2);

        System.out.println("Result: " + result);

        scanner.close();
    }

    private static double calculateResult(double operand1, String operator, double operand2) {
        double result = 0;

        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "x":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    System.exit(1);
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Supported operators are +, -, x, /");
                System.exit(1);
        }

        return result;
    }
}