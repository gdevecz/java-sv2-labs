package classstructureintegrate;

import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance;

        System.out.print("Name of account owner: ");
        String owner = sc.nextLine();
        System.out.print("Account number: ");
        String accountNumber=sc.nextLine();
        System.out.print("Balance: ");
        balance=sc.nextInt();

        BankAccount bankAccount = new BankAccount(accountNumber, owner, balance);

        System.out.println("The attributes of the account: " + bankAccount.getInfo());
        System.out.println();

        System.out.print("Amount of decrease: ");
        bankAccount.withdraw(sc.nextInt());
        System.out.println(bankAccount.getInfo());

        sc.nextLine();System.out.print("Amount of increase: ");
        bankAccount.deposit(sc.nextInt());
        sc.nextLine();
        System.out.println(bankAccount.getInfo());
    }
}
