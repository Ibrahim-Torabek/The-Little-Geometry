package Items;

import Shapes.Piece;
import javafx.scene.Cursor;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;

import java.util.ArrayList;

import static Shapes.Piece.*;

/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines all 12 shapes' path and name of a house. </p>
 * <p></p>
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class House extends Item {

    public House(Item item){
        super(item);
        show();
    }

    /**
     * This is the Constructor method of House class. Adding the name, paths and colors of 12 shapes.
     */
    public House() {
        super("House");
        setImagePath("Icons/house.png");

        pieces.add(new Piece(TRIANGLE, "M456,137.5H42l207-133L456,137.5z",Color.RED));
        pieces.add(new Piece(SQUARE, "M432.5,500.5h-363v-363h363V500.5z",Color.PINK));
        pieces.add(new Piece(RECTANGLE, "M250.5,500.5h-151v-302h151V500.5z",Color.PURPLE));
        pieces.add(new Piece(RECTANGLE, "M172.5,274.5h-40v-52h40V274.5z",Color.WHITESMOKE));
        pieces.add(new Piece(RECTANGLE, "M212.5,274.5h-40v-52h40V274.5z",Color.WHITESMOKE));
        pieces.add(new Piece(RECTANGLE, "M172.5,326.5h-40v-52h40V326.5z",Color.WHITESMOKE));
        pieces.add(new Piece(RECTANGLE, "M212.5,326.5h-40v-52h40V326.5z",Color.WHITESMOKE));
        pieces.add(new Piece(CIRCLE, "M133.5,377c0,6.35-5.15,11.5-11.5,11.5s-11.5-5.15-11.5-11.5s5.15-11.5,11.5-11.5S133.5,370.65,133.5,377z",Color.BLUE));
        pieces.add(new Piece(SQUARE, "M344.5,240.5h-67v-67h67V240.5z",Color.WHITESMOKE));
        pieces.add(new Piece(SQUARE, "M344.5,307.5h-67v-67h67V307.5z",Color.WHITESMOKE));
        pieces.add(new Piece(SQUARE, "M411.5,240.5h-67v-67h67V240.5z",Color.WHITESMOKE));
        pieces.add(new Piece(SQUARE, "M411.5,307.5h-67v-67h67V307.5z",Color.WHITESMOKE));

    }


}
