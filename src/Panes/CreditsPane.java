package Panes;

import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Duration;

import static Main.Main.*;

/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines a pane which extends BorderPane pane. It shows credits.</p>
 *
 * @see BorderPane
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class CreditsPane extends BorderPane {
    /**
     * This is the constructor method of xx class.
     */
    public CreditsPane(){
        //The title
        Font nameFont = Font.font("Times New Roman", FontWeight.BOLD,FontPosture.ITALIC,40);
        Font font = Font.font("Comic MS", FontWeight.BOLD, FontPosture.REGULAR, 20);
        Text creditsTitle = new Text("Credits:");
        creditsTitle.setFont(nameFont);
        creditsTitle.setUnderline(true);
        creditsTitle.setStrokeWidth(1);

        //List credits
        Text creditsText1 = new Text("- Student Cartoon PNG, by DavePoliagoFBI ,\n " +
                "https://imgbin.com/png/kHmLE50J/student-cartoon-png");

        Text creditsText2 = new Text("- {Carefree Melody} by Twin Musicom (twinmusicom.org)");

        Text creditsText3 = new Text("- Boy Face Cliparts #2787216, \n http://clipart-library.com/clipart/921612.htm");
        Text creditsText4 = new Text("- Boy Face Cliparts #2787199,\n http://clipart-library.com/clipart/921502.htm");

        Text creditsText5 = new Text("- Blonde Cliparts #31538,\n http://clipart-library.com/clipart/111467.htm");

        Text creditsText6 = new Text("- Icons: backward.png, butterfly.png, car.png,\n exit.png," +
                "flower.png, house.png, robot.png, tree.png, \n https://game-icons.net");
        Text creditsText7 = new Text("- Car PNG, House PNG, Flower PNG, Sun PNG, TreePNG, Off.png, \n On.png, " +
                "Backblank.png https://imgbin.com");
        Text creditsText8 = new Text("- mouse-click-clicking-single-click-3, Menu-Button-Press-C,\n" +
                "Video-Game-Power-Level-Up-A3-Med, www.FesliyanStudios.com");

        //Set font to the credits
        creditsText1.setFont(font);
        creditsText2.setFont(font);
        creditsText3.setFont(font);
        creditsText4.setFont(font);
        creditsText5.setFont(font);
        creditsText6.setFont(font);
        creditsText7.setFont(font);
        creditsText8.setFont(font);

        //Apply color to the text objects
        creditsTitle.setFill(Color.RED);
        creditsTitle.setStroke(Color.BLUE);
        creditsText1.setFill(Color.BLUE);
        creditsText2.setFill(Color.BLUE);
        creditsText3.setFill(Color.BLUE);
        creditsText4.setFill(Color.BLUE);
        creditsText5.setFill(Color.BLUE);
        creditsText6.setFill(Color.BLUE);
        creditsText7.setFill(Color.BLUE);
        creditsText8.setFill(Color.BLUE);

        //VBox for credits
        VBox vBox = new VBox();
        vBox.getChildren().addAll(creditsTitle, creditsText1, creditsText2, creditsText3, creditsText4, creditsText5,
                creditsText6, creditsText7, creditsText8);
        vBox.setSpacing(15);
        vBox.setFillWidth(true);
        vBox.setAlignment(Pos.CENTER);
        vBox.setStyle("-fx-border-style: solid inside; -fx-border-width: 10; -fx-border-insets: 5;"
                + "-fx-border-radius: 10; -fx-border-color: blue;");


        FadeTransition fade2 = new FadeTransition(Duration.millis(2000), creditsTitle);
        fade2.setFromValue(0.5);
        fade2.setToValue(1);
        fade2.setCycleCount(1);

        //Translate Transition
        TranslateTransition transition1 = new TranslateTransition(Duration.seconds(3), creditsText1);
        transition1.setFromX(600);
        transition1.setToX(0);
        //transition1.setDuration(Duration.seconds(5));

        TranslateTransition transition3 = new TranslateTransition(Duration.seconds(3), creditsText3);
        transition3.setFromX(600);
        transition3.setToX(0);

        TranslateTransition transition5 = new TranslateTransition(Duration.seconds(3), creditsText5);
        transition5.setFromX(600);
        transition5.setToX(0);

        TranslateTransition transition7 = new TranslateTransition(Duration.seconds(3), creditsText7);
        transition7.setFromX(600);
        transition7.setToX(0);

        TranslateTransition transition2 = new TranslateTransition(Duration.seconds(3), creditsText2);
        transition2.setFromX(-600);
        transition2.setToX(0);

        TranslateTransition transition4 = new TranslateTransition(Duration.seconds(3), creditsText4);
        transition4.setFromX(-600);
        transition4.setToX(0);

        TranslateTransition transition6 = new TranslateTransition(Duration.seconds(3), creditsText6);
        transition6.setFromX(-600);
        transition6.setToX(0);

        TranslateTransition transition8 = new TranslateTransition(Duration.seconds(3), creditsText8);
        transition8.setFromX(-600);
        transition8.setToX(0);

        //ParallelTransition
        ParallelTransition parallelTransition = new ParallelTransition();
        parallelTransition.getChildren().addAll(fade2, transition1, transition2, transition3, transition4, transition5,
                transition6,transition7, transition8);
        parallelTransition.setDelay(Duration.millis(200));
        parallelTransition.play();



        this.setCenter(vBox);

        this.setTop(header);
        this.setBackground(blankBackGround);
        this.setBottom(footer);


    }



}
