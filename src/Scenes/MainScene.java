package Scenes;

import Panes.MainPane;
import javafx.scene.Scene;

import static Main.Main.*;


/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines a scene that sets the Main Pane.</p>
 * @see MainPane
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class MainScene extends Scene {
    public MainScene() {
        super(new MainPane(),gameWidth,gameHeight);
    }


}
