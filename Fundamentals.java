import java.sql.SQLOutput;
import java.util.Scanner;

public class Fundamentals {

    public String evenOrOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public boolean firstArgumentEndsWithSecond(String str1, String str2) {
        return str1.endsWith(str2);
    }

    public static void main(String args[]) {
        Fundamentals f = new Fundamentals();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        String result = f.evenOrOdd(num);
        System.out.println("The number is: " + result);

        sc.close();

        System.out.println(f.firstArgumentEndsWithSecond("Hello", "lo"));

    }
}
