package introexceptiontrycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private int leftOperand = 0;
    private int rightOperand = 0;
    private String operator;
    private int result;

    public int operation() {
        int result = 0;
        try {
            askOperation();
            result = processOperation();
        } catch (ArithmeticException ae) {
            System.out.println("0-val való osztás!");
            System.out.println(ae.getMessage());
            ae.printStackTrace();
        } catch (NullPointerException npe) {
            System.out.println("A művelet operátora hibásan van megadva.");
            System.out.println(npe.getMessage());
            npe.printStackTrace();
        }
        return result;
    }

    private void askOperation() {
        leftOperand = askANumber("Kérem az első operandust: ");
        rightOperand = askANumber("Kérem a második operandust: ");
        operator = askOperator("Milyem művelete szeretnék elvégezni? [+-*/]: ");
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
        try {
            Scanner sc = new Scanner(System.in);
            result = sc.nextInt();
            return result;
        } catch (InputMismatchException ime) {
            System.out.println("A megadott adat nem szám.");
            System.out.println(ime.getMessage());
            ime.printStackTrace();
        }
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
