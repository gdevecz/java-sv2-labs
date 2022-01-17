package exceptionclass.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accounts = new ArrayList<>();

    public Bank(List<Account> accounts) {
        if (accounts == null) {
            throw new IllegalArgumentException("Account list should not be null!");
        }
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    private Account getAccountWithAccountNumber(String accountNumber) {
        for (Account account : accounts) {
            if (accountNumber.equals(account.getAccountNumber())) {
                return account;
            }
        }
        throw new InvalidAccountNumberBankOperationException("Invalid account number!");
    }

    public void payment(String accountNumber, double volume) {
        Account account = getAccountWithAccountNumber(accountNumber);
        if (account.getMaxSubtract() < volume) {
            throw new InvalidAmountBankOperationException("Volume is too big.");
        }
        account.subtract(volume);
    }

    public void deposit(String accountNumber, double volume) {
        getAccountWithAccountNumber(accountNumber).deposit(volume);
    }
}
