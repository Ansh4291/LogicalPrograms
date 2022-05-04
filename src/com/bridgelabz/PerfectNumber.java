package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int no , sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        no = sc.nextInt();
        for (int i = 1; i < no; i++){
            if (no % i == 0){
                sum = sum + i;

            }
        }
        if (sum == no){
            System.out.println("it is perfect number " + no);
        }
        else {
            System.out.println("its not a perfefct number " + no);
        }
    }
}
