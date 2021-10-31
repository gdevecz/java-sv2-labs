package stringconcat.nameconcat;

public class NameMain {

    public static void main(String[] args) {
        Name name1 = new Name("Devecz", "Zoltán", "Gábor", Title.MR);
        Name name2 = new Name("Devecz", "Zoltán", "Gábor", null);
        Name name3 = new Name("Devecz", null, "Gábor", Title.MR);
        Name name4 = new Name("Devecz", null "Gábor", null);
        Name name5 = new Name("Devecz", null "Gábor");
        Name name6 = new Name("Devecz", "Zoltán" "Gábor";
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);
        System.out.println(name6);

    }
}
