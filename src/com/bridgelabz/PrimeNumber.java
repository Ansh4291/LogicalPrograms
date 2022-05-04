package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int no = 0;
        int temp =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        no = sc.nextInt();
        for (int i = 2; i < no-1; i++){
           if (no % i == 0 ) {
               temp = temp+i;
           }
        }
        if (temp == 0){
            System.out.println("no is prime " + no);
        }else {
            System.out.println("no is not a prime " + no);
        }
    }
}
