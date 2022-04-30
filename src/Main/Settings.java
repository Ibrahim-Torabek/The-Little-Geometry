package Main;

import java.io.Serializable;

/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class will define settings. It include background music On/Off, and volume of
 * background music.</p>
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 *
 */

public class Settings implements Serializable {
    private boolean backgroundMusic;
    private double backgroundVolume;

    /**
     * <h2>Constructor of Settings class</h2>
     * <p><b>Initialize</b> backgroundMusic = true,Volume = 0.1. </p>
     */
    public Settings() {
        this.backgroundMusic = true;
        this.backgroundVolume = 0.1;
    }

    public boolean isBackgroundMusic() {
        return backgroundMusic;
    }

    public void setBackgroundMusic(boolean backgroundMusic) {
        this.backgroundMusic = backgroundMusic;
    }

    public double getBackgroundVolume() {
        return backgroundVolume;
    }

    public void setBackgroundVolume(double backgroundVolume) {
        this.backgroundVolume = backgroundVolume;
    }
}
