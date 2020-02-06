package Lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, List<String>> entry = new HashMap<>();

    public void add(String lastname, String telephone){
        List<String> telephones = new ArrayList<>();
        if (entry.containsKey(lastname)){
            telephones = entry.get(lastname);
            telephones.add(telephone);
        } else {
            telephones.add(telephone);
            entry.put(lastname, telephones);
        }
    }

    public String get(String lastname) {
        List<String> telephones = entry.get(lastname);
        return telephones.toString();
    }
}

