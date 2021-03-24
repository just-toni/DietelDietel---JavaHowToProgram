package FirstSetOfTddPractice.MP3Player;

public class MP3Player {

    private boolean isOn;
    private boolean isPlay;
    private int currentPlayingTrack;
    private int volume;

    public void isOn(boolean isOn) {
        this.isOn = isOn;
        if (isOn) {
            currentPlayingTrack = 1;
        } else {
            currentPlayingTrack = 0;
        }
    }

    public boolean getOn() {
        return isOn;
    }

    public void isPlay(boolean isPlay) {
        if (isOn) {
            if (isPlay) {
                this.isPlay = isPlay;
            } else {
                System.out.println("MP3Player is paused");
            }
        }
    }

    public boolean getPlay() {
        return isPlay;
    }

    public void setCurrentPlayingTrack(int currentPlayingTrack) {
        if (isOn) {
            if (currentPlayingTrack >= 1 && currentPlayingTrack <= 100) {
                this.currentPlayingTrack = currentPlayingTrack;
            }
            if (currentPlayingTrack < 1 || currentPlayingTrack > 100) {
                System.out.println("Music playlist only ranges from 1 - 100 only");
            }
        }
    }


    public int getCurrentPlayingTrack() {
        return currentPlayingTrack;
    }

    public void setNextTrack() {
        if (isOn) {
            if (currentPlayingTrack >= 1 && currentPlayingTrack < 100) {
                currentPlayingTrack += 1;
            } else {
                currentPlayingTrack = 1;
            }
        }
    }

    public void setPreviousTrack() {
        if (isOn) {
            if (currentPlayingTrack > 1 && currentPlayingTrack <= 100) {
                currentPlayingTrack -= 1;
            } else {
                currentPlayingTrack = 100;
            }
        }
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume) {
        if (isOn) {
            if (volume >= 1 && volume <= 15) {
                this.volume = volume;
            }
            if (volume < 1 || volume > 15) {
                System.out.println("Volume only ranges from 1 - 15 only");
            }
        }
    }

    public void setIncreasedVolume() {
        if (isOn) {
            if (volume >= 1) {
                volume += 1;
            }
        }
    }

    public void setDecreasedVolume() {
        if (isOn) {
            if (volume >= 1) {
                volume -= 1;
            }
            else{
                volume = 0;
            }
        }
    }
}
