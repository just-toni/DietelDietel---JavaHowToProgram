package africa.semicolon.Mp3;

import java.util.ArrayList;

import static africa.semicolon.Mp3.MusicState.*;

public class MP3Player {

    private boolean isOn;
    private final ArrayList<Music> musicList = new ArrayList<>();
    private Music currentPlayingMusic;
    private MusicState currentMusicState = STOPPED;
    private int volume = 5;

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
}
