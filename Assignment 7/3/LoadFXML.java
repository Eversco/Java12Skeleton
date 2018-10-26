import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.net.URL;

public class LoadFXML extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = LoadFXML.class.getResource("design.fxml"); // import from fxml file

        primaryStage.setTitle("Tester Bester"); // title of the window
        FXMLLoader loader = new FXMLLoader(); 
        loader.setLocation(fxmlURL);
        VBox vbox = loader.load();

        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene); // shows window
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}