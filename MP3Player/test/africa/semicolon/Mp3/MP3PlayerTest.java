package africa.semicolon.Mp3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        assertEquals(PLAYING, myMp3Player.getMusicState()==PLAYING);
        assertEquals(music, myMp3Player.getCurrentlyPlayingMusic());
    }

    @Test
    void mp3Player_canPauseMusic() {
        myMp3Player.flipPowerButtons();
        Music music2 = new Music();
        myMp3Player.download(music2);
        assertEquals(1, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.pause();
        assertEquals(PAUSED, myMp3Player.getMusicState()==PAUSED);
        assertEquals(music2, myMp3Player.getCurrentlyPlayingMusic());
    }

    @Test
    void mp3Player_canStopMusic() {
        myMp3Player.flipPowerButtons();
        Music music2 = new Music();
        myMp3Player.download(music2);
        assertEquals(1, myMp3Player.getTotalNumberOfMusic());

        myMp3Player.stop();
        assertEquals(PAUSED, myMp3Player.getMusicState()==STOPPED);
        assertEquals(music2, myMp3Player.getCurrentlyPlayingMusic());
    }

    @Test
    void mp3Player_canSetVolume(){
     myMp3Player.flipPowerButtons();
     Music music = new Music();

    }

}
