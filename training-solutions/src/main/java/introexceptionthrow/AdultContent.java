package introexceptionthrow;

public class AdultContent {

    public static void main(String[] args) {
        Adult adult = new Adult("John Doe", 21);
        System.out.println(adult.getName() + ", age: " + adult.getAge());
        Adult young = new Adult("Young Doe", 12);
    }
}
