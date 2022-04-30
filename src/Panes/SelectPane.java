package Panes;

import Controls.ShadowButton;
import Items.*;
import Scenes.BuildItemScene;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


import static Main.Main.*;


/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines a pane which extends BorderPane. It is the selection of the items which will be build.
 * It includes all items that defined in items Arraylist.</p>
 *
 * @see BorderPane
 * @see Items
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class SelectPane extends BorderPane {
    /**
     * This is the constructor method of SelectPane class. It will list all items in items ArrayList variable by 3 items each line.
     *
     */
    public SelectPane() {

        Text title = new Text("What do you want to build?");
        title.setFont(Font.font("Times new Roman", 50));
        title.setStroke(Color.RED);
        title.setFill(Color.WHITE);


        this.setTop(header);
        this.setBackground(blankBackGround);
        this.setBottom(footer);

        GridPane gridPane = new GridPane();

        // Read items variable and list all items that it includes.
        for(int i = 0; i < items.size() - 1; i++){
            Item item = items.get(i);

            // Show by name and icon.
            ShadowButton shadowButton = new ShadowButton(item.getName(),item.getImagePath(),150,150);

            // Each line has three items.
            gridPane.add(shadowButton,i % 3, (int)(i / 3));

            shadowButton.setOnMouseClicked(e -> {
                // Save settings and character values before exit.
                scenePath.add(this.getScene());
                scenePathInt++;

                // Go to BuildItemPane with selected item (for example: House).
                mainStage.setScene(new BuildItemScene(item));
            });

        }

        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(50);
        gridPane.setVgap(50);
        this.setCenter(gridPane);
    }
}
