package Items;

import Shapes.Piece;
import javafx.scene.paint.Color;

import static Shapes.Piece.*;

/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines all 11 basic shapes' path, include Triangle, Circle, Rectangle ,etc. </p>
 * <p></p>
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class AllShapes extends Item {
    /**
     * This is the Constructor method of AllShapes class. Adding the paths and colors of 11 shapes.
     */
    public AllShapes() {
        super("Shapes");
        pieces.add(new Piece(TRIANGLE, "M9.82,96.5l48-89l48,89H9.82z", Color.WHITESMOKE));
        pieces.add(new Piece(CIRCLE, "M304.32,175.11c0,27.34-22.16,49.5-49.5,49.5s-49.5-22.16-49.5-49.5s22.16-49.5,49.5-49.5S304.32,147.77,304.32,175.11z", Color.BLUE));
        pieces.add(new Piece(HEPTAGON, "M372.8,106.5l-42.1,0.1l-26.18-32.74l9.46-40.92l37.97-18.29l37.89,18.11l9.28,40.88L372.8,106.5z", Color.RED));
        pieces.add(new Piece(HEXAGON, "M182.57,460.89l-22.25-38.77l22.25-38.78h44.5l22.25,38.78l-22.25,38.77H182.57z", Color.DARKCYAN));
        pieces.add(new Piece(OCTAGON, "M489.5,427.03v38.94l-28.12,27.53h-39.76l-28.12-27.53v-38.94l28.12-27.53h39.76L489.5,427.03z", Color.BLACK));
        pieces.add(new Piece(OVAL, "M67.82,388.13c26.79,0,48.5,12.97,48.5,28.98c0,16.01-21.71,28.98-48.5,28.98s-48.5-12.97-48.5-28.98C19.32,401.1,41.03,388.13,67.82,388.13z", Color.INDIGO));
        pieces.add(new Piece(PENTAGON, "M319.82,265.5l48,33.99l-18.33,55.01h-59.33l-18.34-55.01L319.82,265.5z", Color.FUCHSIA));
        pieces.add(new Piece(RECTANGLE, "M433.5,132.5h36v95h-36V132.5z", Color.LIME));
        pieces.add(new Piece(SQUARE, "M145.04,265.11H54.61v-94h90.43V265.11z", Color.CHARTREUSE));
        pieces.add(new Piece(RHOMBUS, "M368,540l-43,63l-42-63l42-62L368,540z", Color.DIMGREY));
        pieces.add(new Piece(TRAPEZOID, "M213,513.5l19.5,100H55l18-100H213z", Color.GOLD));

    }
}
