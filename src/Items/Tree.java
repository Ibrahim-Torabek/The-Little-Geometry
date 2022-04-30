package Items;

import Shapes.Piece;
import javafx.scene.paint.Color;

import static Shapes.Piece.*;

/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines all 13 shapes' path and name of a tree. </p>
 * <p></p>
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class Tree extends Item {

    /**
     * This is the Constructor method of Tree class. Adding the name, paths and colors of 13 shapes.
     */
    public Tree() {
        super("Tree");
        setImagePath("Icons/tree.png");
        pieces.add(new Piece(TRIANGLE, "M243.52,206.57l143.34,248.27H100.19L243.52,206.57z", Color.web("#00FF00")));
        pieces.add(new Piece(RECTANGLE, "M281.5,496.5h-62v-42h62V496.5z", Color.web("#F7931E")));
        pieces.add(new Piece(TRIANGLE, "M251.14,135.15l110.72,191.78H140.42L251.14,135.15z", Color.web("#00FF00")));
        pieces.add(new Piece(TRIANGLE, "M247.32,83.32l82.4,142.72h-164.8L247.32,83.32z", Color.web("#00FF00")));
        pieces.add(new Piece(TRIANGLE, "M248.25,33.94l56.52,97.9H191.73L248.25,33.94z", Color.web("#00FF00")));
        pieces.add(new Piece(POLYGON, "M275.93,89.36L250.1,75.92l-25.71,13.66l4.79-28.72l-20.94-20.23l28.79-4.31l12.77-26.17l13,26.05l28.83,4.06l-20.76,20.42L275.93,89.36z", Color.web("#FBFF15")));
        pieces.add(new Piece(RHOMBUS, "M271.44,139.87l-18.39,42.91l-22.61-38.59l19.52-40.99L271.44,139.87z", Color.web("#00FFFF")));
        pieces.add(new Piece(CIRCLE, "M226,214.5c0,13.53-10.97,24.5-24.5,24.5S177,228.03,177,214.5s10.97-24.5,24.5-24.5S226,200.97,226,214.5z", Color.web("#0000FF")));
        pieces.add(new Piece(CIRCLE, "M325,235.5c0,11.87-9.63,21.5-21.5,21.5s-21.5-9.63-21.5-21.5s9.63-21.5,21.5-21.5S325,223.63,325,235.5z", Color.web("#FF00FF")));
        pieces.add(new Piece(RHOMBUS, "M341.37,325.05l-18.39,42.91l-22.61-38.59L321,276L341.37,325.05z", Color.web("#0000FF")));
        pieces.add(new Piece(CIRCLE, "M263,318.5c0,16.84-13.66,30.5-30.5,30.5S202,335.34,202,318.5s13.66-30.5,30.5-30.5S263,301.66,263,318.5z", Color.web("#FF0000")));
        pieces.add(new Piece(RHOMBUS, "M208.37,390.05l-18.39,42.91L161,393l25.89-39.61L208.37,390.05z", Color.web("#FF00FF")));
        pieces.add(new Piece(CIRCLE, "M291,394.5c0,11.32-9.18,20.5-20.5,20.5s-20.5-9.18-20.5-20.5s9.18-20.5,20.5-20.5S291,383.18,291,394.5z", Color.web("#00FFFF")));

        //show();
    }
}
