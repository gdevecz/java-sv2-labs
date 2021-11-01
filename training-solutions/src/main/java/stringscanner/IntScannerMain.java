package stringscanner;

public class IntScannerMain {

    public static void main(String[] args) {
        IntScanner intScanner = new IntScanner();

        String test = "5;3;107;12;123;18;198";

        System.out.println(intScanner.convertInts(test));
    }
}
