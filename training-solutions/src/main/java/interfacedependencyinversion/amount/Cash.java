package interfacedependencyinversion.amount;

public class Cash implements Payable {
    @Override
    public int getPayableAmount(int amount) {
        int lastDigit = amount % 10;
        switch (lastDigit) {
            case 0:
            case 1:
            case 2:
                return amount - lastDigit;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return amount - lastDigit + 5;
            default:
                return amount - lastDigit + 10;
        }
    }
}
