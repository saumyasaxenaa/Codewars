package Fundamentals;

import java.util.Scanner;

public class EvenOrOdd {

    public String evenOrOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    public static void main(String args[]) {
        EvenOrOdd obj = new EvenOrOdd();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        String result = obj.evenOrOdd(num);
        System.out.println(num + " is: " + result);

        sc.close();
    }
}
