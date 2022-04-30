package Panes;

import Controls.MenuButton;
import Items.Item;
import Shapes.Piece;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;
import java.util.ArrayList;
import static Main.Main.*;

/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class defines a pane which extends VBox pane. It shows a shapes list in itself as Menu Button.
 * When the player select a shape, all same kind of shapes will be displayed
 * int the center of the BuildItem pane. The player can earn 5 points if they can match the same shape on the item.</p>
 * <p><b>Notes:</b> Player cannot select a shape unless they learned that shape.</p>
 *
 * @see BorderPane
 * @see Items
 * @see MenuButton
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */

public class ShapeList extends VBox {
    private double scaleX = 0;
    private double scaleY = 0;

    private double mouseX = 0;
    private double mouseY = 0;
    private Item item;

    private BorderPane mainPane;

    private Text matchedText = new Text();

    /**
     * This is the constructor method of ShapeList class. It initializes shapes buttons as shadowed MenuButton.
     * Determines if it is enable. It also defines all actions to the movable shapes which are displayed in the center.
     * @param mainPane the handle of BuildItem pane, so that put listed shapes into the BuildItemPane's center.
     * @param item the item which is displayed and needed to match. Like House item.
     */
    public ShapeList(BorderPane mainPane, Item item) {
        this.item = item;
        this.mainPane = mainPane;
        this.setPadding(new Insets(0,10,0,10));

        // List al1 11 basic shapes as Menu Button
        ArrayList<MenuButton> shapeList = new ArrayList<>();
        shapeList.add(new MenuButton(Piece.TRIANGLE,26,1));
        shapeList.add(new MenuButton(Piece.SQUARE,26,1));
        shapeList.add(new MenuButton(Piece.RECTANGLE,26,1));
        shapeList.add(new MenuButton(Piece.CIRCLE,26,1));
        shapeList.add(new MenuButton(Piece.OVAL,26,1));
        shapeList.add(new MenuButton(Piece.HEPTAGON,26,1));
        shapeList.add(new MenuButton(Piece.HEXAGON,26,1));
        shapeList.add(new MenuButton(Piece.OCTAGON,26,1));
        shapeList.add(new MenuButton(Piece.PENTAGON,26,1));
        shapeList.add(new MenuButton(Piece.TRAPEZOID,26,1));
        shapeList.add(new MenuButton(Piece.RHOMBUS,26,1));

        // Set properties and actions for each button.
        for(int i = 0; i < shapeList.size(); i++){
            // Define a Menu Button.
            MenuButton shape = shapeList.get(i);
            String shapeName = shape.getTitle();

            // set Actions if learned, or set actions to all shapes if player is in the knowledge scene.
            if(mainCharacter.getKnowledge().contains(shapeName) || item.getName() == "Shapes"){
                // Enable the learned shape.
                shape.setEnable();

                // Set all actions in getShapes method, and display appropriate shapes in the center of BuildItem pane.
                shape.addEventHandler(ActionEvent.ACTION, e -> getShapes(shapeName));
            } else shape.setDisable(); // Disable if not learn yet.

            this.getChildren().add(shape);

        }

        this.setSpacing(10);
    }

    /**
     * This method get all same pieces from an item, and display them center of BuildItem Pane.
     * @param piece needed piece that player selected
     * @return Nothing
     */
    private void getShapes(String piece) {
        ArrayList<Piece> pieces = new ArrayList<>();

        // Show a prompt text when a shape matched in knowledge part.
        matchedText.setVisible(false);

        // Get all pieces in an item (Like shapes of House)
        for(int i = 0; i < item.getPieces().size(); i++){
            Piece temp = new Piece(item.getPieces().get(i).getName(),item.getPieces().get(i).getPath());

            // get an unmatched piece which is same shape of selected shape, from an item, or all pieces if in the knowledge part.
            if(temp.getName().equals(piece) && (!item.getPieces().get(i).isMatched() || item.getName() == "Shapes")){

                temp.setScreenX(item.getPieces().get(i).localToScene(item.getPieces().get(i).getBoundsInLocal()).getMinX());
                temp.setScreenY(item.getPieces().get(i).localToScene(item.getPieces().get(i).getBoundsInLocal()).getMinY());
                pieces.add(temp);

                //temp.setContent(pathTemp);
                temp.setFill(Color.GREEN);
                temp.setStroke(Color.RED);
                temp.setCursor(Cursor.HAND);

                // set Mouse Pressed event.
                temp.setOnMousePressed(e -> {
                    // Set current location to move back if not matched.
                    scaleX = temp.getTranslateX();// - e.getX();
                    scaleY = temp.getTranslateY();// - e.getY();

                    // Get mouse position on the screen so that can move the shape with the mouse cursor.
                    mouseX = e.getScreenX();
                    mouseY = e.getScreenY();

                    // if pressed right button, rotate the shape. This is reserved event for the future.
                    if (e.getButton() == MouseButton.SECONDARY) {
                        RotateTransition rot = new RotateTransition(Duration.millis(200),temp);
                        rot.setFromAngle(temp.getRotate());
                        rot.setToAngle(temp.getRotate() + 20);
                        rot.play();
                    }

                    // Drop a shadow when selected.
                    temp.setEffect(new DropShadow(20, Color.BLACK));

                    // play clicked sound.
                    sounds.clicked();
                });

                // move the shape when mouse dragged
                temp.setOnMouseDragged(e -> {

                    temp.setTranslateX(scaleX  + e.getScreenX() - mouseX);
                    temp.setTranslateY(scaleY  + e.getScreenY() - mouseY);
               });

                // When mouse released, check if it is on the correct position.
                // If it is on the correct position, hide the moved shape, and fill the defined color of the shape in the item.
                // If it is not on the correct position, move back to its initialized position.
                temp.setOnMouseReleased(e -> {
                    // cancel the dropped shadow
                    temp.setEffect(null);

                    // check if it is on the correct position.
                    if (temp.localToScene(temp.getBoundsInLocal()).getMinX() >= temp.getScreenX() - 10 && temp.localToScene(temp.getBoundsInLocal()).getMinX() <= temp.getScreenX() + 10){

                        // seek all pieces in the item to find the matched piece.
                        for(int j = 0; j < item.getPieces().size(); j++){

                            if(temp.getPath() == item.getPieces().get(j).getPath()){
                                // hold the matched piece
                                Piece matchedPiece = item.getPieces().get(j);

                                // change the color and sroke
                                matchedPiece.setStroke(Color.GREEN);
                                matchedPiece.getStrokeDashArray().removeAll(25d,10d);
                                matchedPiece.setStrokeWidth(3);
                                matchedPiece.setFill(matchedPiece.getFillColor());

                                // set as matched piece
                                matchedPiece.setMatched(true);

                                // hide the shape came from center.
                                temp.setVisible(false);

                                // earn 5 point
                                mainCharacter.setScore(mainCharacter.getScore() + 5);

                                header.refresh();
                                sounds.release();

                                // if in the knowledge part, set the shape as learned shape, and show the matched text.
                                if(item.getName().equals("Shapes")){
                                    mainCharacter.setKnowledge(temp.getName());
                                    matchedText.setVisible(true);
                                }
                            }
                        }
                    } else {
                        // if not matched, move back to initialized position of the center.
                        temp.setTranslateX(scaleX);
                        temp.setTranslateY(scaleY);

                        sounds.error();
                    }


                });

                // if a shape already learned/matched, not move it anymore, and display the matched text
                if(item.getPieces().get(i).isMatched() && item.getName() == "Shapes"){
                    temp.setOnMousePressed(null);
                    temp.setOnMouseDragged(null);
                    temp.setOnMouseReleased(null);
                    matchedText.setVisible(true);
                }
            }
        }

        // Set two VBoxs to display movable shapes in the center.
        // If first Box has 5 children, put other shapes in second box.
        VBox vBox1 = new VBox();
        VBox vBox2 = new VBox();
        vBox1.setSpacing(5);
        vBox2.setSpacing(5);

        // If in the knowledge part, display the shapes description below the shape.
        if(item.getName() == "Shapes"){
            // We have only one shape in the knowledge part, so just get the shape in the 0 index.
            Text description = new Text(pieces.get(0).getName() + ": " + Piece.description.get(pieces.get(0).getName()));

            description.setWrappingWidth(400);
            description.setFont(Font.font(40));
            description.setFill(Color.WHITE);

            vBox1.getChildren().add(description);
        }


        for(int i = 0; i < pieces.size(); i++){
            // if the shapes more than 5, put 5 into first VBox and put others into second VBox
            if(i < 5) {
                vBox1.getChildren().add(pieces.get(i));

            }
            else
                vBox2.getChildren().add(pieces.get(i));
        }

        if(item.getName() == "Shapes"){
            // Instruction text for the player.
            Text instruction = new Text("Please move this shape to mach with the correct shape in the right side.");

            instruction.setWrappingWidth(400);
            instruction.setFont(Font.font(30));
            instruction.setFill(Color.BLUE);

            matchedText.setText("Well done, you just released " + pieces.get(0).getName() + ". You can use it in your game now on.");
            matchedText.setWrappingWidth(400);
            matchedText.setFont(Font.font(20));
            matchedText.setFill(Color.RED);
            //matchedText.setVisible(false);


            vBox1.getChildren().addAll(instruction,matchedText);
        }


        HBox hBox = new HBox();
        hBox.getChildren().addAll(vBox1,vBox2);
        hBox.setSpacing(5);

        // set two VBoxs into the center of the BuildItem Pane.
        mainPane.setCenter(hBox);
    }
}
