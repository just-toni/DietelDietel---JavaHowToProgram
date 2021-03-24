package FirstSetOfTddPractice.WPG;

public class WPG {

    private int year = 1;
    private double population = 7794798739L;
    private double populationIncrement;


    public void setYear(int year) {
        while(year < 76){
            System.out.println(year);
            ++year;
        }
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void calculatePopulationOfFirstYear(double population) {
        double growthRate = 1.05/100;
        double populationIncrement = population * growthRate;
        population = (population + populationIncrement);
    }


//    public void calculatePopulation(double population) {
//        int counter = 1;
//
//        while (counter <= year){
//            double growthRate = 1.05/100;
//            double populationIncrement = population * growthRate;
//            population = (population + populationIncrement);
//            System.out.println(population);
//            counter++;
//        }
//    }

    public double getPopulation() {
        return population;
    }

    public void calculatePopulationIncrement(double growthRate) {
        growthRate = 1.05/100;
        double populationIncrement = population * growthRate;
        this.populationIncrement = populationIncrement;
    }

    public double getPopulationIncrement() {
        return populationIncrement;
    }
}
