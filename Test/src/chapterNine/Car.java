package chapterNine;

public class Car extends Vehicle{

    @Override
    public void drive(){
        System.out.println("Drive like car");
    }

    public void parentDrive(){
        super.drive();
    }
}
