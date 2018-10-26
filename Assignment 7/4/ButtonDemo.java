import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.net.URL;

public class ButtonDemo extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = ButtonDemo.class.getResource("yeet.fxml"); // import fxml

        primaryStage.setTitle("ayyy lmao"); // title
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(fxmlURL);
        VBox vbox = loader.load();

        Scene scene = new Scene(vbox); // make scene
        primaryStage.setScene(scene); // make scene
        primaryStage.show(); // show scene
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}