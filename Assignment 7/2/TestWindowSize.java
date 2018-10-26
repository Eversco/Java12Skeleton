import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class TestWindowSize extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        int x = 200; // set original size
        int y = 100;
        for (int i = 0; i < 500; i++) { // loop. Mainly for increaing the value
            primaryStage.setTitle("My First JavaFX App");
            Label label = new Label("Hello World, JavaFX !");
            Scene scene = new Scene(label, x, y); // declared variable as width and height
            primaryStage.setScene(scene);
            primaryStage.show();

            x++; // Increase the value. Have fun~
            y++;
        }

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}