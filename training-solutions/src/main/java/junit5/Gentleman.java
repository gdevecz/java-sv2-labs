package junit5;

public class Gentleman {

    public String sayHello(String name) {
        if (name == null) {
//            return sayHello(("Anonymous"));
            return "Hello, Anonymous!";
        }
        return "Hello, " + name + "!";
    }
}
