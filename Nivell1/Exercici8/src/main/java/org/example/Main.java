package org.example;

public class Main {
    public static void main(String[] args) {
        Reverse reverse = (s) -> new StringBuilder(s).reverse().toString();
        String reverseHola = reverse.reverse("Hola");
        System.out.println(reverseHola);
    }
}