package africa.semicolon.Mp3;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static africa.semicolon.Mp3.MusicState.*;

public class MP3Player {

    private boolean isOn;
    private final ArrayList<Music> musicList = new ArrayList<>();
    private Music currentPlayingMusic;
    private MusicState currentMusicState = STOPPED;
    private int volume = 5;
    private int volumeBeforeMute;
    private boolean isMute;
    private final ArrayList<ArrayList<Music>> playlists = new ArrayList<ArrayList<Music>>();
    private ArrayList<Music> currentPlayingPlaylist;
    private SecureRandom secureRandom;

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
        if (isOn) {
            currentPlayingMusic = music;
            currentMusicState = PLAYING;
        }
    }

    public Music getCurrentlyPlayingMusic(){
        return currentPlayingMusic;
    }

    public MusicState getMusicState() {
        return currentMusicState;
    }

    public void pause() {
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
                }
                else if(currentPlayingMusic == musicList.get(musicList.size() - 1)){
                    currentPlayingMusic = musicList.get(0);
                }
                break;
            }
        }
    }

    public void playPreviousTrack() {
        if(isOn){
//            for (int i = 0; i < musicList.size(); i++) {
//                if (musicList.get(i).equals(currentPlayingMusic)){
//                    currentPlayingMusic = musicList.get(i - 1);
//                }
//                else if(currentPlayingMusic == musicList.get(0)){
//                    currentPlayingMusic = musicList.get(musicList.size() - 1);
//                }
//                break;
//            }
            if (isOn) {
                for (int i = 0; i < musicList.size(); i++) {
                    if (musicList.get(i) == currentPlayingMusic) {
                        if (i == 0) {
                            currentPlayingMusic = musicList.get(musicList.size() - 1);
                        } else {
                            currentPlayingMusic = musicList.get(i - 1);
                        }
                        break;
                    }
                }
            }
        }
    }


    public void skipTrack() {
        if(isOn){
            for (int i = 0; i < musicList.size(); i++) {
                if (musicList.get(i).equals(currentPlayingMusic)){
                    currentPlayingMusic = musicList.get(i + 2);
                }
                else if(currentPlayingMusic == musicList.get(musicList.size() - 1)){
                    currentPlayingMusic = musicList.get(1);
                }
                break;
            }
        }
    }

    public void createPlaylist(ArrayList<Music> playlistName) {
        if(isOn){
            playlists.add(playlistName);
        }
    }

    public int getTotalNumberOfPlaylists() {
        return playlists.size();
    }

    public void addMusicToPlaylist(Music musicName, ArrayList<Music> playlist) {
        if(isOn){
            for(ArrayList<Music> songs : playlists){
                if(songs.equals(playlist)){
                    songs.add(musicName);
                }
            }
        }
    }

    public int getNumberOfSongsInPlaylist(ArrayList<Music> playlist) {
        int playlistSong = 0;
        for (int i = 0; i < playlists.size(); i++) {
            if(playlists.get(i) == playlist){
                playlistSong = playlists.get(i).size();
            }
        }
        return playlistSong;
    }

    public void removeMusicFromPlaylist(Music musicName, ArrayList<Music> playlist) {
        if(isOn){
            for(ArrayList<Music> songs : playlists){
                if(songs.equals(playlist)){
                    songs.remove(musicName);
                }
            }
        }
    }

    public void repeatMusic() {
        if(isOn){
            for (int i = 0; i < musicList.size(); i++) {
                currentPlayingMusic = musicList.get(i);
            }
        }
    }

    public void repeatPlaylist() {
        if(isOn){
            for (int i = 0; i < playlists.size(); i++) {
                currentPlayingPlaylist = playlists.get(i);
            }
        }
    }

    public ArrayList<Music> getCurrentlyPlayingPlaylist() {
        return currentPlayingPlaylist;
    }

    public void shuffleSongsInPlaylist() {
        if(isOn){
            for (int i = 0; i < playlists.size(); i++) {
//                currentPlayingPlaylist = secureRandom.nextInt(playlists.size());
                Collections.shuffle(playlists);
            }
        }
    }
}
