package introexceptiontrycatch;

import java.util.InputMismatchException;

public class AnotherCalculatorMain {

    public static void main(String[] args) {
        AnotherCalculatorMain acm = new AnotherCalculatorMain();
        AnotherCalculator calculator = new AnotherCalculator();
        String answer;
        System.out.println("Kérem a művelet adatait!");
        try {
            System.out.println("Az erdmény: " + calculator.operation());
        } catch (InputMismatchException ime) {
            acm.catchException(ime, "A megadott adat nem szám.");
        } catch (ArithmeticException ae) {
            acm.catchException(ae, "0-val való osztás!");
        } catch (NullPointerException npe) {
            acm.catchException(npe, "A művelet operátora hibásan van megadva.");
        }
    }

    public void catchException(Exception e, String label) {
        System.out.println(label);
        System.out.println(e.getMessage());
        e.printStackTrace();
    }
}
