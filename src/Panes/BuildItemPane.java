package Panes;

import Items.Item;
import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;
import static Main.Main.*;

/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines a pane which extends BorderPane. It shows a shapes list in the left side,
 * and shows an item's picture in the right side. When the player select a shape, all same kind of shapes will be displayed
 * int the center of the pane. The player can earn 5 points if they can match the same shape on the item.
 * Both left and center are designed by ShapeList class.</p>
 * <p><b>Notes:</b> Player cannot select a shape unless they learned that shape.</p>
 *
 * @see BorderPane
 * @see Items
 * @see ShapeList
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */

public class BuildItemPane extends BorderPane {
    /**
     * This is the constructor method of BuildItemPane class. It initializes right side and define a new ShapeList object to
     * display shape lists.
     */
    public BuildItemPane(Item item) {

        this.setBackground(blankBackGround);
        this.setTop(header);
        this.setBottom(footer);


        this.setRight(item);

        this.setPadding(new Insets(0,10,0,0));

        ShapeList shapes = new ShapeList(this,item);

        this.setLeft(shapes);


    }
}
