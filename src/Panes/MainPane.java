package Panes;

import Controls.MenuButton;
import Scenes.*;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import static Main.Main.*;


/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines a pane which extends BorderPane. It is the main pane of the game.
 * It includes knowledge, play, settings, credits and exit buttons.</p>
 *
 * @see BorderPane
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class MainPane extends BorderPane {
    /**
     * This is the constructor method of the game. it will show 5 buttons for 5 major functions.
     */

    public MainPane() {

        this.setTop(header);
        this.setBackground(new Background(new BackgroundImage(new Image("Images/Background.jpg"),BackgroundRepeat.REPEAT ,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT)));
        this.setBottom(footer);


        VBox leftMenuButtons = new VBox();
        leftMenuButtons.setAlignment(Pos.CENTER);

        // Show knowledge button, go to knowledge pane.
        MenuButton knowledge = new MenuButton("What is Shape?",45,30);

        // Show play game button, go to Select pane.
        MenuButton play = new MenuButton("Play Game", 45,30);

        // Show settings button, go to settings pane.
        MenuButton settings = new MenuButton("Settings", 45,10);

        // Show credits button, go to credits pane.
        MenuButton credit = new MenuButton("Credits",45,1);

        // Show exit button, go to end pane.
        MenuButton exit = new MenuButton("Exit",45,1);

        leftMenuButtons.getChildren().addAll(knowledge,play,settings,credit,exit);
        leftMenuButtons.setSpacing(30);
        leftMenuButtons.setPadding(new Insets(20));

        this.setLeft(leftMenuButtons);



        play.addEventHandler(ActionEvent.ACTION, e -> {
            // save current scene and scene level so that can back to this scene.
            scenePath.add(this.getScene());
            scenePathInt++;
            mainStage.setScene(new SelectScene());
        });
        settings.addEventHandler(ActionEvent.ACTION, e -> {
            // save current scene and scene level so that can back to this scene.
            scenePath.add(this.getScene());
            scenePathInt++;
            mainStage.setScene(new SettingScene());
        });
        credit.addEventHandler(ActionEvent.ACTION, e -> {
            // save current scene and scene level so that can back to this scene.
            scenePath.add(this.getScene());
            scenePathInt++;
            mainStage.setScene(new CreditsScene());
        });

        knowledge.addEventHandler(ActionEvent.ACTION, e -> {
            // save current scene and scene level so that can back to this scene.
            scenePath.add(this.getScene());
            scenePathInt++;
            mainStage.setScene(new BuildItemScene(items.get(6)));
        });

        exit.addEventHandler(ActionEvent.ACTION, e -> {
            mainStage.setScene(new EndScene());
            sounds.stopBackground();

            // Save settings and character values before exit.
            saveCharacter();
            saveSettings();
        });

    }
}
