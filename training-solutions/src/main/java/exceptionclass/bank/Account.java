package exceptionclass.bank;

public class Account {

    private String accountNumber;

    private double balance;

    private double maxSubtract;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null) {
            throw new IllegalArgumentException("Account number should not be null!");
        }
        this.accountNumber = accountNumber;
        this.balance = balance;
        maxSubtract = 100_000;
    }

    public double subtract(double volume) {
        if (volume < 0) {
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        if (balance < volume) {
            throw new LowBalanceBankOperationException("Low balance!");
        }
        return balance -= volume;
    }

    public double deposit(double volume) {
        if (volume < 0) {
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        return balance += volume;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getMaxSubtract() {
        return maxSubtract;
    }

    public void setMaxSubtract(double maxSubtract) {
        if (maxSubtract < 0) {
            throw new InvalidAmountBankOperationException("Invalid amount!");
        }
        this.maxSubtract = maxSubtract;
    }
}
