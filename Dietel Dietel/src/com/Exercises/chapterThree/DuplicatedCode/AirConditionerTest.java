package com.Exercises.chapterThree.DuplicatedCode;

public class AirConditionerTest {
    public static void main(String[] args) {
        AirConditioner remote1 = new AirConditioner(false, "", 16);

        remote1.setOn(true);
        remote1.setProductName("Panasonic");
        remote1.setTemperature(16);

        System.out.println("The name of the air conditioner is " + remote1.getProductName());
        System.out.println("The air conditioner is turned on " + remote1.isOn());
        System.out.println("The temperature of the air conditioner is " + remote1.getTemperature());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        AirConditioner remote2 = new AirConditioner(true, "", 16);

        remote2.setOn(false);
        remote2.setProductName("KenStar");
        remote2.setTemperature(9);
        remote2.decreaseTemperature();
        remote2.increaseTemperature();

        System.out.println("The name of the air conditioner is " + remote2.getProductName());
        System.out.println("The air conditioner is turned on " + remote2.isOn());
        System.out.println("The temperature of the air conditioner is " + remote2.getTemperature());
//        System.out.println("The temperature of air conditioner was increased to " + remote2.increaseTemperature());

    }

}
