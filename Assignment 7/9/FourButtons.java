import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class FourButtons extends Application {

    @FXML 
    private FlowPane root; //import variable from FXML file
    public void handleButtonAction(ActionEvent event) { // the function has the control of the color
    root.setStyle("-fx-background-color: #d61919;");
    }

    public void betterButtonAction(ActionEvent actionEvent) { // the function has the control of the color
    root.setStyle("-fx-background-color: #00ff22;");
    }
    public void link(ActionEvent actionEvent) {
    getHostServices().showDocument("https://www.youtube.com/watch?v=dQw4w9WgXcQ"); // the function directs to the browser
    }
    public void eternity(ActionEvent actionEvent) {
    getHostServices().showDocument("https://www.youtube.com/watch?v=2Hr7Mszq9TA"); // the function directs to the browser
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = FourButtons.class.getResource("core.fxml"); // import fxml

        primaryStage.setTitle("ayyy lmao"); // title
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(fxmlURL);
        FlowPane flowpane = loader.load();

        Scene scene = new Scene(flowpane); // make scene
        primaryStage.setScene(scene); // make scene
        primaryStage.show(); // show scene
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}