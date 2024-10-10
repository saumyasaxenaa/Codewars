package Fundamentals;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Watermelon");

        System.out.println("Fruits: " + fruits);

        fruits.add(2, "Orange");

        System.out.println("Fruits: " + fruits);

        fruits.remove(1); // O(n)

        System.out.println("Fruits: " + fruits);

        if (fruits.contains("Orange")) {
            System.out.println("Orange is present in the list");
        } else {
            System.out.println("Orange is not present in the list");
        }

        fruits.clear();

        System.out.println("Fruits: " + fruits);
    }
    // use ArrayList when: Random Access, Memory efficiency, low remove operation

}
