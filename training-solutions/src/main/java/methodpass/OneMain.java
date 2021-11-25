package methodpass;

public class OneMain {

    public static void main(String[] args) {
        int number = 5;
        System.out.println(number);
        number++;
        System.out.println(number);

        One one = new One();
        System.out.println(one.addOne(number));
        System.out.println(number);
    }
}
