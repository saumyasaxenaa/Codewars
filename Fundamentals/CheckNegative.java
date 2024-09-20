package Fundamentals;

import java.util.Scanner;

public class CheckNegative {

    public int checkNegative(int num) {
        if (num <= 0) {
            return num;
        } else {
            return -num;
        }
    }

    public static void main(String[] args) {
        CheckNegative obj = new CheckNegative();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int result = obj.checkNegative(num);
        System.out.println("Result: " + result);

        sc.close();
    }
}
