package interfacedependencyinversion.amount;

public class PayableTest {

    public static void main(String[] args) {
        System.out.println(new Amount().getPayableAmount(12345));
        System.out.println(new Cash().getPayableAmount(10));
        System.out.println(new Cash().getPayableAmount(11));
        System.out.println(new Cash().getPayableAmount(12));
        System.out.println(new Cash().getPayableAmount(13));
        System.out.println(new Cash().getPayableAmount(14));
        System.out.println(new Cash().getPayableAmount(15));
        System.out.println(new Cash().getPayableAmount(16));
        System.out.println(new Cash().getPayableAmount(17));
        System.out.println(new Cash().getPayableAmount(18));
        System.out.println(new Cash().getPayableAmount(19));
        System.out.println(new BankAtm().getPayableAmount(2000));
        System.out.println(new BankAtm().getPayableAmount(2001));
        System.out.println(new BankAtm().getPayableAmount(2999));
    }
}
