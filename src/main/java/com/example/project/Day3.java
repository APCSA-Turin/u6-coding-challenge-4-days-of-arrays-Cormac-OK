package com.example.project;

public class Day3 {
      public static String[][] generateSnowflake(int size) { //you will be tested on this method
        String[][] grid = new String[size][size];

        for (int y = 0; y < size; y++){
          for (int x = 0; x < size; x++){
            grid[y][x] = " ";
          }
        }

        for (int i = 0; i < size; i ++){
          grid[size/2][i] = "*";
        }

        for (int i = 0; i < size; i ++){
          grid[i][size/2] = "*";
        }

        for (int i = 0; i < size; i ++){
          grid[i][i] = "*";
        }

        for (int i = 0; i < size; i ++){
          grid[i][size - i - 1] = "*";
        }

        return grid;
    }

    // Prints the snowflake  will be useful if tests fail (you will not be tested on this method)
    public static void printSnowflake(String[][] snowflake) {
      for (int y = 0; y < snowflake.length; y++){
        for (int x = 0; x < snowflake.length; x++){
          System.out.print(snowflake[y][x]);;
        }
        System.out.println();
      }
    }

    // Test for the snowflake generation
    public static void main(String[] args) {
    }
}
