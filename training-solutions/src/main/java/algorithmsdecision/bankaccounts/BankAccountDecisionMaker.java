package algorithmsdecision.bankaccounts;

import java.util.ArrayList;
import java.util.List;

public class BankAccountDecisionMaker {

    List<BankAccount> bankAccounts = new ArrayList<>();

    public boolean containsBalanceGreaterThan(List<BankAccount> accounts, int min) {

        for (BankAccount account : accounts) {
            account.notify();
            if (account.getBalance() < min) {
                return true;
            }
        }
        return false;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }
}
