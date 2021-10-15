package classstructureconstructors;

public class StoreMain {

    public static void main(String[] args) {

        Store storeOne = new Store("Books");
        Store storeTwo = new Store("Albums");

        System.out.println("A két raktár példányosítva, de a készlet nincs beállítva:");
        System.out.println("1. raktár:\n" + storeOne);
        System.out.println("2. raktár:\n" + storeTwo);

        System.out.println();
        storeOne.store(300);
        System.out.println("A két raktár példányosítva, az 1. raktár készlete 300-ra állítva:");
        System.out.println("1. raktár:\n" + storeOne);
        System.out.println("2. raktár:\n" + storeTwo);

        System.out.println();
        storeTwo.store(234);
        System.out.println("A két raktár példányosítva, a 2. raktár készlete 234-re állítva:");
        System.out.println("1. raktár:\n" + storeOne);
        System.out.println("2. raktár:\n" + storeTwo);

        System.out.println();
        storeOne.store(10);
        storeTwo.dispatch(33);
        System.out.println("A két raktár példányosítva, az 1. raktár készele 10-el nőtt, a második raktár készlete 33-al csökkent:");
        System.out.println("1. raktár:\n" + storeOne);
        System.out.println("2. raktár:\n" + storeTwo);

    }
}
