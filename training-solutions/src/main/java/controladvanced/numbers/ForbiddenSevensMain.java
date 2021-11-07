package controladvanced.numbers;

import java.util.Scanner;

public class ForbiddenSevensMain {

    public static void main(String[] args) {
        ForbiddenSevens forbiddenSevens = new ForbiddenSevens();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        while(!forbiddenSevens.isNumberContainsSeven(number) || number%7==0) {
            if(number%7==0){
                System.out.println("X");
            } else {
                System.out.println(number);
            }
            number++;
        }


    }
}
