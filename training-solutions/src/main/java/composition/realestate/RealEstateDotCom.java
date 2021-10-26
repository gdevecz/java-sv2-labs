package composition.realestate;

public class RealEstateDotCom {

    public static void main(String[] args) {

        RealEstate estate = new RealEstate("Eladó lakás Budapesten X. kerületben.", 13.2,
                new Details("Lakás, felújítva sürgősen eladó a X. kerületben, vagy ráfizetéssel csere is érdekel.",
                new Address("Budapest","1089", "Váci út", 8),
                62, 70));

        System.out.println(estate);
        System.out.println();
        System.out.println(estate.getDetails());
        System.out.println();
        System.out.println(estate.getDetails().getAddress());
        System.out.println();
        System.out.println("Ár: " + estate.getPrice());
        System.out.println();
        System.out.println("négyzetméter: " + estate.getDetails().getSquareMeter());
        System.out.println();
        System.out.println("Város: " + estate.getDetails().getAddress().getCity());
    }
}
