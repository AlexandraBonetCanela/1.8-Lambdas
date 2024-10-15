package org.example;

public class Main {
    public static void main(String[] args) {

        FunctionalInterface functionalInterface = () ->  3.1415;
        System.out.println(functionalInterface.getPiValue());
    }
}