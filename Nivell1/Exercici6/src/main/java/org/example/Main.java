package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();

        Collections.addAll(list, "Hello", 434, "Goodbye", 5, 32, "Thesis");

        List<Object> sortedList = list.stream()
                .sorted((o1, o2 )-> String.valueOf(o1).length() - String.valueOf(o2).length())
                .collect(Collectors.toList());

        sortedList.forEach(System.out::println);
    }
}