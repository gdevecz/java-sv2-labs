package enumtype.firstenum;

public class FootballMain {

    public static void main(String[] args) {
        for (Football player : Football.values()) {
            System.out.println(player.name());
        }
    }
}
