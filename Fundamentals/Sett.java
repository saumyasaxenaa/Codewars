package Fundamentals;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sett {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(1);

        System.out.println(set);

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
    }
}
