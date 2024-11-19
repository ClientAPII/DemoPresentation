package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class ListCleaner extends ListUtils {
    public static List<String> cleanList(List<String> list) {
        List<String> cleanedList = list.stream().distinct().collect(Collectors.toList());
        System.out.println("Bereinigte Liste: " + cleanedList);
        System.out.println("Entfernte doppelte Einträge: " + (list.size() - cleanedList.size()));
        return cleanedList;
    }
}