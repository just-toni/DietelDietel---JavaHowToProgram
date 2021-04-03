package africa.semicolon.Mp3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static africa.semicolon.Mp3.MusicState.*;
import static org.junit.jupiter.api.Assertions.*;

public class MP3PlayerTest {
    MP3Player myMp3Player;

    @BeforeEach
    void setUp() {
        myMp3Player = new MP3Player();
    }

    @AfterEach
    void tearDown() {
        myMp3Player = null;
    }

    @Test
    void mp3Player_canBeCreated() {
        MP3Player myMp3Player = new MP3Player();
        assertNotNull(myMp3Player);
    }

    @Test
    void mp3Player_turnOn_whenFLipPowerButtonIsPressed_onOffState() {
        MP3Player myMp3Player = new MP3Player();
        boolean isOff = !myMp3Player.isOn();
        assertTrue(isOff);
        myMp3Player.flipPowerButtons();
        assertTrue(myMp3Player.isOn());
    }

    @Test
    void mp3Player_turnOff_whenFLipPowerButtonIsPressed_onOffState() {
        MP3Player myMp3Player = new MP3Player();
        myMp3Player.flipPowerButtons();
        boolean isOn = myMp3Player.isOn();
        assertTrue(isOn);
        myMp3Player.flipPowerButtons();
        assertFalse(myMp3Player.isOn());
    }

    @Test
    void mp3Player_canDownloadMusic() {
        myMp3Player.flipPowerButtons();
        assertTrue(myMp3Player.isOn());
        Music music = new Music();
        assertNotNull(music);

        myMp3Player.download(music);
        assertEquals(1, myMp3Player.getTotalNumberOfMusic());
        Music music2 = new Music();
        myMp3Player.download(music2);
        assertEquals(2, myMp3Player.getTotalNumberOfMusic());
    }

    @Test
    void mp3Player_cantDownloadMusic_whenPlayerIsOff() {
        assertFalse(myMp3Player.isOn());
        Music music = new Music();
        assertNotNull(music);
        myMp3Player.download(music);
        assertEquals(0, myMp3Player.getTotalNumberOfMusic());
        Music music2 = new Music();
        myMp3Player.download(music2);
        assertEquals(0, myMp3Player.getTotalNumberOfMusic());
    }

    @Test
    void mp3Player_canDeleteDownloadedMusic() {
        myMp3Player.flipPowerButtons();
        assertTrue(myMp3Player.isOn());

        Music music = new Music();
        Music music2 = new Music();
        Music music3 = new Music();
        myMp3Player.download(music);
        myMp3Player.download(music2);
        myMp3Player.download(music3);
        assertEquals(3, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.delete(music2);
        assertEquals(2, myMp3Player.getTotalNumberOfMusic());
    }

    @Test
    void mp3Player_cantDelete_whenMusicIsEmpty() {
        myMp3Player.flipPowerButtons();
        assertTrue(myMp3Player.isOn());

        Music music = new Music();
        Music music2 = new Music();
        myMp3Player.download(music);
        myMp3Player.download(music2);
        assertEquals(2, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.delete(music);
        assertEquals(1, myMp3Player.getTotalNumberOfMusic());
        myMp3Player.delete(music2);
        assertEquals(0, myMp3Player.getTotalNumberOfMusic());
        myMp3Player.delete(music);
        assertEquals(0, myMp3Player.getTotalNumberOfMusic());
    }

    @Test
    void mp3Player_cantDeleteDownloadedMusic_whenPlayerIsOff() {
        myMp3Player.flipPowerButtons();
        Music music = new Music();
        Music music2 = new Music();
        Music music3 = new Music();
        myMp3Player.download(music);
        myMp3Player.download(music2);
        myMp3Player.download(music3);
        assertEquals(3, myMp3Player.getTotalNumberOfMusic());
        myMp3Player.flipPowerButtons();
        assertFalse(myMp3Player.isOn());
        myMp3Player.delete(music2);
        myMp3Player.delete(music3);
        assertEquals(3, myMp3Player.getTotalNumberOfMusic());
    }

    @Test
    void mp3Player_cantDownloadSameSongTwice() {
        myMp3Player.flipPowerButtons();
        Music music = new Music();
        myMp3Player.download(music);
        assertEquals(1, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.download(music);
        assertEquals(1, myMp3Player.getTotalNumberOfMusic());
    }

    @Test
    void mp3Player_canPlayMusic() {
        myMp3Player.flipPowerButtons();
        Music music = new Music();
        myMp3Player.download(music);
        assertEquals(1, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.play(music);
        assertEquals(PLAYING, myMp3Player.getMusicState());
        assertEquals(music, myMp3Player.getCurrentlyPlayingMusic());
    }

    @Test
    void mp3Player_canPauseMusic() {
        myMp3Player.flipPowerButtons();
        Music music2 = new Music();
        myMp3Player.download(music2);
        assertEquals(1, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.play(music2);
        myMp3Player.pause();
        assertEquals(PAUSED, myMp3Player.getMusicState());
        assertEquals(music2, myMp3Player.getCurrentlyPlayingMusic());
    }

    @Test
    void mp3Player_canStopMusic() {
        myMp3Player.flipPowerButtons();
        Music music2 = new Music();
        myMp3Player.download(music2);
        assertEquals(1, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.play(music2);
        myMp3Player.stop();
        assertEquals(STOPPED, myMp3Player.getMusicState());
        assertEquals(music2, myMp3Player.getCurrentlyPlayingMusic());
    }

    @Test
    void mp3Player_cantPlayMusicWhenPlayerIsOff() {
        assertFalse(myMp3Player.isOn());
        Music music = new Music();
        myMp3Player.download(music);
        assertEquals(0, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.play(music);
        assertEquals(STOPPED, myMp3Player.getMusicState());
        assertEquals(null, myMp3Player.getCurrentlyPlayingMusic());
    }

    @Test
    void mp3Player_cantPauseMusicPlayerIsOff() {
        assertFalse(myMp3Player.isOn());
        Music music2 = new Music();
        myMp3Player.download(music2);
        assertEquals(0, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.play(music2);
        assertEquals(STOPPED, myMp3Player.getMusicState());
        myMp3Player.pause();
        assertEquals(PAUSED, myMp3Player.getMusicState());
        assertEquals(null, myMp3Player.getCurrentlyPlayingMusic());
    }

    @Test
    void mp3Player_cantStopMusicWhenPlayerIsOff() {
        assertFalse(myMp3Player.isOn());
        Music music2 = new Music();
        myMp3Player.download(music2);
        assertEquals(0, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.stop();
        assertEquals(STOPPED, myMp3Player.getMusicState());
        assertNotEquals(music2, myMp3Player.getCurrentlyPlayingMusic());
    }

    @Test
    void mp3Player_canPlayOrPauseMusicWhenPlayerIsOn(){
        myMp3Player.flipPowerButtons();
        Music music = new Music();
        myMp3Player.download(music);
        assertEquals(1, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.pause();
        assertEquals(PAUSED,myMp3Player.getMusicState());
        myMp3Player.flipPlayAndPauseButtons();
        assertEquals(PLAYING,myMp3Player.getMusicState());

        myMp3Player.play(music);
        assertEquals(PLAYING,myMp3Player.getMusicState());
        myMp3Player.flipPlayAndPauseButtons();
        assertEquals(PAUSED,myMp3Player.getMusicState());
    }

    @Test
    void mp3Player_cantPlayOrPauseMusicWhenPlayerIsOff(){
        assertFalse(myMp3Player.isOn());
        Music music = new Music();
        myMp3Player.download(music);
        assertEquals(0, myMp3Player.getTotalNumberOfMusic());

//        myMp3Player.pause();
//        assertEquals(STOPPED,myMp3Player.getMusicState());
//        myMp3Player.flipPlayAndPauseButtons();
//        assertEquals(STOPPED,myMp3Player.getMusicState());

        myMp3Player.play(music);
        assertEquals(STOPPED,myMp3Player.getMusicState());
        myMp3Player.flipPlayAndPauseButtons();
        assertEquals(STOPPED,myMp3Player.getMusicState());
    }

    @Test
    void mp3Player_canSetVolume(){
     myMp3Player.flipPowerButtons();
     Music music = new Music();
     myMp3Player.download(music);
     assertEquals(1, myMp3Player.getTotalNumberOfMusic());

     myMp3Player.setVolume();
     assertEquals(5, myMp3Player.getVolume());
    }

    @Test
    void mp3Player_cantSetVolumeWhenPlayerIsOff(){
        assertFalse(myMp3Player.isOn());
        Music music = new Music();
        myMp3Player.download(music);
        assertEquals(0, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.setVolume();
        assertEquals(5, myMp3Player.getVolume());
    }

    @Test
    void mp3Player_canIncreaseVolume(){
        myMp3Player.flipPowerButtons();
        Music music = new Music();
        myMp3Player.download(music);
        assertEquals(1, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.increaseVolume();
        assertEquals(6, myMp3Player.getVolume());
    }

    @Test
    void mp3Player_cantIncreaseVolumeWhenPlayerIsOff(){
        assertFalse(myMp3Player.isOn());
        Music music = new Music();
        myMp3Player.download(music);
        assertEquals(0, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.increaseVolume();
        assertEquals(5, myMp3Player.getVolume());
    }

    @Test
    void mp3Player_cantIncreaseVolumeMoreThanFifteen(){
        myMp3Player.flipPowerButtons();
        Music music = new Music();
        myMp3Player.download(music);
        assertEquals(1, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.increaseVolume();
        myMp3Player.increaseVolume();
        myMp3Player.increaseVolume();
        myMp3Player.increaseVolume();
        myMp3Player.increaseVolume();
        myMp3Player.increaseVolume();
        myMp3Player.increaseVolume();
        myMp3Player.increaseVolume();
        myMp3Player.increaseVolume();
        myMp3Player.increaseVolume();
        myMp3Player.increaseVolume();
        assertEquals(15, myMp3Player.getVolume());
    }



    @Test
    void mp3Player_canDecreaseVolume(){
        myMp3Player.flipPowerButtons();
        Music music = new Music();
        myMp3Player.download(music);
        assertEquals(1, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.decreaseVolume();
        assertEquals(4, myMp3Player.getVolume());
    }

    @Test
    void mp3Player_cantDecreaseVolumeWhenPlayerIsOff(){
        assertFalse(myMp3Player.isOn());
        Music music = new Music();
        myMp3Player.download(music);
        assertEquals(0, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.decreaseVolume();
        assertEquals(5, myMp3Player.getVolume());
    }

    @Test
    void mp3Player_cantDecreaseVolumeLessThanZero(){
        myMp3Player.flipPowerButtons();
        Music music = new Music();
        myMp3Player.download(music);
        assertEquals(1, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.decreaseVolume();
        myMp3Player.decreaseVolume();
        myMp3Player.decreaseVolume();
        myMp3Player.decreaseVolume();
        myMp3Player.decreaseVolume();
        myMp3Player.decreaseVolume();
        assertEquals(0, myMp3Player.getVolume());
    }

    @Test
    void mp3Player_canMuteAndUnmuteMusic(){
        myMp3Player.flipPowerButtons();
        Music music = new Music();
        myMp3Player.download(music);
        assertEquals(1, myMp3Player.getTotalNumberOfMusic());
        myMp3Player.play(music);
        assertEquals(PLAYING, myMp3Player.getMusicState());
        assertEquals(5, myMp3Player.getVolume());

        myMp3Player.muteAndUnmuteButton();
        assertEquals(0, myMp3Player.getVolume());
        assertTrue(myMp3Player.isMute());
        myMp3Player.muteAndUnmuteButton();
        assertEquals(5,myMp3Player.getVolume());
        assertFalse(myMp3Player.isMute());
    }

    @Test
    void mp3Player_cantMuteAndUnmuteMusicWhenPlayerIsOff(){
        assertFalse(myMp3Player.isOn());
        Music music = new Music();
        myMp3Player.download(music);
        assertEquals(0, myMp3Player.getTotalNumberOfMusic());
        myMp3Player.play(music);
        assertEquals(STOPPED, myMp3Player.getMusicState());
        assertEquals(5, myMp3Player.getVolume());

        myMp3Player.muteAndUnmuteButton();
        assertEquals(5, myMp3Player.getVolume());
        assertFalse(myMp3Player.isMute());
        myMp3Player.muteAndUnmuteButton();
        assertEquals(5,myMp3Player.getVolume());
        assertFalse(myMp3Player.isMute());
    }

    @Test
    void mp3Player_canPlayNextTrack(){
        myMp3Player.flipPowerButtons();
        Music music = new Music();
        myMp3Player.download(music);
        Music music2 = new Music();
        myMp3Player.download(music2);
        assertEquals(2, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.play(music);
        assertEquals(PLAYING, myMp3Player.getMusicState());
        assertEquals(music, myMp3Player.getCurrentlyPlayingMusic());
        myMp3Player.playNextTrack();
        assertEquals(music2, myMp3Player.getCurrentlyPlayingMusic());
        myMp3Player.playNextTrack();
        assertEquals(music, myMp3Player.getCurrentlyPlayingMusic());
    }

    @Test
    void mp3Player_cantPlayNextTrackWhenPlayerIsOff(){
        assertFalse(myMp3Player.isOn());
        Music music = new Music();
        myMp3Player.download(music);
        Music music2 = new Music();
        myMp3Player.download(music2);
        assertEquals(0, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.play(music);
        assertEquals(STOPPED, myMp3Player.getMusicState());
        assertEquals(null, myMp3Player.getCurrentlyPlayingMusic());
        myMp3Player.playNextTrack();
        assertEquals(null, myMp3Player.getCurrentlyPlayingMusic());
    }

    @Test
    void mp3Player_canPlayPreviousTrack(){
        myMp3Player.flipPowerButtons();
        Music music = new Music();
        myMp3Player.download(music);
        Music music2 = new Music();
        myMp3Player.download(music2);
        Music music3 = new Music();
        myMp3Player.download(music3);
        assertEquals(3, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.play(music3);
        assertEquals(PLAYING, myMp3Player.getMusicState());
        assertEquals(music3, myMp3Player.getCurrentlyPlayingMusic());
        myMp3Player.playPreviousTrack();
        assertEquals(music2, myMp3Player.getCurrentlyPlayingMusic());
    }

    @Test
    void mp3Player_cantPlayPreviousTrackWhenPlayerIsOff(){
        assertFalse(myMp3Player.isOn());
        Music music = new Music();
        myMp3Player.download(music);
        Music music2 = new Music();
        myMp3Player.download(music2);
        assertEquals(0, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.play(music2);
        assertEquals(STOPPED, myMp3Player.getMusicState());
        assertEquals(null, myMp3Player.getCurrentlyPlayingMusic());
        myMp3Player.playPreviousTrack();
        assertEquals(null, myMp3Player.getCurrentlyPlayingMusic());
    }

    @Test
    void mp3Player_canSkipMusic(){
        myMp3Player.flipPowerButtons();
        Music music = new Music();
        myMp3Player.download(music);
        Music music2 = new Music();
        myMp3Player.download(music2);
        Music music3 = new Music();
        myMp3Player.download(music3);
        assertEquals(3, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.play(music);
        assertEquals(PLAYING, myMp3Player.getMusicState());
        assertEquals(music, myMp3Player.getCurrentlyPlayingMusic());
        myMp3Player.skipTrack();
        assertEquals(music3, myMp3Player.getCurrentlyPlayingMusic());
    }

    @Test
    void mp3Player_cantSkipTrackWhenPlayerIsOff(){
        assertFalse(myMp3Player.isOn());
        Music music = new Music();
        myMp3Player.download(music);
        Music music2 = new Music();
        myMp3Player.download(music2);
        Music music3 = new Music();
        myMp3Player.download(music3);
        assertEquals(0, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.play(music);
        assertEquals(STOPPED, myMp3Player.getMusicState());
        assertEquals(null, myMp3Player.getCurrentlyPlayingMusic());
        myMp3Player.skipTrack();
        assertEquals(null, myMp3Player.getCurrentlyPlayingMusic());
    }

    @Test
    void mp3Player_canCreatePlaylist(){
        myMp3Player.flipPowerButtons();
        ArrayList<Music> playlist = new ArrayList<>();
        myMp3Player.createPlaylist(playlist);
        assertEquals(1, myMp3Player.getTotalNumberOfPlaylists());
    }

    @Test
    void mp3Player_canAddMusicToPlaylist(){
        myMp3Player.flipPowerButtons();
        ArrayList<Music> playlist = new ArrayList<>();
        Music music1 = new Music();
        Music music2 = new Music();

        myMp3Player.createPlaylist(playlist);
        myMp3Player.addMusicToPlaylist(music1, playlist);
        myMp3Player.addMusicToPlaylist(music2, playlist);
        assertEquals(2, myMp3Player.getNumberOfSongsInPlaylist(playlist));
    }

    @Test
    void mpPlayer_canRemoveMusicFromPlaylist() {
        myMp3Player.flipPowerButtons();
        ArrayList<Music> playlist = new ArrayList<>();
        Music music1 = new Music();
        Music music2 = new Music();

        myMp3Player.createPlaylist(playlist);
        myMp3Player.addMusicToPlaylist(music1, playlist);
        myMp3Player.addMusicToPlaylist(music2, playlist);
        assertEquals(2, myMp3Player.getNumberOfSongsInPlaylist(playlist));

        myMp3Player.removeMusicFromPlaylist(music2, playlist);
        assertEquals(1, myMp3Player.getNumberOfSongsInPlaylist(playlist));
    }

    @Test
    void mp3Player_canRepeatASong(){
        myMp3Player.flipPowerButtons();
        Music music = new Music();
        myMp3Player.download(music);
        assertEquals(1, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.repeatMusic();
        assertEquals(music, myMp3Player.getCurrentlyPlayingMusic());
    }

    @Test
    void mp3Player_canRepeatPlaylist(){
        myMp3Player.flipPowerButtons();
        Music music = new Music();
        ArrayList<Music> mix = new ArrayList<>();
        myMp3Player.createPlaylist(mix);
        myMp3Player.addMusicToPlaylist(music, mix);
        assertEquals(1, myMp3Player.getNumberOfSongsInPlaylist(mix));
        assertEquals(1, myMp3Player.getTotalNumberOfPlaylists());

        myMp3Player.repeatPlaylist();
        assertEquals(mix, myMp3Player.getCurrentlyPlayingPlaylist());
    }

    @Test
    void mp3Player_canShuffleSongsInPlaylist(){
        myMp3Player.flipPowerButtons();
        Music music = new Music();
        Music music1 = new Music();
        Music music2 = new Music();
        Music music3 = new Music();
        myMp3Player.download(music);
        myMp3Player.download(music1);
        myMp3Player.download(music2);
        myMp3Player.download(music3);
        assertEquals(4, myMp3Player.getTotalNumberOfMusic());

        ArrayList<Music> mix = new ArrayList<>();
        myMp3Player.createPlaylist(mix);
        myMp3Player.addMusicToPlaylist(music, mix);
        myMp3Player.addMusicToPlaylist(music1, mix);
        myMp3Player.addMusicToPlaylist(music2, mix);
        myMp3Player.addMusicToPlaylist(music3, mix);
        assertEquals(4, myMp3Player.getNumberOfSongsInPlaylist(mix));
        assertEquals(1, myMp3Player.getTotalNumberOfPlaylists());

        myMp3Player.shuffleSongsInPlaylist();
        assertEquals(music, myMp3Player.getCurrentlyPlayingMusic());
    }
}
