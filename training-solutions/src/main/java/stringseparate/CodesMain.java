package stringseparate;

import java.util.Arrays;
import java.util.List;

public class CodesMain {

    public static void main(String[] args) {
        Codes codes = new Codes();
        System.out.println("Kódok: 1fsgwweg, T57fbj, xtcu45, 9898f, f578GVHd");

        System.out.println(codes.getCodesStartWithLetter(Arrays.asList("1fsgwweg", "T57fbj", "xtcu45", "9898f", "f578GVHd")));
    }
}
