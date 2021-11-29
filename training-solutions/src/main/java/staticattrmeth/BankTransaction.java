package staticattrmeth;

public class BankTransaction {

    private static final long MIN_TRANSACTION_VALUE = 1L;

    private static final long MAX_TRANSACTION_VALUE = 10_000_000L;

    private static long countOfTransactions = 0L;

    private static long sumOfTransactions = 0L;

    private static long currentMinValue = MIN_TRANSACTION_VALUE;

    private static long currentMaxValue = MAX_TRANSACTION_VALUE;

    public BankTransaction(long transactionValue) {
        if (transactionValue <= MIN_TRANSACTION_VALUE && transactionValue >= MAX_TRANSACTION_VALUE) {
            throw new IllegalArgumentException("Invalid transaction: " + transactionValue);
        }
        sumOfTransactions += transactionValue;
        if (currentMinValue > transactionValue) {
            currentMinValue = transactionValue;
        }
        if (currentMaxValue < transactionValue) {
            currentMaxValue = transactionValue;
        }
        countOfTransactions++;
    }

    public static void initTheDay() {
        countOfTransactions = 0;
        sumOfTransactions = 0;
        currentMinValue = Long.MAX_VALUE;
        currentMaxValue = Long.MIN_VALUE;
    }

    public static long getAverageOfTransaction() {
        return Math.round((double) sumOfTransactions / (double) countOfTransactions);
    }

    public static long getCurrentMinValue() {
        return getOForStart(currentMinValue);
    }

    public static long getCurrentMaxValue() {
        return getOForStart(currentMaxValue);
    }

    public static long getSumOfTransactions() {
        return sumOfTransactions;
    }

    private static long getOForStart(long value) {
        return countOfTransactions == 0 ? 0 : value;
    }
}
