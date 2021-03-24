package FirstSetOfTddPractice.AirConditioner;

public class AirConditioner {

    private String name;
    private boolean isOn;
    private int temperature;

    public AirConditioner(boolean isOn) {
        this.isOn = isOn;
        if(isOn == true) {
            temperature = 16;
        }
    }

    public void setProductName(String productName) {
        name = productName;
    }

    public String getProductName() {
        return name;
    }

    public void switchOn(boolean isOn) {
        this.isOn = isOn;
        if(isOn == true) {
            temperature = 16;
        }else
            temperature = 0;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setTemperature(int temperature) {
        if (isOn == true){
            if (temperature >= 16 || temperature <= 30) {
                this.temperature = temperature;
            }
            else {
                System.out.println("Temperature out of range");
            }
        }
        else {
            System.out.println("A.C is off");
        }
    }

    public int getTemperature() {
        return temperature;
    }


    public void setIncreasedTemperature(int temperature) {
        if (isOn == true){
            if (temperature >=16 && temperature < 30) {
                temperature = temperature + 1;
                this.temperature = temperature;
            }
            else {
                System.out.println("Temperature can't increase any further");

            }
        }
        else {
            System.out.println("A.C is off");
        }
    }


    public int getIncreasedTemperature() {
        return temperature;
    }

    public void setDecreasedTemperature(int temperature) {
        if (isOn == true){
            if (temperature > 16) {
                temperature = temperature - 1;
                this.temperature = temperature;
            }
            else {
                System.out.println("Temperature can't decrease any further");

            }
        }
        else {
            System.out.println("A.C is off");
        }
    }

    public int getDecreasedTemperature() {
        return temperature;
    }
}
