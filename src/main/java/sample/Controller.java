package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;

public class Controller {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="tRotateRight"
    private Button tRotateRight; // Value injected by FXMLLoader

    @FXML // fx:id="lightY"
    private TextField lightY; // Value injected by FXMLLoader

    @FXML // fx:id="shapesPlayground"
    private Region shapesPlayground; // Value injected by FXMLLoader

    @FXML // fx:id="lightX"
    private TextField lightX; // Value injected by FXMLLoader

    @FXML // fx:id="fStretchDown"
    private Button fStretchDown; // Value injected by FXMLLoader

    @FXML // fx:id="lightZ"
    private TextField lightZ; // Value injected by FXMLLoader

    @FXML // fx:id="sStretchUp"
    private Button sStretchUp; // Value injected by FXMLLoader

    @FXML // fx:id="tStretchDown"
    private Button tStretchDown; // Value injected by FXMLLoader

    @FXML // fx:id="tRotateLeft"
    private Button tRotateLeft; // Value injected by FXMLLoader

    @FXML // fx:id="fRotateRight"
    private Button fRotateRight; // Value injected by FXMLLoader

    @FXML // fx:id="sRotateLeft"
    private Button sRotateLeft; // Value injected by FXMLLoader

    @FXML // fx:id="sRotateRight"
    private Button sRotateRight; // Value injected by FXMLLoader

    @FXML // fx:id="fRotateLeft"
    private Button fRotateLeft; // Value injected by FXMLLoader

    @FXML // fx:id="sStretchDown"
    private Button sStretchDown; // Value injected by FXMLLoader

    @FXML // fx:id="fStretchUp"
    private Button fStretchUp; // Value injected by FXMLLoader

    @FXML // fx:id="tStretchUp"
    private Button tStretchUp; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert tRotateRight != null : "fx:id=\"tRotateRight\" was not injected: check your FXML file 'scene.fxml'.";
        assert lightY != null : "fx:id=\"lightY\" was not injected: check your FXML file 'scene.fxml'.";
        assert shapesPlayground != null : "fx:id=\"shapesPlayground\" was not injected: check your FXML file 'scene.fxml'.";
        assert lightX != null : "fx:id=\"lightX\" was not injected: check your FXML file 'scene.fxml'.";
        assert fStretchDown != null : "fx:id=\"fStretchDown\" was not injected: check your FXML file 'scene.fxml'.";
        assert lightZ != null : "fx:id=\"lightZ\" was not injected: check your FXML file 'scene.fxml'.";
        assert sStretchUp != null : "fx:id=\"sStretchUp\" was not injected: check your FXML file 'scene.fxml'.";
        assert tStretchDown != null : "fx:id=\"tStretchDown\" was not injected: check your FXML file 'scene.fxml'.";
        assert tRotateLeft != null : "fx:id=\"tRotateLeft\" was not injected: check your FXML file 'scene.fxml'.";
        assert fRotateRight != null : "fx:id=\"fRotateRight\" was not injected: check your FXML file 'scene.fxml'.";
        assert sRotateLeft != null : "fx:id=\"sRotateLeft\" was not injected: check your FXML file 'scene.fxml'.";
        assert sRotateRight != null : "fx:id=\"sRotateRight\" was not injected: check your FXML file 'scene.fxml'.";
        assert fRotateLeft != null : "fx:id=\"fRotateLeft\" was not injected: check your FXML file 'scene.fxml'.";
        assert sStretchDown != null : "fx:id=\"sStretchDown\" was not injected: check your FXML file 'scene.fxml'.";
        assert fStretchUp != null : "fx:id=\"fStretchUp\" was not injected: check your FXML file 'scene.fxml'.";
        assert tStretchUp != null : "fx:id=\"tStretchUp\" was not injected: check your FXML file 'scene.fxml'.";

    }
}
