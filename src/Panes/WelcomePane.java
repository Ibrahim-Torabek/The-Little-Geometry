package Panes;

import Main.Main;
import Scenes.MainScene;
import javafx.animation.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
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
 * <p>This class defines a pane which extends BorderPane. It shows welcome messages for the game. Includes game name and Authors name.</p>
 * <p>This pane will call the MainPane automatically when all animations finished.</p>
 * <P><b>Note:</b> Can finish the animation effects and go to Main Game by clicking mouse in any time.</P>
 * @see BorderPane
 * @see MainPane
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class WelcomePane extends BorderPane {

    /**
     * This is the constructor method of the WelcomePane class. it will show welcome message.
     * The message includes the name of game and two authors name.
     */
    public WelcomePane() {

        // VBox holds four labels. Have scale and fade transitions that run parallel.
        // When the parallel transition ends, wil call the Main Pane automatically.
        // VBox's animations will start when ibrahim's animation finished.
        VBox vBox = new VBox();
        ScaleTransition scaleVBox = new ScaleTransition(Duration.seconds(1),vBox);
        scaleVBox.setFromX(1);
        scaleVBox.setFromY(1);
        scaleVBox.setToY(10);
        scaleVBox.setToX(10);
        FadeTransition fadeVBox = new FadeTransition(Duration.seconds(1), vBox);
        fadeVBox.setFromValue(1);
        fadeVBox.setToValue(0);
        ParallelTransition parallelVBox = new ParallelTransition(scaleVBox,fadeVBox);
        parallelVBox.setOnFinished(e -> {
            if(mainSettings.isBackgroundMusic()){
                sounds.playBackground();
            }
            header.refresh();
            mainStage.setScene(new MainScene());

        });


        Text welcomeMessage = new Text("Welcome to " + Main.gameTitle);
        Font welcomeFont = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 40);
        welcomeMessage.setFont(welcomeFont);
        welcomeMessage.setFill(Color.PINK);
        welcomeMessage.setStroke(Color.WHITE);


        FadeTransition fade = new FadeTransition(Duration.seconds(4), welcomeMessage);
        fade.setFromValue(0);
        fade.setToValue(1);
        ScaleTransition scale = new ScaleTransition(Duration.seconds(4),welcomeMessage);
        scale.setFromX(0);
        scale.setFromY(0);
        scale.setFromZ(0);
        scale.setToX(1.25);
        scale.setToY(1.25);
        scale.setToZ(1.25);

        ParallelTransition parallel = new ParallelTransition();
        parallel.getChildren().addAll(scale,fade);

        Label by = new Label("By");
        by.setFont(Font.font("Arial",FontWeight.BOLD,20));

        FadeTransition byFade = new FadeTransition(Duration.millis(1000),by);
        byFade.setFromValue(0);
        byFade.setToValue(1);

        Font nameFont = Font.font("Times New Roman", FontWeight.BOLD,FontPosture.ITALIC,40);
        Text elena = new Text("Elena Polyakova");
        elena.setFont(nameFont);
        elena.setFill(Color.WHITE);
        elena.setStroke(Color.PINK);

        FadeTransition fadeE = new FadeTransition(Duration.millis(1),elena);
        fadeE.setFromValue(0);
        fadeE.setToValue(0.01);
        // Call other animations when Elena's Fade transition finished
        fadeE.setOnFinished(e -> {
            FadeTransition fadeElena = new FadeTransition(Duration.seconds(1),elena);
            fadeElena.setFromValue(0);
            fadeElena.setToValue(1);
            ScaleTransition scaleElenaOut = new ScaleTransition(Duration.seconds(1),elena);
            scaleElenaOut.setByX(2);
            scaleElenaOut.setByY(2);
            TranslateTransition translateElena = new TranslateTransition(Duration.seconds(1),elena);
            translateElena.setFromY(gameHeight);
            translateElena.setToY(000);
            ParallelTransition parallelElena = new ParallelTransition();
            parallelElena.getChildren().addAll(fadeElena,scaleElenaOut,translateElena);
            ScaleTransition scaleElenaIn = new ScaleTransition(Duration.seconds(1),elena);
            scaleElenaIn.setByX(-2);
            scaleElenaIn.setByY(-2);
            SequentialTransition sequentialElena = new SequentialTransition(parallelElena,scaleElenaIn);
            sequentialElena.play();
        });

        Text ibrahim = new Text("Ibrahim Torabek");
        ibrahim.setFont(nameFont);
        ibrahim.setFill(Color.WHITE);
        ibrahim.setStroke(Color.PINK);

        FadeTransition fadeI = new FadeTransition(Duration.millis(2000),ibrahim);
        fadeI.setFromValue(0);
        fadeI.setToValue(0.01);
        // Call ibrahim's other transitions when fade transition finished
        fadeI.setOnFinished(e -> {
            FadeTransition fadeIbrahim = new FadeTransition(Duration.millis(1000),ibrahim);
            fadeIbrahim.setFromValue(0);
            fadeIbrahim.setToValue(1);
            ScaleTransition scaleIbrahimOut = new ScaleTransition(Duration.millis(1000),ibrahim);
            scaleIbrahimOut.setByX(2);
            scaleIbrahimOut.setByY(2);
            TranslateTransition translateIbrahim = new TranslateTransition(Duration.seconds(1),ibrahim);
            translateIbrahim.setFromY(gameHeight);
            translateIbrahim.setToY(000);
            ParallelTransition parallelIbrahim = new ParallelTransition(fadeIbrahim,scaleIbrahimOut,translateIbrahim);
            ScaleTransition scaleIbrahimIn = new ScaleTransition(Duration.millis(1000),ibrahim);
            scaleIbrahimIn.setByX(-2);
            scaleIbrahimIn.setByY(-2);
            SequentialTransition sequentialIbrahim = new SequentialTransition(parallelIbrahim,scaleIbrahimIn);
            sequentialIbrahim.play();
            // When all Transitions finished, call vBox's transition to finish the welcome pane.
            sequentialIbrahim.setOnFinished(even -> {
                parallelVBox.play();
            });
        });


        SequentialTransition sequential = new SequentialTransition();
        sequential.getChildren().addAll(parallel,byFade,fadeE,fadeI);

        sequential.play();

        vBox.getChildren().addAll(welcomeMessage,by,elena,ibrahim);
        vBox.setAlignment(Pos.CENTER);



        this.setCenter(vBox);
        this.setBackground(new Background(
                new BackgroundFill(Color.BLACK, new CornerRadii(20), new Insets(10))
        ));

        // Go to MainPain when the pane clicked.
        this.setOnMouseClicked(e -> {

            if(mainSettings.isBackgroundMusic()){
                sounds.playBackground();
            }
            header.refresh();
            mainStage.setScene(new MainScene());

        });
    }
}
