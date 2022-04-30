package Controls;


import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;

/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class define a Button that have a shadow. </p>
 * <p>
 * <b>Note:</b> The button will appear a shadow when the mouse move in and enabled.
 * <p><b>title</b>: Button text.</p>
 * <p><b>shadow</b>: The shadow of button. this is a rectangle shape.</p>
 * <p><b>radios</b>: Curved radios of button</p>
 * <p><b>deep</b>: The shadow depth </p>
 * <p><b>enabled</b>: define if the button enabled. It will be disabled until the player learn a related shape.</p>
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class MenuButton extends StackPane {
    private Button title = new Button();
    private Rectangle border = new Rectangle();
    private Rectangle shadow = new Rectangle();
    private int radios;
    private int deep;
    private double test;
    private boolean enabled = true;

    /**
     * This method is the constructor method of MenuButton Class. It will set all properties and
     * all action like mouse in and out.
     * <p><b>radios</b>: initialized as 25</p>
     * <p><b>deep</b>: initialized as 15</p>
     * @param menuTitle is the button text of the menu button.
     * @param size is the font size of the menu button.
     * @param height is the height of the menu button.
     * @return Nothing.
     */
    public MenuButton(String menuTitle, int size, int height) {
        radios = 25;
        deep = 15;
        test = title.getBoundsInLocal().getHeight();

        title.setText(menuTitle);
        title.setFont(Font.font(size));

        setAction();

        this.getChildren().addAll(shadow,title);


    }

    public void setEnable(){
        enabled = true;
        setAction();
    }

    public void setDisable(){
        enabled = false;
        setAction();
    }

    /**
     * This method define Mouse Entered and Mouse Exited action.
     * <p>Show the shadow when mouse entered.</p>
     * <p>Hide the shadow when mouse exited.</p>
     */
    private void setAction(){
        // set actions if enable.
        if(enabled){
            title.setBackground(new Background(
                    new BackgroundFill(Color.BLUE, new CornerRadii(radios), Insets.EMPTY)
            ));


            // Drop a shadow when mouse entered
            this.setOnMouseEntered(e -> {
                shadow.setWidth(title.getWidth());
                shadow.setHeight(title.getHeight());
                shadow.setArcWidth(radios * 2);
                shadow.setArcHeight(radios * 2);

                title.setTranslateX(title.getTranslateX() - deep);
                title.setTranslateY(title.getTranslateY() - deep);
            });
            // Hide the shadow when exit
            this.setOnMouseExited(e -> {
                title.setTranslateX(title.getTranslateX() + deep);
                title.setTranslateY(title.getTranslateY() + deep);
            });
        } else {
            title.setBackground(new Background(
                    new BackgroundFill(Color.GRAY, new CornerRadii(radios), Insets.EMPTY)
            ));


            this.setOnMouseEntered(null);
            this.setOnMouseExited(null);

        }
    }

    public String getTitle() {
        return title.getText();
    }
}
