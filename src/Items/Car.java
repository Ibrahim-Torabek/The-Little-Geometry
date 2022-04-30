package Items;

import Shapes.Piece;
import javafx.scene.paint.Color;

import static Shapes.Piece.*;

/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines all 9 shapes' path and name of a car. </p>
 * <p></p>
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class Car extends Item {

    /**
     * This is the Constructor method of Car class. Adding the name, paths and colors of 9 shapes.
     */
    public Car() {
        super("Car");
        setImagePath("Icons/car.png");
        pieces.add(new Piece(TRAPEZOID, "M61.97,152h179.66l65.73,80.67H22.53L61.97,152L61.97,152z",Color.web("#0000BF")));
        pieces.add(new Piece(TRAPEZOID, "M136.46,173.51v43.02H57.58l21.91-43.02H136.46z",Color.web("#15FFFB")));
        pieces.add(new Piece(TRAPEZOID, "M219.72,168.13l30.67,53.78h-96.4v-53.78H219.72z",Color.web("#15FFFB")));
        pieces.add(new Piece(TRAPEZOID, "M241.63,168.13l43.82,53.78h-17.53l-35.06-53.78H241.63z",Color.web("#15FFFB")));
        pieces.add(new Piece(PENTAGON, "M5,232.67h302.36l83.26,43.02l4.38,64.53H5V232.67z",Color.web("#0000BF")));
        pieces.add(new Piece(CIRCLE,"M114.55,340.22c0,29.7-19.62,53.78-43.82,53.78s-43.82-24.08-43.82-53.78s19.62-53.78,43.82-53.78S114.55,310.52,114.55,340.22z" , Color.web("#000000")));
        pieces.add(new Piece(CIRCLE,"M101.4,340.22c0,20.79-13.73,37.64-30.67,37.64s-30.67-16.85-30.67-37.64c0-20.79,13.73-37.64,30.67-37.64S101.4,319.43,101.4,340.22z" , Color.web("#FFFFFF")));
        pieces.add(new Piece(CIRCLE, "M368.71,340.22c0,29.7-19.62,53.78-43.82,53.78s-43.82-24.08-43.82-53.78s19.62-53.78,43.82-53.78S368.71,310.52,368.71,340.22z", Color.web("#000000")));
        pieces.add(new Piece(CIRCLE, "M355.56,340.22c0,20.79-13.73,37.64-30.67,37.64c-16.94,0-30.67-16.85-30.67-37.64c0-20.79,13.73-37.64,30.67-37.64C341.83,302.58,355.56,319.43,355.56,340.22z", Color.web("#FFFFFF")));

    }
}
