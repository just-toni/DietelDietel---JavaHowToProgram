package chapterNine;

public class Vehicle {

    public int getNumberOfTyres() {
        return numberOfTyres;
    }

    public void setNumberOfTyres(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }

    private int numberOfTyres;

    public void drive(){
        System.out.println("Driving like a vehicle");
    }

}
