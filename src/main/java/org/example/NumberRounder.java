package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class NumberRounder extends ListUtils {
    public static List<Integer> roundNumbers(List<String> list) {
        List<Integer> roundedList = list.stream()
                .map(Double::valueOf) // String zu Double
                .map(Double::intValue) // Double zu int
                .collect(Collectors.toList());
        System.out.println("Gerundete Liste: " + roundedList);
        return roundedList;
    }
}