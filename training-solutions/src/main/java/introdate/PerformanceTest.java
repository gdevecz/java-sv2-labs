package introdate;

public class PerformanceTest {

    public static void main(String[] args) {
        Performance performance = new Performance("Queen", 1989, 06, 02, 18, 20);

        System.out.println(performance.getArtist() + ": " + performance.getDateOfShow() + " "
                + performance.getStartTime() + " - " + performance.getEndTime());
    }
}
