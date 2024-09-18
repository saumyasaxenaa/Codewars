import java.util.Scanner;

public class Fundamentals {

    public String evenOrOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String args[]) {
        Fundamentals f = new Fundamentals();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        String result = f.evenOrOdd(num);
        System.out.println("The number is: " + result);

        sc.close();

    }
}
