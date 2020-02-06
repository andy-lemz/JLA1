package Lesson3;

import java.util.HashMap;
import java.util.Map;

public class UniqWords {
    public static void main(String[] args) {

        String[] arr = new String[10];
        arr[0] = "Vasya";
        arr[1] = "Sasha";
        arr[2] = "Vasya";
        arr[3] = "Dima";
        arr[4] = "Sveta";
        arr[5] = "Sasha";
        arr[6] = "Vasya";
        arr[7] = "Sveta";
        arr[8] = "Dima";
        arr[9] = "Sasha";

        Map<String, Integer> mapCounts = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            String name = arr[i];
            mapCounts.put(name, mapCounts.getOrDefault(name, 0)+1);
        }

        System.out.println(mapCounts);
    }
}
