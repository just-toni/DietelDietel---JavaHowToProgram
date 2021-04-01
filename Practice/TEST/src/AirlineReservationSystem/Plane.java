package AirlineReservationSystem;

public class Plane {

    private final String name;
    private final String modelType;

    public Plane(String name, String engineNumber){
        this.name = name;
        this.modelType = engineNumber;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\n" +
                "Engine number: " + modelType;
    }

}
