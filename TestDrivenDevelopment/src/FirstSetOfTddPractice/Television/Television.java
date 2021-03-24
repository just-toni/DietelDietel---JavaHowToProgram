package FirstSetOfTddPractice.Television;

public class Television {

    private String tvName;
    private boolean isOn;
    private int channel;
    private int volume;

    public Television(String tvName) {
        this.tvName = tvName;
    }

    public String getTvName() {
        return tvName;
    }

    public void changeTvName(String newName) {
        tvName = newName;
    }

    public void isOn(boolean isOn) {
        this.isOn = isOn;
        if (isOn == true) {
            channel = 1;
            volume = 1;
        } else
            channel = 0;
            volume = 0;
    }

    public boolean getOn() {
        return isOn;
    }

    public int getChannel(){
        return channel;
    }


    public void setChannel(int channel) {
        if (isOn == true) {
            if (channel >= 1 && channel <= 20) {
                this.channel = channel;
            }
            else {
                System.out.println("The number of channels ranges from 1 - 20 only");
            }
        }
         else {
            System.out.println("Tv is off");
        }
    }

    public void setNextChannel () {
        if (isOn == true) {
            if (channel >= 1 && channel < 20) {
                channel = channel + 1;
            }
            else {
                channel = 1;
            }
        }
    }

    public void setPreviousChannel () {
        if (isOn == true) {
            if (channel > 1 && channel <= 20) {
                channel = channel - 1;
            }
            else {
                channel = 20;
            }
        }

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (isOn == true) {
            if (volume >= 1 && volume <= 100) {
                this.volume = volume;
            }
            else{
                System.out.println("The volume number ranges from 1 - 100 only");
            }
        }
        else{
            System.out.println("Tv is off");
        }

    }


    public void setIncreasedVolume() {
        if (isOn == true) {
            if (volume >= 1 && volume < 100) {
                volume = volume + 1;
            }
        }
    }

    public void setDecreasedVolume() {
        if (isOn == true) {
            if (volume >= 1) {
                volume -= 1;
            }
            else {
                volume = 0;
            }
        }
    }
}

