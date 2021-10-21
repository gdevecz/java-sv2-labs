package packages.main;

//import packages.greetings.Greeter;

public class MainProgram {

    public static void main(String[] args) {

//        Ha importáljuk
//        import packages.greetings.Greeter;
//        Akkor elég:
//        Greeter greeter = new Greeter();
//        Ha nem akarjuk importálni a package-t, vagy névütközés lenne:
        packages.greetings.Greeter greeter = new packages.greetings.Greeter();
        greeter.sayHello();
    }
}
