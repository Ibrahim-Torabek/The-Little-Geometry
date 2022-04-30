package Panes;

import Controls.ShadowButton;
import Scenes.EndScene;
import Scenes.MainScene;
import Scenes.SelectScene;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

import static Main.Main.*;

/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines a pane which extends HBox. It shows two ShadowButtons on it.
 * One is Back button to go back the previous scene. Another is Exit button to save changes and go to the End Pane. </p>
 * <p><b>Notes:</b> All settings and inventories will be saved when click the Exit button</p>
 *
 * @see HBox
 * @see ShadowButton
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class Footer extends HBox {
    /**
     * This is the constructor method of Footer class. It construct Back and Exit buttons
     */
    public Footer() {

        // Shadow Button exit
        ShadowButton exitDoor = new ShadowButton("Icons/exit.png", 70, 50);
        exitDoor.setOnMouseClicked(e -> {
            mainStage.setScene(new EndScene());
            sounds.stopBackground();

            saveCharacter();
            saveSettings();
        });

        // Shadow Back Button
        ShadowButton backWard = new ShadowButton("Icons/backward.png",70,50);
        backWard.setOnMouseClicked(e -> {
            if(scenePath.size() != 0 ) {
                Scene back = scenePath.get(scenePath.size() - 1);
                // If current is not main scene.
                if (back != null) {
                    switch (scenePathInt){
                        // path is 1 means previous scene is main scene
                        case 1:
                            mainStage.setScene(new MainScene());
                            break;

                        // path is 2 means previous scene is Select Scene.
                        case 2:
                            mainStage.setScene(new SelectScene());
                    }
                    scenePathInt--;
                    scenePath.remove(back);
                }
            }
        });

        this.setAlignment(Pos.BOTTOM_RIGHT);
        this.getChildren().addAll(backWard,exitDoor);
    }


}
