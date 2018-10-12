import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;

public class BigFrame extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello World"); // Top of the page

        Label HelloWorldLabel = new Label("Hello World"); // Text  or content inside
        Scene scene = new Scene(HelloWorldLabel,  400, 400);// The size of the label

        primaryStage.setScene(scene); // Produce it
        primaryStage.setResizable(false); // Unable the function of changing size of the window
        primaryStage.show(); // Make it visible
    }
    public static void main(String[] args) {
        Application.launch(args); // Starts it
    }

}