package Scenes;

import Panes.EndPane;
import javafx.scene.Parent;
import javafx.scene.Scene;

import static Main.Main.*;


/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines a scene that sets the End Pane.</p>
 * @see EndPane
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class EndScene extends Scene {
    public EndScene() {
        super(new EndPane(),gameWidth,gameHeight);
    }
}
