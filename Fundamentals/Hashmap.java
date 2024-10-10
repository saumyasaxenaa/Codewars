package Fundamentals;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Hashmap {

    public static void main(String[] args) {

        HashMap<String, Integer> populationByCity = new HashMap<>();

        populationByCity.put("New York", 8623000);
        populationByCity.put("Los Angeles", 3990456);
        populationByCity.put("Chicago", 2716000);

        Integer population = populationByCity.get("New York");

        System.out.println("Population of New York: " + population);

        populationByCity.keySet();
        populationByCity.values();
        populationByCity.entrySet();

        LinkedHashMap<String, Integer> populationByCity1 = new LinkedHashMap<>();
    }
}
