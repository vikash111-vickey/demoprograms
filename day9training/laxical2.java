package day9training;

import java.util.*;

public class laxical2 {

    public static void main(String[] args) {

        String[] names = {
            "97317434",
            "955336935",
            "545425545",
            "975137648",
            "65972558",
            "1264784678"
        };

        String search = "17";

        ArrayList<String> result = new ArrayList<>();

        for (String name : names) {

            if (name.contains(search)) {
                result.add(name);
            }
        }

        System.out.println("Search results:");

        for (String name : result) {
            System.out.println(name);
        }
    }
}
