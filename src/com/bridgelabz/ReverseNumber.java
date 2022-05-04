package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int rev = 0 , rem;
        int no = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the reverse number ");
        no = sc.nextInt();;

        while (no != 0){
            rem = no % 10;
            rev = rev * 10 + rem;
            no = no / 10;
        }
        System.out.println(rev);
    }
}
