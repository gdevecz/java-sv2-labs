package attributes.bill;

public class Bill {

    public static void main(String[] args) {

        BillItem bill = new BillItem("Sör", 380, 12, 0.27);

        System.out.println(bill);
        System.out.println(bill.getProduct());
        System.out.println(bill.getQuantity());
        System.out.println(bill.getPrice());
        System.out.println(bill.getVatPercent() * 100 + "%");
        System.out.println(bill.calculateTotalPrice());
        System.out.println(bill.roundedCalculateTotalPrice());
    }
}
