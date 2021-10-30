package enumtype.firstenum;

public class OceanMain {

    public static void main(String[] args) {
        String[] oceans = {"PACIFIC", "ATLANTIC", "INDIAN", "SOUTHERN", "ARCTIC"};
        for (int i = 0; i < oceans.length; i++ ) {
            System.out.println(Ocean.valueOf(oceans[i]));
        }
    }
}
