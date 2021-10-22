package cmdarguments.operation;

public class Operation {

    public static void main(String[] args) {

        for (String argument : args) {
            if (argument.equals("/list")) {
                System.out.println("Listázás");
            } else if (argument.equals("/add")) {
                System.out.println("Hozzáadás");
            } else if (argument.equals("/delete")) {
                System.out.println("Törlés");
            } else {
                System.out.println("Ismeretlen művelet");
            }
        }
    }
}
