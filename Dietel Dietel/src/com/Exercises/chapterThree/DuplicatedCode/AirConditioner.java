package com.Exercises.chapterThree.DuplicatedCode;

public class AirConditioner {

    private boolean isOn;
    private String productName;
    private int temperature;

    public AirConditioner(boolean isOn, String productName, int temperature) {
        this.isOn = isOn;
        this.productName = productName;
        this.temperature = temperature;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if (isOn = true){
            if(temperature >= 16 && temperature <= 30){
                this.temperature = temperature;
            } else
                System.out.println("Temperature can't be less than 16 or greater than 30");
        } else
            System.out.println("This air conditioner is off");
    }

    public void decreaseTemperature (){
        if (isOn = true){
            if (temperature > 16){
                temperature = temperature - 1;
            } else
                System.out.println("You can't decrease temperature further");
        }
    }

    public void increaseTemperature (){
        if (isOn = true){
            if (temperature >= 16 && temperature < 30){
                temperature = temperature + 1;
            } else
                System.out.println("You can't increase temperature further");
        }
    }

}
