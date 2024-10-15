package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        Collections.addAll(names, "Albert", "Adrian", "Irene", "Edward", "Alex", "Matt", "Ale");
        List<String> namesWithA = names.stream()
                .filter(name -> name.startsWith("A") && name.length() == 3)
                .toList();

        namesWithA.forEach(System.out::println);
    }
}