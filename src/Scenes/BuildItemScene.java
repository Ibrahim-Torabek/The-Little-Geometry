package Scenes;

import Items.Item;
import Panes.BuildItemPane;
import javafx.scene.Parent;
import javafx.scene.Scene;

import static Main.Main.gameHeight;
import static Main.Main.gameWidth;

/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines a scene that sets the Build Item Pane.</p>
 * @see BuildItemPane
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class BuildItemScene extends Scene {
    public BuildItemScene(Item item) {
        super(new BuildItemPane(item),gameWidth,gameHeight);
    }
}
