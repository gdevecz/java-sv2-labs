package controliteration.fibonacci;

public class FibonacciMain {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        System.out.println(fibonacci.getFibonacciNumbers(10));
        System.out.println(fibonacci.getFibonacciNumbers2(10));
        System.out.println(fibonacci.getFibonacciNumbers3(10));
    }
}
