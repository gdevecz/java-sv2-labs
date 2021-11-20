package introexceptiontrycatch;

import java.util.Scanner;

public class AnotherCalculator {
    private int leftOperand = 0;
    private int rightOperand = 0;
    private String operator;
    private int result;

    public int operation() {
        int result = 0;
        askOperation();
        result = processOperation();
        return result;
    }

    private void askOperation() {
        leftOperand = askANumber("Kérem az első operandust: ");
        rightOperand = askANumber("Kérem a második operandust: ");
        operator = askOperator("Milyen műveletet szeretne elvégezni? [+-*/]: ");
    }

    private String askOperator(String label) {
        System.out.print(label);
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine().strip();
        if (isOperatorValid(result)) {
            return result;
        }
        return null;
    }

    private int askANumber(String label) {
        System.out.print(label);
        int result = 0;
        Scanner sc = new Scanner(System.in);
        result = sc.nextInt();
        return result;
    }

    private int processOperation() {
        switch (operator) {
            case "+":
                return leftOperand + rightOperand;
            case "-":
                return leftOperand - rightOperand;
            case "*":
                return leftOperand * rightOperand;
            default:
                return leftOperand / rightOperand;
        }
    }

    private boolean isOperatorValid(String operator) {
        if (operator.isBlank() || operator.length() != 1) {
            return false;
        }
        return "+-*/".contains(operator);
    }
}