package introexceptioncause;

public class PoemMain {

    public static void main(String[] args) {
        Poem poem = new Poem();
        try {
            String firstLetters = poem.firstLetters("src/main/resources/introexceptioncause/poem.txt");
            System.out.println(firstLetters);
        } catch (IllegalStateException ise) {
            System.out.println(ise.getMessage());
            ise.printStackTrace();
            System.out.println("Cause:");
            System.out.println(ise.getCause());
            System.out.println(ise.getCause().getMessage());
            ise.getCause().printStackTrace();
        }
    }
}
