package Scenes;

import Panes.SelectPane;
import javafx.scene.Scene;

import static Main.Main.*;


/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines a scene that sets the Select Pane.</p>
 * @see SelectPane
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class SelectScene extends Scene {
    public SelectScene() {
        super(new SelectPane(), gameWidth, gameHeight);
    }


}
