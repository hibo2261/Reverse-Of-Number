package com.Bridgelabz ;
import java.util.Scanner ;

public class ReverseOfNumber {
    public static void main(String[] args) {
        System.out.println("********************************************");
        System.out.println(" Welcome to Reverse Of Number...");
        System.out.println("********************************************");

        System.out.println(" Please Enter A Number = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem , rev = 0;

        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        System.out.println("Reverse Number Is = "+rev);
    }

}

