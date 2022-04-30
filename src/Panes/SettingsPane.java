package Panes;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


import java.util.ArrayList;

import static Main.Main.*;

/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines a pane which extends BorderPane pane. It shows all setting of the game.
 * It includes the name of player, four avatar pictures, age of player, volume of background music
 *  and On/Off switch of the background music.</p>
 * <p><b>Notes:</b> Some setting will work when press the Save button.</p>
 *
 * @see BorderPane
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class SettingsPane extends BorderPane {

    /**
     * This is the constructor method of SettingsPane class. It displays all settings
     */
    public SettingsPane() {
        this.setTop(header);
        this.setBackground(blankBackGround);
        this.setBottom(footer);

        // Set text fill and stroke color. and Font
        Color textColor = Color.BLACK;
        Color strokeColor = Color.YELLOW;
        Font textFont = Font.font("Tahoma", FontWeight.BOLD, FontPosture.ITALIC,50);


        // All labels
        Text nameLabel = new Text("Player Name:");
        nameLabel.setFill(textColor);
        nameLabel.setStroke(strokeColor);
        nameLabel.setFont(textFont);

        Text avatarLabel = new Text("Avatar:");
        avatarLabel.setFill(textColor);
        avatarLabel.setStroke(strokeColor);
        avatarLabel.setFont(textFont);

        Text volumeLabel = new Text("Volume:");
        volumeLabel.setFill(textColor);
        volumeLabel.setStroke(strokeColor);
        volumeLabel.setFont(textFont);

        Text musicLabel = new Text("Background Music:");
        musicLabel.setFill(textColor);
        musicLabel.setStroke(strokeColor);
        musicLabel.setFont(textFont);

        Text ageLabel = new Text("Age:");
        ageLabel.setFill(textColor);
        ageLabel.setStroke(strokeColor);
        ageLabel.setFont(textFont);

        TextField nameField = new TextField(mainCharacter.getName());
        nameField.setFont(textFont);


        //Put four avatar pictures that selectable into the HBox
        HBox avatarBox = new HBox();
        avatarBox.setSpacing(30);

        // Current avatar picture
        ImageView currentAvatar = new ImageView(new Image(mainCharacter.getAvatarPath()));
        currentAvatar.setFitWidth(60);
        currentAvatar.setFitHeight(70);

        Text avatarSelection = new Text("<--");
        avatarSelection.setFont(textFont);
        avatarSelection.setFill(Color.RED);
        avatarBox.getChildren().addAll(avatarSelection);


        // Four pictures
        ArrayList<ImageView> avatarImage = new ArrayList<>();
        ArrayList<String> avatar = new ArrayList<>();
        avatar.add("Images/avatars/boy1.png");
        avatar.add("Images/avatars/boy2.png");
        avatar.add("Images/avatars/girl1.png");
        avatar.add("Images/avatars/girl2.png");

        for(int i = 0; i < avatar.size(); i++){
            ImageView temp = new ImageView(new Image(avatar.get(i)));
            temp.setFitHeight(70);
            temp.setFitWidth(60);
            temp.setCursor(Cursor.HAND);

            avatarBox.getChildren().add(temp);
            int finalI = i;

            // set clicked picture as new avatar picture.
            temp.setOnMouseClicked(e -> {
                currentAvatar.setImage(new Image(avatar.get(finalI)));
                sounds.clicked();
                mainCharacter.setAvatarPath(avatar.get(finalI));
            });
            avatarImage.add(temp);
        }

        // Background music slider
        Slider volumeSlider = new Slider();
        volumeSlider.setMin(0);
        volumeSlider.setMax(1);
        volumeSlider.setValue(mainSettings.getBackgroundVolume());
        volumeSlider.setEffect(new DropShadow(20,Color.DARKRED));
        volumeSlider.setStyle("-fx-background-color: linear-gradient(to right, GREEN, RED);");
        volumeSlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                // set volume of background music
                sounds.setVolume(volumeSlider.getValue());
                // set as settings.
                mainSettings.setBackgroundVolume(volumeSlider.getValue());
            }
        });

        // Back ground music On/Off button
        Image on = new Image("Images/On.png");
        Image off = new Image("Images/Off.png");
        ImageView onOff = new ImageView(mainSettings.isBackgroundMusic()? on : off);
        onOff.setOnMouseClicked(e -> {
            mainSettings.setBackgroundMusic(!mainSettings.isBackgroundMusic());

            // set on image when the background music is on, otherwise set Off image
            onOff.setImage(mainSettings.isBackgroundMusic()? on : off);
            if(mainSettings.isBackgroundMusic())
                sounds.playBackground();
            else
                sounds.pauseBackground();

            sounds.clicked();
        });

        onOff.setCursor(Cursor.HAND);

        // Current age that displayed between the age label and age slider.
        Text age = new Text(String.valueOf(mainCharacter.getAge()));
        age.setFont(textFont);
        age.setFill(Color.RED);

        // Age slider
        Slider ageSlider = new Slider();
        ageSlider.setMin(5);
        ageSlider.setMax(14);
        ageSlider.setValue(mainCharacter.getAge());
        ageSlider.setShowTickLabels(true);
        ageSlider.setShowTickMarks(true);
        ageSlider.setMajorTickUnit(1);
        ageSlider.setMinorTickCount(1);
        ageSlider.setBlockIncrement(1);
        ageSlider.setEffect(new DropShadow(20,Color.DARKRED));
        // Set slider style as CSS style.
        ageSlider.setStyle("-fx-background-color: linear-gradient(to right, #2D819D, #969696);");
        ageSlider.setTooltip(new Tooltip());
        ageSlider.valueProperty().addListener((obs, oldValue, newValue) ->{
            // set age as integer
            ageSlider.setValue(Math.round(newValue.doubleValue()));
            age.setText(String.valueOf(Math.round(newValue.doubleValue())));
        });

        // Save Button
        Button saveButton = new Button("Save");
        saveButton.setFont(textFont);
        saveButton.setOnAction(e -> {
            String name = nameField.getText();
            if(name.length() > 13) {
                name = name.substring(0, 13);
                name += "..";
            }
            mainCharacter.setName(name);

            header.refresh();

            mainCharacter.setAge((int) Math.round(ageSlider.getValue()));

        });

        // stylize save button with CSS style.
        saveButton.setStyle("-fx-background-color: \n" +
                "linear-gradient(#ffd65b, #e68400),\n" +
                "linear-gradient(#ffef84, #f2ba44),\n" +
                "linear-gradient(#ffea6a, #efaa22),\n" +
                "linear-gradient(#ffe657 0%, #f8c202 50%, #eea10b 100%),\n" +
                "linear-gradient(from 0% 0% to 15% 50%, rgba(255,255,255,0.9), rgba(255,255,255,0));\n" +
                "-fx-background-radius: 40;\n" +
                "-fx-background-insets: 0,1,2,3,0;\n" +
                "-fx-text-fill: #654b00;\n" +
                "-fx-font-weight: bold;\n" +
                "-fx-font-size: 50px;\n" +
                "-fx-padding: 10 20 10 20;");
        saveButton.setMaxWidth(200);
        saveButton.setMaxHeight(100);


        // Organize with grid pane.
        GridPane root = new GridPane();
        root.add(nameLabel,0,0);
        root.add(avatarLabel,0,1);
        root.add(volumeLabel,0,2);
        root.add(musicLabel,0,3);
        root.add(ageLabel,0,4);

        root.add(currentAvatar,1,1);
        root.add(age,1,4);

        root.add(nameField,2,0);
        root.add(avatarBox,2,1);
        root.add(volumeSlider,2,2);
        root.add(onOff,2,3);
        root.add(ageSlider,2,4);

        root.add(saveButton,1,5,2,1);

        // All labels align right.
        root.setHalignment(nameLabel, HPos.RIGHT);
        root.setHalignment(avatarLabel, HPos.RIGHT);
        root.setHalignment(volumeLabel, HPos.RIGHT);
        root.setHalignment(musicLabel, HPos.RIGHT);
        root.setHalignment(ageLabel, HPos.RIGHT);

        // settings align left.
        root.setHalignment(nameField,HPos.LEFT);
        root.setHalignment(avatarBox,HPos.LEFT);
        root.setPadding(new Insets(30));
        root.setVgap(30);

        this.setCenter(root);


    }
}
