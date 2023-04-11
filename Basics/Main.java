package Basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //output
        // System.out.print("Hello World\n from");
        // System.out.println("Hello World");


        //variables
        // String name = "hi";
        // int age = 20;
        // double gpa = 3.5;
        // char grade = 'A';

        // System.out.println(name);
        // System.out.println(age);
        // System.out.println(gpa);
        // System.out.println(grade); 

        // int a = 10;
        // int b = 3;
        // int sum = a+b;
        // System.out.println(sum);
        // int diff = a-b;
        // System.out.println(diff);

        // Input
        Scanner input = new Scanner(System.in);
        // String name = input.next();
        // System.out.println("Hello " + name);

        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a+b;
        System.out.println("sum"+sum);
    }
}
