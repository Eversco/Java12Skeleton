import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class TestJavaFXApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("My First JavaFX App"); // title of the window

        Label label = new Label("Hello World, JavaFX !");
        Scene scene = new Scene(label, 200, 100); // print the label set the size
        primaryStage.setScene(scene); //makes the scene

        primaryStage.show(); // shows the scene
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}