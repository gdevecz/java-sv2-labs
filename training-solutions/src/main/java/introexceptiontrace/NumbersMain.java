package introexceptiontrace;

public class NumbersMain {

    public static void main(String[] args) {
        Change change = new Change();

        int[] result = change.changeNumbers();
        System.out.println(result);
    }
}
