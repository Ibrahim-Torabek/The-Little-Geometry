package Main;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.io.File;

import static Main.Main.mainSettings;

/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class will define sounds. It include background music , beep, clicked, error and release sounds.</p>
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 *
 */
public class Sounds {
    MediaPlayer beep = new MediaPlayer(new Media(new File("src/Sounds/beep.mp3").toURI().toString()));
    MediaPlayer clicked = new MediaPlayer(new Media(new File("src/Sounds/clickes.mp3").toURI().toString()));
    MediaPlayer released = new MediaPlayer(new Media(new File("src/Sounds/press.mp3").toURI().toString()));
    MediaPlayer error = new MediaPlayer(new Media(new File("src/Sounds/up.mp3").toURI().toString()));
    MediaPlayer background = new MediaPlayer(new Media(new File("src/Sounds/Carefree Melody.mp3").toURI().toString()));

    /**
     * <h2>Constructor of Sound class</h2>
     * <p><b>Initialize</b> make infinite loop of background music.</p>
     */
    public Sounds() {
        background.setCycleCount(MediaPlayer.INDEFINITE);
        background.setVolume(mainSettings.getBackgroundVolume());
    }


    public void setVolume(double volume){
        background.setVolume(volume);
    }

    public double getVolume(double volume){
        return background.getVolume();
    }

    /**
     * Play background music
     */
    public void playBackground(){
        background.play();
    }
    /**
     * Pause background music
     */
    public void pauseBackground(){
        background.pause();
    }
    /**
     * Stop background music
     */
    public void stopBackground(){
        background.stop();
    }


    /**
     * Play clicked sound when click a shape.
     */
    public void clicked(){
        clicked.play();
        clicked.seek(Duration.ZERO);
    }

    /**
     * Play clicked beep, not use in present.
     */
    public void beep(){
        beep.play();
        beep.seek(Duration.ZERO);
    }

    /**
     * Play release sound when release a shape on correct location.
     */
    public void release(){
        released.play();
        released.seek(Duration.ZERO);
    }

    /**
     * Play error sound when release a shape on incorrect location.
     */
    public void error(){
        error.play();
        error.seek(Duration.ZERO);
    }

}
