package AirlineReservationSystem;

import java.util.ArrayList;

public class Airline {

    private final String name;
    private final ArrayList<Plane> aeroplanes = new ArrayList<>();

    public Airline(String name, Plane aeroplane){
        this.name = name;
        aeroplanes.add(aeroplane);
    }

    @Override
    public String toString(){
        return "Airline name: " + name + "\n" +
                "Number of aeroplanes: " + getNumberOfAeroplanes() + "\n" +
                "Names of aeroplanes: " + getNamesOfAeroplanes();
    }

    public String getNamesOfAeroplanes() {
        String namesOfAeroplanes = "";
        for(Plane aeroplaneNames : aeroplanes)
            if (aeroplaneNames != null) {
                namesOfAeroplanes += aeroplaneNames;
            }
        return namesOfAeroplanes;
    }


    public int getNumberOfAeroplanes() {
        int numberOfAeroplanes = 0;
        for (Plane aeroplane : aeroplanes) {
            if (aeroplane != null)
                numberOfAeroplanes++;
        }
        return numberOfAeroplanes;
    }

}
