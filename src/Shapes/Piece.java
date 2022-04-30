package Shapes;

import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;


/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines a pane which extends SVGPath. It defines all shapes in the game. It defines shapes' name as constants.
 * Also defines all shapes descriptions as HashMap. It defines path and fill color of a shape.</p>
 *
 * @see SVGPath
 * @see HashMap
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class Piece extends SVGPath implements Serializable {
    final public static String POLYGON = "Polygon";
    final public static String RECTANGLE = "Rectangle";
    final public static String TRIANGLE = "Triangle";
    final public static String CIRCLE = "Circle";
    final public static String SQUARE = "Square";
    final public static String HEXAGON = "Hexagon";
    final public static String OVAL = "Oval";
    final public static String HEPTAGON = "Heptagon";
    final public static String OCTAGON = "Octagon";
    final public static String PENTAGON = "Pentagon";
    final public static String TRAPEZOID = "Trapezoid";
    final public static String RHOMBUS = "Rhombus";

    final public static Map<String,String> description;
    static{
        description = new HashMap<>();
        description.put(RECTANGLE,"A shape with 4 sides and 4 points. Two of opposite sides have the same length.");
        description.put(TRIANGLE,"A shape with 3 sides and 3 points. ");
        description.put(CIRCLE,"A shape that is made up of a curved line. It's round.");
        description.put(SQUARE,"A shape with 4 equal sides and 4 points.");
        description.put(HEXAGON,"A shape with 6 sides");
        description.put(OVAL,"A shape that is made up of a curved line and looks like an egg.");
        description.put(HEPTAGON,"A shape with 7 sides");
        description.put(OCTAGON,"A shape with 8 sides.");
        description.put(PENTAGON,"A shape with 5 sides.");
        description.put(TRAPEZOID,"A shape with 4 sides. Two of them are parallel.");
        description.put(RHOMBUS,"A shape with 4 sides, 4 points and 4 equal sides. It looks like a diamond. ");
    }

    private String name;
    private String path;
    private double screenX;
    private double screenY;

    private String fillColor = "";
    private long fillLongColor = 0;

    private boolean matched = false;

    /**
     * This method is constructor method of the Piece class. it defines name and path, and initialize an SVGPath.
     * @param name name of a shape, as Triangle
     * @param path path string of a shape, sets the content of the SVGPath.
     */
    public Piece(String name, String path) {
        this.name = name;
        this.path = path;

        this.setContent(path);
    }

    /**
     * This method is constructor method of the Piece class. it defines name and path, and initialize an SVGPath.
     * @param name name of a shape, as Triangle
     * @param path path string of a shape, sets the content of the SVGPath.
     * @param fillColor define the fill color as Color of a shape
     */
    public Piece(String name, String path, Color fillColor) {
        this.name = name;
        this.path = path;
        this.fillColor = String.valueOf(fillColor);

        this.setContent(path);
    }

    /**
     * This method is constructor method of the Piece class. it defines name and path, and initialize an SVGPath.
     * @param name name of a shape, as Triangle
     * @param path path string of a shape, sets the content of the SVGPath.
     * @param fillColor define the fill color as long of a shape
     */
    public Piece(String name, String path, long fillColor) {
        this.name = name;
        this.path = path;
        this.fillLongColor = fillColor;
        this.setContent(path);
    }


    public double getScreenX() {
        return screenX;
    }

    public void setScreenX(double screenX) {
        this.screenX = screenX;
    }

    public double getScreenY() {
        return screenY;
    }

    public void setScreenY(double screenY) {
        this.screenY = screenY;
    }

    public String getName() {
        return name;
    }

    public String getPath() {
        return path;
    }

    public boolean isMatched() {
        return matched;
    }

    public void setMatched(boolean matched) {
        this.matched = matched;
    }

    public Color getFillColor() {
        return Color.valueOf(fillColor);
    }

}
