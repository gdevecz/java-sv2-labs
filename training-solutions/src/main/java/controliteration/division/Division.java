package controliteration.division;

import java.util.Scanner;

public class Division {

    public String baseMultiples(int upperLimit, int  base) {
        int addNumber = base;
        StringBuilder sb = new StringBuilder();

        while(base < upperLimit) {
            sb.append(base).append(", ");
            base += addNumber;
        }
        return sb.substring(0, sb.length()-2);
    }

    public void divisionIO(){
        Scanner sc = new Scanner(System.in);
        int upperLimit;
        int base;
        System.out.println("Adjon meg egy pozitív egész számot! A program ennél kisebb számokat fog kiíírni.");
        upperLimit = sc.nextInt();
        System.out.println("Hánnyal osztható számokat szeretne kapni?");
        base = sc.nextInt();
        System.out.println(baseMultiples(upperLimit, base));
    }
}
