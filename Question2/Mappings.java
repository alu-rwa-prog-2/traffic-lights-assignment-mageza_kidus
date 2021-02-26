//Author: Mageza Shalom
//Cohort: 2
//Week: Three
//Queestion 2: Mapping

import java.util.*;

public class Mappings {

    public static void main(String[] args) {

        // Here I created three maps
        HashMap<Integer, String> hash_map1 = new HashMap<Integer, String>();
        HashMap<Integer, String> hash_map2 = new HashMap<Integer, String>();
        HashMap<Integer, String> hash_map3 = new HashMap<Integer, String>();

        // then I add the items to the map 1
        hash_map1.put(1, "SHALOM");
        hash_map1.put(2, "MAGEZA");
        hash_map1.put(3, "ABAYISENGA");
        System.out.println("\nThe values in the first map are: " + hash_map1);

        // then I add the items to the map 2
        hash_map2.put(4, "PROGRAMMING");
        hash_map2.put(5, "PYTHON");
        hash_map2.put(6, "JAVA");
        System.out.println("\nThe values in the second map are: " + hash_map2);

        // then I add the items to the map 3
        hash_map3.put(7, "FOOD");
        hash_map3.put(8, "FRIES");
        hash_map3.put(9, "COKE");
        System.out.println("\nThe values in the third map are: " + hash_map3);

        // here I put all the map 1 values to the map 2
        hash_map2.putAll(hash_map1);
        System.out.println("\nThe values in second map (Which includes first map): " + hash_map2);

        // here I put all the three maps values to the map 3
        hash_map2.putAll(hash_map3);
        System.out.println("\nThe values in third map (Which includes all the maps): " + hash_map2);
    }

}
