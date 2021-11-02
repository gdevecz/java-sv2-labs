package controliteration.fibonacci;

public class Fibonacci {

    public String getFibonacciNumbers(int itemNumber) {
        int beforeThePrevious = 0;
        int previous = 0;
        int actualNumber = 1;
        StringBuilder sb = new StringBuilder(String.valueOf(actualNumber));
        for (int i = 1; i < itemNumber; i++) {
            beforeThePrevious = previous;
            previous = actualNumber;
            actualNumber = beforeThePrevious + previous;
            sb.append(", " + actualNumber);
        }
        return sb.toString();
    }

    public String getFibonacciNumbers2(int itemNumber) {
        int beforeThePrevious = 0;
        int previous = 0;
        int actualNumber = 1;
        StringBuilder sb = new StringBuilder(String.valueOf(actualNumber));
        int i = 1;
        while (i < itemNumber) {
            beforeThePrevious = previous;
            previous = actualNumber;
            actualNumber = beforeThePrevious + previous;
            sb.append(", " + actualNumber);
            i++;
        }
        return sb.toString();
    }

    public String getFibonacciNumbers3(int itemNumber) {
        int beforeThePrevious = 0;
        int previous = 0;
        int actualNumber = 1;
        StringBuilder sb = new StringBuilder(String.valueOf(actualNumber));
        int i = 1;
        do {
            beforeThePrevious = previous;
            previous = actualNumber;
            actualNumber = beforeThePrevious + previous;
            sb.append(", ").append(actualNumber);
            i++;
        }while (i < itemNumber);
        return sb.toString();
    }
}