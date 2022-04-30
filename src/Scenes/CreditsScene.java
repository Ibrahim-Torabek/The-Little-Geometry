package Scenes;

import Panes.CreditsPane;
import javafx.scene.Scene;

import static Main.Main.gameHeight;
import static Main.Main.gameWidth;

/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines a scene that sets the Credits Pane.</p>
 * @see CreditsPane
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class CreditsScene extends Scene {

    public CreditsScene() {
        super(new CreditsPane(), gameWidth, gameHeight);
    }

}


