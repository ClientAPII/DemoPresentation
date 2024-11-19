package de.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListUtils {

    public static List<String> readListFromFile(String filePath) {
        try {
            return Files.lines(Paths.get(filePath))
                    .map(String::trim) // Entfern Leerzeichen
                    .collect(Collectors.toList());
        } catch (IOException e) {
            System.err.println("Error reading file: " + filePath);
            e.printStackTrace();
            return Arrays.asList();
        }
    }

    // Originale Liste
    public static <T> void printList(List<T> list) {
        System.out.println("Originale List: " + list);
    }
}