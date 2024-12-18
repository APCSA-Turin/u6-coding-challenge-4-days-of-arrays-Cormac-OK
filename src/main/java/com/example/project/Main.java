package com.example.project;

public class Main{
    public static void main(String[] args) {

        String[] names = {"John", "Matt", "Lucy", "Nina", "Roxy", "Andrew", "Henry", "Donnie", "Sasha", "Mohammad", "Elsa", "Ruby"};
        String[][] result = Day2.nameSort(names);

        System.err.println("\nNice:\n");
        for (int i = 0; i < result[0].length; i++){
            System.out.println(result[0][i]);
        }
        System.err.println("\nNaughty:\n");
        for (int i = 0; i < result[1].length; i++){
            System.out.println(result[1][i]);
        }
    }
}