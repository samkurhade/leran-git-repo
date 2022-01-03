package com.company;

import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {

//        int [] arr1;
//        arr1 = new int[n];
//         // or
//        int [] arr2 = new int [n];

//        int[] marks;
//        marks = new int[5];

        int[] marks = new int[5];
        marks[0] = 82;
        marks[1] = 75;
        marks[2] = 91;
        marks[3] = 85;
        marks[4] = 78;
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);
        for (int i = 0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }
        int [] age = {12,23,34,45,56};
        System.out.println(age[1]);
        age[1] = 24;
        System.out.println(age[1]);

        System.out.println("By for loop");
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);

        }
        // Average marks of students
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of students");
        int n = sc.nextInt();

        System.out.println("Enters marks now");
        int [] marks2 = new int[n];
        for (int i = 0; i < n ; i++) {
            marks2[i] = sc.nextInt();
        }
        int avg = 0;
        for (int i = 0; i < n ; i++) {
            avg += marks2[i];
        }
        avg /= n;
        System.out.println("Average marks are "+ avg);

        System.out.println("in dev branch");
        System.out.println("New change in dev branch");
    }
}
