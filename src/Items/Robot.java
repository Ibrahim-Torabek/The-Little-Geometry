package Items;

import Shapes.Piece;
import javafx.scene.paint.Color;

import static Shapes.Piece.*;

/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines all 20 shapes' path and name of a robot. </p>
 * <p></p>
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class Robot extends Item {

    /**
     * This is the Constructor method of Robot class. Adding the name, paths and colors of 20 shapes.
     */
    public Robot() {
        super("Robot");
        setImagePath("Icons/robot.png");
        pieces.add(new Piece(SQUARE, "M288,115h-72V35h72V115z", Color.web("#0AFFFB")));
        pieces.add(new Piece(TRIANGLE, "M194.98,58.39l16.04-9.26v18.52L194.98,58.39z", Color.web("#0AFFFB")));
        pieces.add(new Piece(TRIANGLE, "M294.87,67.22V48.7l16.04,9.26L294.87,67.22z", Color.web("#0AFFFB")));
        pieces.add(new Piece(TRIANGLE, "M223.25,84.5l60.78,0l-30.39,18.31L223.25,84.5z", Color.web("#FF0A1F")));
        pieces.add(new Piece(CIRCLE, "M247.5,56.5c0,6.08-4.92,11-11,11s-11-4.92-11-11s4.92-11,11-11S247.5,50.42,247.5,56.5z", Color.web("#ffff")));
        pieces.add(new Piece(CIRCLE, "M278.5,56.5c0,6.08-4.92,11-11,11s-11-4.92-11-11s4.92-11,11-11S278.5,50.42,278.5,56.5z", Color.web("#ffff")));
        pieces.add(new Piece(CIRCLE, "M243.64,59.73c0,3.44-2.94,6.23-6.57,6.23c-3.63,0-6.57-2.79-6.57-6.23c0-3.44,2.94-6.23,6.57-6.23C240.7,53.5,243.64,56.29,243.64,59.73z", Color.web("#000000")));
        pieces.add(new Piece(CIRCLE, "M274.21,59.96c0,3.44-2.94,6.23-6.57,6.23c-3.63,0-6.57-2.79-6.57-6.23s2.94-6.23,6.57-6.23C271.27,53.73,274.21,56.52,274.21,59.96z", Color.web("#000000")));
        pieces.add(new Piece(RECTANGLE, "M304.5,232.5h-101v-108h101V232.5z", Color.web("#000000")));
        pieces.add(new Piece(RECTANGLE, "M157.43,265.41l-21.08-6.29l36.75-123.26l21.08,6.29L157.43,265.41z", Color.web("#0AFFFB")));
        pieces.add(new Piece(RECTANGLE, "M323.63,158.2l-18.02-12.62l73.78-105.37l18.02,12.62L323.63,158.2z", Color.web("#0AFFFB")));
        pieces.add(new Piece(HEXAGON, "M418.01,41.89l-19.55,6.32l-15.31-13.69l4.23-20.01l19.55-6.32l15.31,13.69L418.01,41.89z", Color.web("#0AFFFB")));
        pieces.add(new Piece(HEXAGON, "M155.73,292.09l-16.03,12.85l-19.18-7.37l-3.15-20.21l16.03-12.85l19.18,7.37L155.73,292.09z", Color.web("#0AFFFB")));
        pieces.add(new Piece(HEXAGON, "M343,263.65L296.03,286l-88.5-0.81L166,262.03l46.97-22.35l88.5,0.81L343,263.65z", Color.web("#000000")));
        pieces.add(new Piece(RECTANGLE, "M226.63,441.07l-27.64-0.17l0.94-150.6l27.64,0.17L226.63,441.07z", Color.web("#0AFFFB")));
        pieces.add(new Piece(RECTANGLE, "M308.71,441.73l-27.64-0.17l0.94-150.6l27.64,0.17L308.71,441.73z", Color.web("#0AFFFB")));
        pieces.add(new Piece(CIRCLE, "M229.5,463c0,8.56-6.94,15.5-15.5,15.5s-15.5-6.94-15.5-15.5s6.94-15.5,15.5-15.5S229.5,454.44,229.5,463z", Color.web("#000000")));
        pieces.add(new Piece(CIRCLE, "M309.5,463c0,8.56-6.94,15.5-15.5,15.5s-15.5-6.94-15.5-15.5s6.94-15.5,15.5-15.5S309.5,454.44,309.5,463z", Color.web("#000000")));
        pieces.add(new Piece(SQUARE, "M191.5,473.5h-26v-26h26V473.5z", Color.web("#000000")));
        pieces.add(new Piece(SQUARE, "M346.5,473.5h-26v-26h26V473.5z", Color.web("#000000")));

        //show();
    }
}
