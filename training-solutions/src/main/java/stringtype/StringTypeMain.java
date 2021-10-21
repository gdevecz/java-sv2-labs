package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {

        String prefix = "Hello ";

        String name = "John Doe";

        String message = prefix + name;

        message += 444;

        boolean b = message.equals("Hello John Doe");

        boolean c = message.equals("Hello John Doe444");

        System.out.println(prefix);
        System.out.println(name);
        System.out.println(message);
        System.out.println(b);
        System.out.println(c);

        String s = "Abcde";
        System.out.println(s.length());
        System.out.println(s.charAt(0) + ", " + s.charAt(2));
        System.out.println(s.substring(0,2));
    }
}
