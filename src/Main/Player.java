package Main;

import Items.Item;
import Shapes.Piece;
import javafx.scene.image.Image;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * <h1>The Little Geometrist!</h1>
 * <h2>Java Project of MAD200 Course</h2>
 * <p>This class will define a player/user. It include name, avatar picture path.
 * age, score, Inventory, knowledge etc.</p>
 *
 * <b>knowledge</b> saves shapes' name which player learned, and prepare  to play.
 * <b>Inventory</b> saves the completed shapes in game part
 *
 * @author  Ibrahim Osman, Elena Polyakova
 * @version 1.0
 * @since   2020-04-07
 *
 */
public class Player implements Serializable {
    final public static int BOY = 1;
    final public static int GIRL = 2;
    final public static int UNKNOWN = 3;

    private String name;
    //private Image avatarImage;
    private String avatarPath;
    private int age;
    private int score;
    private int gender;
    ArrayList<Item> Inventory = new ArrayList<>();
    ArrayList<String> knowledge = new ArrayList<>();

    /**
     * <h2>Constructor of Player class</h2>
     * <p><b>Initialize</b> name: Player 1,age=0, avatar=boy1, score=0. </p>
     */
    public Player() {
        name = "Player 1";
        //avatarImage = new Image("Images/avatars/boy1.png");
        avatarPath = "Images/avatars/boy1.png";
        score = 0;
        gender = UNKNOWN;
        age = 7;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public ArrayList<Item> getInventory() {
        return Inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        Inventory = inventory;
    }

    public ArrayList<String> getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(String knowledge) {
        this.knowledge.add(knowledge);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAvatarPath() {
        return avatarPath;
    }

    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }
}
