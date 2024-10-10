package Fundamentals;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        String[] names = new String[2];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                System.out.println(String.format("Found %d at index %d", arr[i], i));
            }
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter a name: ");
            names[i] = sc.nextLine();
        }

        for (String n: names) {
            System.out.println(n);
        }





    }
}
