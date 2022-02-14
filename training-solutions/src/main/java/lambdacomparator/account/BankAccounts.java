package lambdacomparator.account;

import java.text.Collator;
import java.util.*;

public class BankAccounts {

    private List<BankAccount> bankAccounts;

    public BankAccounts(List<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public List<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public List<BankAccount> listBankAccountsByAccountNumber() {
//        List<BankAccount> result = new ArrayList<>(bankAccounts);
//        Collections.sort(result, Comparator.naturalOrder());
//        return result;
        return bankAccounts.stream().sorted().toList();
    }

    public List<BankAccount> listBankAccountsByBalance() {
//        List<BankAccount> result = new ArrayList<>(bankAccounts);
//        Collections.sort(result, Comparator.comparing(a -> Math.abs(a.getBalance())));
//        return result;
        return bankAccounts.stream().sorted(Comparator.comparingDouble(b->Math.abs(b.getBalance()))).toList();
    }

    public List<BankAccount> listBankAccountsByBalanceDesc() {
//        List<BankAccount> result = new ArrayList<>(bankAccounts);
//        Collections.sort(result, Comparator.comparing(BankAccount::getBalance, Comparator.reverseOrder()));
//        return result;
        return bankAccounts.stream().sorted(Comparator.comparingDouble(BankAccount::getBalance).reversed()).toList();
    }

    public List<BankAccount> listBankAccountsByNameThenAccountNumber() {
//        List<BankAccount> result = new ArrayList<>(bankAccounts);
//        Collator collator = Collator.getInstance(new Locale("hu", "HU"));
//        result.sort(Comparator.comparing(BankAccount::getNameOfOwner, Comparator.nullsFirst(collator))
//                .thenComparing(BankAccount::getAccountNumber));
//        return result;
        Collator collator = Collator.getInstance(new Locale("hu", "HU"));
        return bankAccounts.stream()
                .sorted(Comparator.comparing(BankAccount::getNameOfOwner, Comparator.nullsFirst(collator))
                        .thenComparing(BankAccount::getAccountNumber))
                .toList();
    }
}
