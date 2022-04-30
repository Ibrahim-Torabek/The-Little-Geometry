package Items;

import Shapes.Piece;
import javafx.scene.paint.Color;

import static Shapes.Piece.*;

/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines all 17 shapes' path and name of a flower. </p>
 * <p></p>
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class Flower extends Item {

    /**
     * This is the Constructor method of Flower class. Adding the name, paths and colors of 17 shapes.
     */
    public Flower() {
        super("Flower");
        setImagePath("Icons/flower.png");

        pieces.add(new Piece(RECTANGLE, "M233.76,340.99l-120.93-81.57l4.67-6.92l120.93,81.57L233.76,340.99z", Color.web("#00D400")));
        pieces.add(new Piece(RECTANGLE, "M305.5,390.5l-51.57,80.55l-7.02-4.5L298.48,386L305.5,390.5z", Color.web("#00D400")));
        pieces.add(new Piece(RECTANGLE, "M235.5,131.5h17v369h-17V131.5z", Color.web("#024A00")));
        pieces.add(new Piece(OVAL, "M301.23,95.23c-25.19,25.19-52.26,38.96-60.46,30.76c-8.2-8.2,5.57-35.27,30.76-60.46s52.26-38.96,60.46-30.76S326.42,70.04,301.23,95.23z", Color.web("#FF001C")));
        pieces.add(new Piece(OVAL, "M242.5,2.5c11.6,0,21,28.88,21,64.5s-9.4,64.5-21,64.5s-21-28.88-21-64.5S230.9,2.5,242.5,2.5z", Color.web("#FF001C")));
        pieces.add(new Piece(OVAL, "M150.78,38.78c8.2-8.2,35.27,5.57,60.46,30.76s38.96,52.26,30.76,60.46c-8.2,8.2-35.27-5.57-60.46-30.76S142.57,46.98,150.78,38.78z", Color.web("#FF001C")));
        pieces.add(new Piece(OVAL, "M242.5,128.5c0,11.6-28.88,21-64.5,21s-64.5-9.4-64.5-21s28.88-21,64.5-21S242.5,116.9,242.5,128.5z", Color.web("#FF001C")));
        pieces.add(new Piece(OVAL, "M183.02,164.71c25.19-25.19,52.26-38.96,60.46-30.76c8.2,8.2-5.57,35.27-30.76,60.46s-52.26,38.96-60.46,30.76C144.06,216.97,157.83,189.9,183.02,164.71z", Color.web("#FF001C")));
        pieces.add(new Piece(OVAL, "M222.98,196.94c0-35.62,9.4-64.5,21-64.5s21,28.88,21,64.5s-9.4,64.5-21,64.5S222.98,232.57,222.98,196.94z", Color.web("#FF001C")));
        pieces.add(new Piece(OVAL, "M333.48,229.17c-8.2,8.2-35.27-5.57-60.46-30.76s-38.96-52.26-30.76-60.46c8.2-8.2,35.27,5.57,60.46,30.76S341.68,220.97,333.48,229.17z", Color.web("#FF001C")));
        pieces.add(new Piece(OVAL, "M307,107.5c35.62,0,64.5,9.4,64.5,21s-28.88,21-64.5,21s-64.5-9.4-64.5-21S271.38,107.5,307,107.5z", Color.web("#FF001C")));
        pieces.add(new Piece(CIRCLE, "M290.5,128.5c0,25.96-21.04,47-47,47s-47-21.04-47-47s21.04-47,47-47S290.5,102.54,290.5,128.5z", Color.web("#0000BF")));
        pieces.add(new Piece(OVAL, "M196.4,317.07c0.86,4.08-24,12.75-55.51,19.35s-57.76,8.65-58.61,4.56s24-12.75,55.51-19.35S195.55,312.98,196.4,317.07z", Color.web("#55FF59")));
        pieces.add(new Piece(OVAL, "M126.02,206.39c4.07-0.29,8.24,11.75,9.32,26.9s-1.33,27.66-5.4,27.95c-4.07,0.29-8.24-11.75-9.32-26.9C119.54,219.2,121.96,206.68,126.02,206.39z", Color.web("#55FF59")));
        pieces.add(new Piece(OVAL, "M371.28,366.91c2.03,3.25-14.41,17.2-36.73,31.15c-22.32,13.96-42.05,22.64-44.09,19.39s14.41-17.2,36.73-31.15C349.51,372.34,369.24,363.66,371.28,366.91z", Color.web("#55FF59")));
        pieces.add(new Piece(TRIANGLE, "M234.73,421.21l-0.23,37.29l-28-70L234.73,421.21z", Color.web("#0000AA")));
        pieces.add(new Piece(TRIANGLE, "M303.64,300.25L253.5,395.7l-0.23-37.29L303.64,300.25z",Color.web("#0000AA")));

    }
}
