package statements;

import java.util.Scanner;

public class InvestmentMain {

    public static void main(String[] args) {

        Investment investment;

        int fund;

        int interestRate;

        int days1 = 50;      //teszteléshez

        int days2 = 80;      //teszteléshez

        int days3 = 90;      //teszteléshez

        Scanner sc = new Scanner(System.in);
        System.out.println("Befektetés összege:");
        fund = sc.nextInt();
        System.out.println("Kamatláb:");
        interestRate = sc.nextInt();
        investment = new Investment(fund, interestRate);

        System.out.println("Tőke: " + investment.getFund());
        System.out.println("Hozam " + days1 + " napra: " + investment.getYield(days1));
        System.out.println("Kivett összeg " + days2 + " nap után: " + investment.close(days2));
        System.out.println("Kivett összeg " + days3 + " nap után: " + investment.close(days3));
    }
}
