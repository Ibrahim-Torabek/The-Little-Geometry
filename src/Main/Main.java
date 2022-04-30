package Main;

import Items.*;
import Panes.Footer;
import Panes.Header;
import Scenes.*;
import Shapes.Piece;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;


/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>The purpose of this application is to teach geometry in a game,
 * mainly for the first grade students. The most basic function is
 * to introduce various geometric shapes. Students will be familiar
 * with their shapes and names by matching various geometric images</p>
 * <p>This game is divided into two parts, one is the introduction part
 * and the other is the game part.After the students have finished
 * learning a shape in the introduction part, they can use it in the game part.</p>
 * <p>
 * <b>Note:</b> Giving proper comments in your program makes it more
 * user friendly and it is assumed as a high quality code.
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 */
public class Main extends Application {
    public static Stage mainStage;
    public static String gameTitle = "The Little Geometrist";
    public static int gameWidth = 1080;
    public static int gameHeight = 900;
    public static Background blankBackGround = new Background(new BackgroundImage(new Image("Images/Backblank.jpg"), BackgroundRepeat.REPEAT ,BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,BackgroundSize.DEFAULT));

    // Path uses for return.
    public static ArrayList<Scene> scenePath = new ArrayList<>();
    public static int scenePathInt = 0;

    // Settings and character
    public static Player mainCharacter = new Player();
    public static Settings mainSettings = new Settings();
    public static ArrayList<Item> items = new ArrayList<>();
    public static String characterLocation = "character.dat";
    public static String settingsLocation = "settings.dat";

    // Sound effects, include background music
    public static Sounds sounds = new Sounds();

    // Header and footer will appear all scenes but welcome and exit scenes.
    public static Header header= new Header();
    public static Footer footer = new Footer();

    /**
     * This is the main method which makes use of load the application.
     * @param args Unused.
     * @return Nothing.
     */
    public static void main(String[] args) {
        Application.launch();
    }

    /**
     * This is the override start method which makes use start the game.
     * @param primaryStage to use show the window..
     * @return Nothing.
     * @exception Exception .
     * @see Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        mainStage = primaryStage;
        mainStage.setScene(new WelcomeScene());
        mainStage.setTitle(gameTitle);
        mainStage.show();

        // Load saved settings.
        mainSettings = loadSettings();

        // Refresh header due to the loaded settings working.
        header.refresh();

        // Items not worked when load them. So, create new items and restore the values of them in character loading part.
        items.add(new House());
        items.add(new Car());
        items.add(new Tree());
        items.add(new Robot());
        items.add(new Flower());
        items.add(new Butterfly());
        items.add(new AllShapes());

        // Load character values, as name, age, score, knowledge and finished parts.
        mainCharacter = loadCharacter(items);

    }

    /**
     * This is save method to save main characters information when exit the game.
     * @return Nothing.
     * @see Player
     * @see Item
     */
    public static void saveCharacter(){
        mainCharacter.setInventory(items);
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(characterLocation)
            );

            out.writeObject(mainCharacter);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * saveSettings function
     * This function will save Settings class. Normally call it when program exit.
     * @see Settings
     */
    public static void saveSettings(){
        try {
            ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(settingsLocation)
            );

            out.writeObject(mainSettings);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *  This method load main character's information include name, age
     *  score, learned knowledge and completed shapes.
     * @param itemList will get all shapes' information from the loaded file
     * @return a main character object witch is defined in Player class
     * @see Player
     * @see Item
     */
    public static Player loadCharacter(ArrayList<Item> itemList){
        Player mainCh = new Player();
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(characterLocation));
            mainCh = (Player) in.readObject();

            // Copy all values from inventory to items.
            for(int i = 0; i < itemList.size(); i++){
                Item inventorItem = mainCh.getInventory().get(i);
                Item item = itemList.get(i);

                item.setFinishedPieces(inventorItem.getFinishedPieces());

                for(int j = 0; j < item.getPieces().size(); j++){
                    item.getPieces().get(j).setMatched(inventorItem.getPieces().get(j).isMatched());

                }

                // Show item when it ready.
                item.show();
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return mainCh;
    }

    /**
     *  This method load settings information include turn On/Off background music, Volume of background music.
     *
     * @return a Settings object witch is defined in Settings class
     * @see Settings
     */
    public static Settings loadSettings(){
        Settings mainSt = new Settings();
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(settingsLocation));
            mainSt = (Settings) in.readObject();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return mainSt;
    }


}
