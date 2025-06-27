package Hashmap;

import java.util.HashMap;

public class InbulitHashmap {

    public static void main(String[] args) {
        HashMap<String ,Integer> map = new HashMap<>();
        // insert
        map.put("Indai" , 100);
        map.put("Nepal" ,3);
        map.put("Bhutan" ,1);
        map.put("USA" , 30);
        System.out.println(map);

        // get key
        int population = map.get("Indai");
        System.out.println(population);

        // contain key or not contain
        System.out.println(map.containsKey("nepal"));
        System.out.println(map.containsKey("hero"));

        // remove
        System.out.println(map.remove("USA"));

    }
}
