/*
Question : Write a java program to print factorial of n by using recursion.
 */

import java.util.Scanner;

public class Main {
    static int PrintFactorial(int number){
        if (number == 0) return 1;
        return number * PrintFactorial(number - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for finding the factorial :");
        int number = sc.nextInt();
        System.out.println("Printing the result :");
        System.out.println(PrintFactorial(number));
    }
}