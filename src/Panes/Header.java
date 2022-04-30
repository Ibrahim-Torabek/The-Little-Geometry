package Panes;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import static Main.Main.mainCharacter;

/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines a pane which extends HBox. It shows player's avatar, name and score on it.
 * This pane is displayed all panes except Welcome and End Panes.</p>
 * <p><b>Notes:</b> Every time change a value, should refresh this pane.</p>
 *
 * @see HBox
 * @see Main.Player
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class Header extends HBox {
    private Font headerFont = Font.font("Consolas",50);
    private ImageView imageAvatar = new ImageView(new Image(mainCharacter.getAvatarPath()));
    private Text name = new Text(mainCharacter.getName());

    private Text welcome = new Text("Player:");
    private Text scoreTitle = new Text("  Score:");
    private Text score = new Text(String.valueOf(mainCharacter.getScore()));
    /**
     * This is the constructor method of Header class. It displays avatar, name and score of player
     */
    public Header() {

        imageAvatar.setImage(new Image(mainCharacter.getAvatarPath()));
        imageAvatar.setFitWidth(60);
        imageAvatar.setFitHeight(70);


        welcome.setFont(headerFont);
        welcome.setFill(Color.RED);

        name.setText(mainCharacter.getName());
        name.setFont(headerFont);
        name.setFill(Color.BLUE);


        scoreTitle.setFont(headerFont);
        scoreTitle.setFill(Color.RED);


        score.setText(String.valueOf(mainCharacter.getScore()));
        score.setFont(headerFont);
        score.setFill(Color.BLUE);


        this.getChildren().addAll(imageAvatar, welcome, name, scoreTitle,score);
        this.setSpacing(20);
        this.setAlignment(Pos.CENTER);
    }

    public void refresh(){
        // Just set new value of all properties to refresh
        score.setText(String.valueOf(mainCharacter.getScore()));
        name.setText(mainCharacter.getName());
        imageAvatar.setImage(new Image(mainCharacter.getAvatarPath()));
    }
}
