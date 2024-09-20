package Fundamentals;

import java.util.Scanner;

public class FirstArgumentEndsWithSecond {

    public boolean firstArgumentEndsWithSecond(String str1, String str2){
        return str1.endsWith(str2);
    }

    public static void main(String[] args){
        FirstArgumentEndsWithSecond obj = new FirstArgumentEndsWithSecond();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.println("Enter second string: ");
        String s2 = sc.nextLine();

        boolean result = obj.firstArgumentEndsWithSecond(s1, s2);

        sc.close();

        System.out.println("First string ends with second string: " + result);
    }
}
