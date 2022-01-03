package com.company;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
//        // For Loop
//        // for loop to print sum of the numbers from 0 to 10
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
////            System.out.print(" "+i+" ");
//            sum+=i;
//        }
//        System.out.println(sum);
//
//        // to print even numbers between 0 to 100
//        for (int i = 0; i <= 100 ; i +=2 )
//        {
//            System.out.println(i);
//        }
//
//        // Sum of the numbers from 1 to n
//        int n = 100;
//        int sum1= 0;
//        for (int i = 1; i < n  ; i++) {
//            sum1 = sum1 + i;
//        }
//        System.out.println(sum1);
//
//        // printing numbers in reverse
//        for (int i = 100; i > 0; i--) {
//            System.out.println(i);
//
//        }
//
//        // table of 5
//        int tableOf = 5;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("5 * "+i+" = "+(tableOf*i));
//        }
//
//        // Factorial of number
//        int fact = 5;
//        int result = 1;
//        for (int i = fact ; i >0 ; i--)
//        {
//            result = result * i;
//        }
//        System.out.println(result);
//
//        // fibonacci numbers
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number up to which you want to print fibonacci number series ");
//        int n1 = sc.nextInt();
//        int a = 0;
//        int b = 1;
//        System.out.print(a+" ");
//        System.out.print(b+" ");
//        for (int i = 0; i < n1 - 2 ; i++) {
//            int c = a + b;
//            System.out.print(c+" ");
//            a = b;
//            b = c;
//        }
//
//        // to print a raise to the power b
//        int a1 = sc.nextInt();
//        int b1 = sc.nextInt();
//        int result1 = 1;
//
//        for (int i = 0 ; i < b1 ; i++)
//        {
//            result1 *= a1;
//        }
//        System.out.println(result1);

        // Prime number or not

        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean isPrime = true;
//        for (int i = 2 ; i < n ; i++)
//        {
//            if(n % i == 0)
//            {
//                isPrime = false;
//                break;
//            }
//        }
//        if (n < 2)
//        {
//            isPrime = false;
//        }
//        System.out.println("isPrime "+ isPrime);

        // more optimized solution
//        for (int i = 2 ; i * i  <=  n ; i++)
//        {
//            if(n % i == 0)
//            {
//                isPrime = false;
//                break;
//            }
//        }
//        if (n < 2)
//        {
//            isPrime = false;
//        }
//        System.out.println("isPrime "+ isPrime);

//        // Series sum
//        int n1 = sc.nextInt();
//        float res = 0;
//        for (float i = 1; i <= n1 ; i++) {
//            res += 1/i;
//        }
//        System.out.println(res);

        int n2 = sc.nextInt();
        float res1 = 0;
        for (float i = 1; i <= n2 ; i++) {
            if (i%2 == 0)  res1 -= 1/i;
            else res1 += 1/i;
        }
        System.out.println(res1);

//        Added while loop
    }
}
