package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Collections.addAll(list, "Bonjour", "Hello", "你好", "안녕하세요", "Ole");

        List<String> result = new ArrayList<>();
        result = filterStringsWithO(list);
        System.out.println(result);
    }


    public static List<String> filterStringsWithO(List<String> list){
        return list.stream()
                .filter(word -> word.contains("o") && word.length() > 4)
                .collect(Collectors.toList());
    }
}