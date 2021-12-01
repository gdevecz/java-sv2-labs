package inheritanceconstructor.tea;

public class TeaMain {

    public static void main(String[] args) {
        Tea tea = new Tea("tea neve", 123);
        HerbalTea herbalTea = new HerbalTea("herbál tea", 234);

        System.out.println(tea.getName() + ", " + tea.getPrice());
        System.out.println(herbalTea.getName() + ", " + herbalTea.getPrice());
    }
}
