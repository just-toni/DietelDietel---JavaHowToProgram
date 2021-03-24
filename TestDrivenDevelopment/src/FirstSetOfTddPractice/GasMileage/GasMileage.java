package FirstSetOfTddPractice.GasMileage;

public class GasMileage {
    private int numberOfTrips;
    private int milesDriven;
    private int gallonsUsed;
    private double milesPerGallon = 0.0;
    private double sum;

    public void collectNumberOfTrips(int numberOfTrips) {
        int counter = 1;
        while (counter <= numberOfTrips){
//            System.out.println("Enter number of trips");
            counter++;
        }
    }

    public int getNumberOfTrips(){
        return numberOfTrips;
    }

    public void collectMilesDriven(int milesDriven) {
        if(milesDriven > 0){
            this.milesDriven = milesDriven;
        }
    }

    public int getMilesDriven() {
        return milesDriven;
    }

    public void collectGallonsUsed(int gallonsUsed) {
        if(gallonsUsed > 0){
            this.gallonsUsed = gallonsUsed;
        }
    }

    public int getGallonsUsed() {
        return gallonsUsed;
    }

    public void calculateMilesPerGallon(int milesDriven, int gallonsUsed) {
        milesPerGallon = (milesDriven / (gallonsUsed * 1.0));
    }

    public double getMilesPerGallon() {
        return milesPerGallon;
    }

    public void calculateSumOfMilesPerDriven(int milesPerGallon) {
//        sum = milesPerGallon *
    }


}
