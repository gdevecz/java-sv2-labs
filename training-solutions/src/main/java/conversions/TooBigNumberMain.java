package conversions;

public class TooBigNumberMain {

    public static void main(String[] args) {

        TooBigNumber tooBigNumber = new TooBigNumber();

        System.out.println(tooBigNumber.getRightResult(0));
        System.out.println(tooBigNumber.getRightResult(1));
        System.out.println(tooBigNumber.getRightResult(Integer.MAX_VALUE));
    }
}
