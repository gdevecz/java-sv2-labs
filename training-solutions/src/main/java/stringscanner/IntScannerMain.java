package stringscanner;

public class IntScannerMain {

    public static void main(String[] args) {
        IntScanner intScanner = new IntScanner();

        String test = "5;3;107;12;123;18;198";
        System.out.println(intScanner.convertInts(test));

        test = "198";
        System.out.println(intScanner.convertInts(test));

        test = "5";
        System.out.println(intScanner.convertInts(test));

        test = "5;3;12;18";
        System.out.println(intScanner.convertInts(test));

        test = "";
        System.out.println(intScanner.convertInts(test));

    }
}
