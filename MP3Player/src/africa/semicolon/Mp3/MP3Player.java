package africa.semicolon.Mp3;

import java.util.ArrayList;

import static africa.semicolon.Mp3.MusicState.*;

public class MP3Player {

    private boolean isOn;
    private final ArrayList<Music> musicList = new ArrayList<>();
    private Music currentPlayingMusic;
    private MusicState currentMusicState = STOPPED;
    private int volume = 5;
    private int volumeBeforeMute;
    private boolean isMute;

    public boolean isOn() {
        return isOn;
    }

    public void flipPowerButtons() {
        if (isOn) isOn = false; else isOn = true;
    }

    public void download(Music music) {
        if (isOn)
            if(!musicList.contains(music))
                musicList.add(music);
    }

    public int getTotalNumberOfMusic() {
        return musicList.size();
    }

    public void delete(Music music2) {
        if(isOn) if(getTotalNumberOfMusic() > 0) musicList.remove(music2);
    }

    public void play(Music music) {
        currentPlayingMusic = music;
        currentMusicState = PLAYING;
    }

    public Music getCurrentlyPlayingMusic(){
        return currentPlayingMusic;
    }

    public MusicState getMusicState() {
        return currentMusicState;
    }

    public void pause() {
//        currentPlayingMusic = music2;
        currentMusicState = PAUSED;
    }

    public void flipPlayAndPauseButtons() {
        if(isOn){
            if(currentMusicState == PLAYING){
                currentMusicState = PAUSED;
            }
            else if (currentMusicState == PAUSED) {
                currentMusicState = PLAYING;
            }
        }
        else
            currentMusicState = STOPPED;
    }

    public void stop() {
        currentMusicState = STOPPED;
    }

    public void setVolume() {
        if(isOn){
            if(volume > 0 && volume <= 15)
                this.volume = volume;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if(isOn){
            if(volume > 0 && volume < 15){
                volume++;
            }
        }
    }

    public void decreaseVolume() {
        if(isOn){
            if(volume < 15 && volume >= 1){
                volume--;
            }
        }
    }

    public void muteAndUnmuteButton() {
        if (isOn){
            if(!isMute) {
                volumeBeforeMute = volume;
                volume = 0;
                isMute = true;
            }
            else {
                volume = volumeBeforeMute;
                isMute = false;
            }
        }
    }

    public boolean isMute() {
        return isMute;
    }


    public void playNextTrack() {
        if(isOn){
            for (int i = 0; i < musicList.size(); i++) {
                if (musicList.get(i).equals(currentPlayingMusic)){
                    currentPlayingMusic = musicList.get(i + 1);
                    break;
                }
            }
        }
    }
}
