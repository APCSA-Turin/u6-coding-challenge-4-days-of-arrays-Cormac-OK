package com.example.project;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute

        private String name;
        private int distanceTraveled = 0;
        private int speed;

        private int runDuration;
        private int runLeft;

        private int restDuration;
        private int restLeft;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed;
            this.runDuration = runDuration;
            runLeft = runDuration;
            this.restDuration = restDuration;
            restLeft = restDuration;
        }

        public int getDistanceTraveled(){ // this method is required
            return distanceTraveled;
        }
        

        public void simulateSecond(){ //this method is required but not tested
            if (runLeft > 0){
                distanceTraveled += speed;
                runLeft --;
            }
            else if (restLeft > 0){
                restLeft --;
                if (restLeft == 0){
                    runLeft = runDuration;
                    restLeft = restDuration;
                }
            }
        }

        public String getName(){
            return name;
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        for (int t = 0; t < time; t++){
            for (int i = 0; i < reindeers.length; i ++){
                reindeers[i].simulateSecond();
            }
        }

        int max = -1;
        int bestIndex = -1;

        for (int i = 0; i < reindeers.length; i ++){
            if (reindeers[i].distanceTraveled > max){
                max = reindeers[i].distanceTraveled;
                bestIndex = i;
            }
        }

        return reindeers[bestIndex].name;
    }

    
    public static void main(String[] args) { // for testing purposed
        Reindeer[] reindeer = new Reindeer[reindeer_names.length];
        for (int i = 0; i < reindeer.length; i ++){
            reindeer[i] = new Reindeer(reindeer_names[i], (int)(Math.random() * 5 + 1), (int)(Math.random() * 5 + 1), (int)(Math.random() * 5 + 1));
        }

        System.out.println(simulateRace(10, reindeer));

    }

    

 
}



