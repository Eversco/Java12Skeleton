import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import java.net.URL;
import javafx.event.ActionEvent;

public class ButtonQuitter extends Application {
    public void handleButtonAction(ActionEvent event) { // holds the control of button. The system would be shut down once it's pressed.
    System.exit(0);
    }
    @Override
    public void start(Stage primaryStage) throws Exception { // repeated codes
        URL fxmlURL = ButtonQuitter.class.getResource("Xu.fxml");

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