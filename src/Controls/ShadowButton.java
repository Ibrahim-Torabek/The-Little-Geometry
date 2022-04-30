package Controls;


import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;


/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class define an Image Button that have a shadow. The shadow will be displayed when mouse entered.</p>
 * <p>
 * <b>Note:</b> The image button will appear a shadow when the mouse move in.
 * <p><b>buttonImage</b>: hold an image.</p>
 * <p><b>height</b>: The image height.</p>
 * <p><b>width</b>: The image width.</p>
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class ShadowButton extends StackPane {
    private ImageView buttonImage;
    private int height;
    private int width;

    /**
     * The Constructor method of ShadowButton class.
     * <p>Initialize the shadow button with image.</p> define Mouse Entered and Mouse Exited actions.
     * @param imagePath the path of an image which show in the button.
     * @param width the image width
     * @param height the image height.
     */
    public ShadowButton(String imagePath, int width, int height) {
        Rectangle border = new Rectangle();

        this.buttonImage = new ImageView(new Image(imagePath));
        this.width = width;
        this.height = height;


        this.buttonImage.setFitHeight(this.height);
        this.buttonImage.setFitWidth(this.width);

        border.setFill(Color.TRANSPARENT);
        border.setHeight(this.height + 30);
        border.setWidth(this.width + 30);

        this.setOnMouseEntered(e -> {
            this.buttonImage.setEffect(new DropShadow(this.height > this.width ? this.height : this.width, Color.BLACK));

        });

        this.setOnMouseExited(e -> {
            this.buttonImage.setEffect(null);
        });

        this.getChildren().addAll(this.buttonImage, border);
    }
    /**
     * The Constructor method of ShadowButton class.
     * <p>Initialize the shadow button with image and text.</p> define Mouse Entered and Mouse Exited actions.
     *
     * @param title the text in the button.
     * @param imagePath the path of an image which show in the button.
     * @param width the image width
     * @param height the image height.
     */

    public ShadowButton(String title, String imagePath, int width, int height){
        Rectangle border = new Rectangle();

        this.buttonImage = new ImageView(new Image(imagePath));
        this.width = width;
        this.height = height;


        this.buttonImage.setFitHeight(this.height);
        this.buttonImage.setFitWidth(this.width);

        border.setFill(Color.TRANSPARENT);

        this.setOnMouseEntered(e -> {
            this.buttonImage.setEffect(new DropShadow(50, Color.BLACK));
        });

        this.setOnMouseExited(e -> {
            this.buttonImage.setEffect(null);
        });

        Label text = new Label(title);

        // Set the text size as the width / 5.
        text.setFont(Font.font(this.width / 5));
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(this.buttonImage,text);

        this.getChildren().addAll(vBox);
    }

}
