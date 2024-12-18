
package com.example.project;

public class Day2{
    public static String[][] nameSort(String[] names){ // your will be tested on this method
        Boolean[] areNice = new Boolean[names.length];
        for (int i = 0; i < areNice.length; i ++){
            if ((int)(Math.random()*2) == 0){
                areNice[i] = true;
            }
            else{
                areNice[i] = false;
            }
        }

        int niceCount = 0;
        for (int i = 0; i < areNice.length; i ++){
            if (areNice[i]){
                niceCount ++;
            }
        }

        String[][] lists = {new String[niceCount], new String[names.length - niceCount]};
        
        int niceIndex = 0;
        int naughtyIndex = 0;

        for (int i = 0; i < names.length; i++){
            if (areNice[i]){
                lists[0][niceIndex] = names[i];
                niceIndex ++;
            }
            else{
                lists[1][naughtyIndex] = names[i];
                naughtyIndex ++;
            }
        }

        return lists; //you must return a two dimensional string array
    }

    public static void main(String[] args) {

    }
}