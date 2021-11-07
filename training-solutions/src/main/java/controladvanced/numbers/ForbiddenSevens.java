package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevens {

    public boolean isNumberContainsSeven(int number) {
        while (number > 0) {
            if (number % 10 == 7) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
