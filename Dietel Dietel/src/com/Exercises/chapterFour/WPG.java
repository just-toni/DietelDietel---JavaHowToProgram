package com.Exercises.chapterFour;

public class WPG {
    public static void main(String[] args) {

        int year = 1;
        long population = 7794798739L;
        double growthRate = 1.05/100;

        System.out.println("Year\t\tNewPopulation\t\t\tPopulationIncrement");

        while(year < 76){
            long newPopulation = (long) (population + (growthRate * population));
            long populationIncrement = (newPopulation - population);
            population = newPopulation;
            newPopulation += populationIncrement;
            System.out.println(year + "\t\t\t" + newPopulation + "\t\t\t\t" + populationIncrement);
            year++;
        }
    }
}
