package algorithmsdecision.bankaccounts;

public class BankAccount {

    private String nameOfOwner;

    private String accountNumber;

    private int balance;

    public BankAccount(String nameOfOwner, String accountNumber, int balance) {
        this.nameOfOwner = nameOfOwner;
        this.accountNumber = accountNumber;
        this.balance =    balance;
    }


    public void withdraw(int volume) {
        balance -= volume;
    }

    public void deposit(int volume) {
        balance+=volume;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }
}
