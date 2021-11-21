package introexceptioncheckedtrace;

import java.io.IOException;

public class NeptunMain {

    public static void main(String[] args) {
        Neptun neptun = new Neptun();
        try {
            System.out.println(neptun.readNetpunCodes("src/main/resources/introexceptioncheckedtrace/neptun.csv"));
        } catch (IOException e) {
            System.out.println("Can not read file!");
            e.printStackTrace();
        }
    }
}
