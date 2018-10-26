import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import java.net.URL;
import javafx.event.ActionEvent;

public class ExtendedButton extends Application {

    public void handleButtonAction(ActionEvent event) { // button
        System.out.println("aaaa"); // text on button
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = ExtendedButton.class.getResource("yo.fxml"); // import

        primaryStage.setTitle("ayyy lmao");
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(fxmlURL);
        FlowPane flowpane = loader.load(); // replace vbox

        Scene scene = new Scene(flowpane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}