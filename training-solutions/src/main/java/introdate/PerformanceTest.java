package introdate;

public class PerformanceTest {

    public static void main(String[] args) {
        Performance performance = new Performance("Queen", 1989, 06, 02, 18, 20);

        System.out.println("Artist: " + performance.getArtist());
        System.out.println("Date of performance: " + performance.getDateOfShow());
        System.out.println("Start: " + performance.getStartTime());
        System.out.println("End: " + performance.getEndTime());

        System.out.println(performance.getInfo());
    }
}
