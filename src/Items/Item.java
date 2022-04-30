package Items;

import Shapes.Piece;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.SVGPath;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines an item. include the item name, SVG path how many pieces it has and image path if an item has an icon.  </p>
 * <p></p>
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class Item extends Pane implements Serializable {
    private String name;
    private String imagePath;
    private int finishedPieces = 0;
    ArrayList<Piece> pieces = new ArrayList<>();
    ArrayList<SVGPath> svgPaths = new ArrayList<>();

    /**
     * The constructor of Item class. sets the name of an item, like car, house etc.
     * @param name
     */
    public Item(String name) {
        this.name = name;
    }

    /**
     * The constructor of Item class. initialize the name, image path, pieces.
     * @param item an Instantiate item.
     */
    public Item(Item item){
        this.name = item.getName();
        this.imagePath = item.getImagePath();
        this.finishedPieces = item.finishedPieces;
        this.pieces = item.pieces;

    }


    /**
     * This method will show pieces on the pane.
     * <p>Show each piece and determine colored or not colored.</p>
     * <p>If a piece is matched , fill with defined color; Otherwise, don't fill, and set dashed red stroke.</p>
     */
    public void show(){

        for(Piece piece: this.getPieces()){

            // If already matched piece, fill with defined color.
            // Otherwise, don't fill, and set dashed red stroke.
            if(piece.isMatched()){
                piece.setFill(piece.getFillColor());
                piece.setStroke(Color.GREEN);
            } else {
                piece.setFill(null);
                piece.setStroke(Color.RED);
                piece.getStrokeDashArray().addAll(25d, 10d);
            }
            this.getChildren().add(piece);
            piece.setScreenX(piece.localToScene(piece.getBoundsInLocal()).getMinX());
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getFinishedPieces() {
        return finishedPieces;
    }

    public void setFinishedPieces(int finishedPieces) {
        this.finishedPieces = finishedPieces;
    }

}
