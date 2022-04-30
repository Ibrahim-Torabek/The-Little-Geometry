package Panes;

import javafx.animation.*;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.util.Duration;

/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines a pane which extends GridPane. It animatedly shows name of Contributors and Programmers</p>
 *
 * @see HBox
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class EndPane extends GridPane {
    /**
     * This is the constructor method of EndPane class. It displays Contributor's and Programmers' name in the end.
     */
    public EndPane() {
        Font bodyFont = Font.font("Times New Roman",40);

        // Fade display and Scale in The End label.
        Label endText = new Label("The End");
        endText.setFont(Font.font("Arial",FontWeight.BOLD,30));
        endText.setTextFill(Color.WHITE);
        FadeTransition endFade = new FadeTransition(Duration.seconds(2),endText);
        endFade.setFromValue(1);
        endFade.setToValue(0);
        ScaleTransition endScale = new ScaleTransition(Duration.seconds(2),endText);
        endScale.setFromX(10);
        endScale.setToX(0);
        endScale.setFromY(10);
        endScale.setToY(0);
        ParallelTransition endParallel = new ParallelTransition(endFade,endScale);


        // Thanks message
        Text thanksMessage = new Text("Thank you for playing The Little Geometrist");
        thanksMessage.setFont(Font.font("Times New Roman", FontWeight.BOLD,30));
        thanksMessage.setFill(Color.WHITE);
        thanksMessage.setStroke(Color.GRAY);
        thanksMessage.setVisible(false);
        FadeTransition thanksFade1 = new FadeTransition(Duration.millis(100),thanksMessage);
        thanksFade1.setFromValue(0);
        thanksFade1.setToValue(0.01);
        thanksFade1.setOnFinished(e -> {
            thanksMessage.setVisible(true);
        });
        FadeTransition thanksFade = new FadeTransition(Duration.seconds(1),thanksMessage);
        thanksFade.setToValue(1);
        thanksFade.setFromValue(0);

        HBox thanksBox = new HBox();
        thanksBox.setAlignment(Pos.CENTER);
        thanksBox.setVisible(false);
        String thanksString = "Special Thanks";
        SequentialTransition thanksSeq = new SequentialTransition();
        flashType(thanksString, thanksSeq,thanksBox);


        HBox prghBox = new HBox();
        //FadeTransition fadeBox = new FadeTransition(prghBox);
        prghBox.setVisible(false);
        prghBox.setAlignment(Pos.CENTER);
        String programmed = "Programmed By";
        SequentialTransition prgSeq = new SequentialTransition();
        flashType(programmed,prgSeq,prghBox);

        Label contributor = new Label("Contributor:");
        contributor.setFont(bodyFont);
        contributor.setTextFill(Color.DARKGREEN);
        contributor.setVisible(false);
        TranslateTransition contributorTrans = new TranslateTransition(Duration.seconds(1),contributor);
        contributorTrans.setFromX(-800);
        contributorTrans.setToX(0);
        FadeTransition contributorFade = new FadeTransition(Duration.millis(100),contributor);
        contributorFade.setFromValue(0);
        contributorFade.setToValue(1);
        contributorFade.setOnFinished(e -> {
            contributor.setVisible(true);
        });

        Label teacher = new Label("Nicholas Sylvestre");
        teacher.setFont(bodyFont);
        teacher.setTextFill(Color.GREEN);
        teacher.setVisible(false);
        TranslateTransition teacherTrans = new TranslateTransition(Duration.millis(500),teacher);
        teacherTrans.setToX(0);
        teacherTrans.setFromX(800);
        FadeTransition teacherFade = new FadeTransition(Duration.millis(200),teacher);
        teacherFade.setFromValue(0);
        teacherFade.setToValue(1);
        teacherFade.setOnFinished(e -> {
            teacher.setVisible(true);
        });


        Label elena = new Label("Elena Polyakova");
        elena.setFont(bodyFont);
        elena.setTextFill(Color.PINK);
        elena.setVisible(false);
        TranslateTransition elenaTrans = new TranslateTransition(Duration.seconds(1),elena);
        elenaTrans.setFromX(-400);
        elenaTrans.setToX(0);
        RotateTransition elenaRotate = new RotateTransition(Duration.seconds(1),elena);
        elenaRotate.setFromAngle(0);
        elenaRotate.setToAngle(720);
        ParallelTransition elenaParallel = new ParallelTransition(elenaRotate,elenaTrans);
        FadeTransition elenaFade = new FadeTransition(Duration.millis(100),elena);
        elenaFade.setFromValue(0);
        elenaFade.setToValue(1);
        elenaFade.setOnFinished(e -> {
            elena.setVisible(true);
        });



        Label ibrahim = new Label("Ibrahim Osman");
        ibrahim.setFont(bodyFont);
        ibrahim.setTextFill(Color.PINK);
        ibrahim.setVisible(false);
        TranslateTransition ibrahimTrans = new TranslateTransition(Duration.seconds(1),ibrahim);
        ibrahimTrans.setFromX(400);
        ibrahimTrans.setToX(0);
        RotateTransition ibrahimRotate = new RotateTransition(Duration.seconds(1),ibrahim);
        ibrahimRotate.setFromAngle(0);
        ibrahimRotate.setToAngle(-720);
        ParallelTransition ibrahimParallel = new ParallelTransition(ibrahimRotate,ibrahimTrans);
        FadeTransition ibrahimFade = new FadeTransition(Duration.millis(100),ibrahim);
        ibrahimFade.setFromValue(0);
        ibrahimFade.setToValue(1);
        ibrahimFade.setOnFinished(e -> {
            ibrahim.setVisible(true);
        });


        endParallel.play();

        endParallel.setOnFinished(e -> {
            thanksFade1.play();
            thanksFade.play();
        });

        thanksFade.setOnFinished(e -> {
            thanksSeq.play();
            thanksBox.setVisible(true);
        });


        thanksSeq.setOnFinished(e -> {
            contributorFade.play();
            contributorTrans.play();

        });

        contributorTrans.setOnFinished(e -> {
            teacherFade.play();
            teacherTrans.play();
        });


        teacherTrans.setOnFinished(e -> {
            prghBox.setVisible(true);
            prgSeq.play();
        });

        prgSeq.setOnFinished(e -> {
            elenaFade.play();
            elenaParallel.play();
        });

        elenaParallel.setOnFinished(e -> {
            ibrahimFade.play();
            ibrahimParallel.play();
        });

        ibrahimParallel.setOnFinished( e -> {
            System.exit(0);
        });


        this.setVgap(30);
        this.add(thanksMessage,0,0,2,1);
        this.add(thanksBox,0,1,2,1);
        this.add(contributor,0,2);
        this.add(teacher,1,2);
        this.add(endText,1,3);
        this.add(prghBox,0,4,2,1);
        this.add(elena,0,5,2,1);
        this.add(ibrahim,0,6,2,1);
        this.setAlignment(Pos.CENTER);
        this.setBackground(new Background(
                new BackgroundFill(Color.BLACK, new CornerRadii(20), new Insets(10))
        ));
    }

    /**
     * This method displays a typed animation. It sequentially displays each letter of a given string in a period.
     *
     * @param str a string needed to be typed display.
     * @param seq sequential transitions
     * @param hBox an HBox to display a given string.
     */
    private void flashType(String str,SequentialTransition seq, HBox hBox){

        // Convert string to char array.
        char [] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            Label temp = new Label(String.valueOf(ch[i]));
            temp.setFont(Font.font("Arial",FontWeight.BOLD,30));
            temp.setTextFill(Color.RED);

            FadeTransition fade = new FadeTransition(Duration.millis(100),temp);
            fade.setFromValue(0);
            fade.setToValue(1);
            seq.getChildren().add(fade);
            hBox.getChildren().add(temp);
        }


    }
}
