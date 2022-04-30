package Items;

import Shapes.Piece;
import javafx.scene.paint.Color;

import static Shapes.Piece.*;

/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines all 11 shapes' path and name of a butterfly. </p>
 * <p></p>
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class Butterfly extends Item {

    /**
     * This is the Constructor method of Butterfly class. Adding the name, paths and colors of 11 shapes.
     */
    public Butterfly() {
        super("Butterfly");
        setImagePath("Icons/Butterfly.png");

        pieces.add(new Piece(RECTANGLE, "M242.61,119.72l-5.28-4.3l76.85-92.15l5.28,4.3L242.61,119.72z", Color.web("#E96F00")));
        pieces.add(new Piece(RECTANGLE, "M153.61,27.93l5.28-4.3l76.85,92.15l-5.28,4.3L153.61,27.93z", Color.web("#E96F00")));
        pieces.add(new Piece(OVAL, "M249.92,301.7c0,109.52-6.12,198.3-13.67,198.3s-13.67-88.78-13.67-198.3s6.12-198.3,13.67-198.3S249.92,192.18,249.92,301.7z",  Color.web("#C96600")));
        pieces.add(new Piece(CIRCLE, "M222.58,207.62c0,51.96-38.52,94.08-86.04,94.08S50.5,259.58,50.5,207.62s38.52-94.08,86.04-94.08S222.58,155.66,222.58,207.62z",  Color.web("#2000BF")));
        pieces.add(new Piece(CIRCLE, "M222.58,364.23c0,34.54-31.38,62.53-70.08,62.53s-70.08-28-70.08-62.53s31.38-62.53,70.08-62.53S222.58,329.7,222.58,364.23z", Color.web("#0065B4")));
        pieces.add(new Piece(CIRCLE, "M335.96,113.54c47.52,0,86.04,42.12,86.04,94.08s-38.52,94.08-86.04,94.08s-86.04-42.12-86.04-94.08S288.45,113.54,335.96,113.54z",  Color.web("#2000BF")));
        pieces.add(new Piece(CIRCLE, "M320.01,301.7c38.71,0,70.08,28,70.08,62.53s-31.38,62.53-70.08,62.53s-70.08-28-70.08-62.53S281.3,301.7,320.01,301.7z",  Color.web("#0065B4")));
        pieces.add(new Piece(CIRCLE, "M161.2,17.83c0,6.53-5.36,11.83-11.97,11.83s-11.97-5.3-11.97-11.83S142.63,6,149.24,6S161.2,11.3,161.2,17.83z", Color.web("#FF00FB")));
        pieces.add(new Piece(CIRCLE, "M335.37,17.83c0,6.53-5.36,11.83-11.97,11.83s-11.97-5.3-11.97-11.83S316.8,6,323.4,6S335.37,11.3,335.37,17.83z",  Color.web("#FF00FB")));
        pieces.add(new Piece(CIRCLE, "M158.76,136.08c23.29,0,42.16,18.66,42.16,41.69s-18.88,41.69-42.16,41.69s-42.16-18.66-42.16-41.69S135.47,136.08,158.76,136.08z",  Color.web("#FF0ACB")));
        pieces.add(new Piece(CIRCLE, "M309.18,140.58c23.29,0,42.16,18.66,42.16,41.69s-18.88,41.69-42.16,41.69s-42.16-18.66-42.16-41.69S285.9,140.58,309.18,140.58z",  Color.web("#FF0ACB")));
    }
}
