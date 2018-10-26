import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import java.net.URL;
import javafx.event.ActionEvent;

public class BackgroundChangeButton extends Application {


    
    @FXML //Decorator
    private FlowPane root; //transporting variable from fxml. Which is root
    public void handleButtonAction(ActionEvent event) { // button for changing colour. It holds the control of what happens being pressed
        root.setStyle("-fx-background-color: #5b71d6;");
    }
    @Override
    public void start(Stage primaryStage) throws Exception { // The rest of them are repeated codes throughout the assignment
        URL fxmlURL = BackgroundChangeButton.class.getResource("hsu.fxml");

        primaryStage.setTitle("ayyy lmao");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(fxmlURL);
        FlowPane flowpane = loader.load();

        Scene scene = new Scene(flowpane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
