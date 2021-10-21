package javaapi;

import java.util.Scanner;

public class UpperMain {

    public static void main(String[] args) {

        Upper upper = new Upper();

        Scanner sc = new Scanner(System.in);

        System.out.println("Kérem a nagybetűssé alakítandó szöveget:");
        System.out.println(upper.toUpperCase(sc.nextLine()));
    }
}
