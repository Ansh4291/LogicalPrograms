package com.bridgelabz;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num1 = 0 , num2 = 1;
        int sum =0;
        System.out.println(num1);
        System.out.println(num2);
        for (int i = num1; i < 10; i ++){
            for (int j = num2; j < 10; j ++){
                sum = num1 + num2;
                num1 = num2;
                num2 = sum;
                System.out.println(sum);
            }
        }
    }
}
