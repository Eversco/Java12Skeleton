import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.beans.value.*;

public class MyCalc extends Application {
    @FXML
    private TextField firstField; // import identity

    @FXML
    private TextField secondField;

    @FXML
    private TextField third;
    
    @FXML
    public void Hours(ActionEvent event){ // set fields into variable and do calculation and convert back to string and put into  third field
    double x = Double.valueOf(firstField.getText());
    double y = Double.valueOf(secondField.getText());
    double z = y * y;
    double Final = x * z;
    third.setText(String.valueOf(Final));
}


    @Override
    public void start(Stage primaryStage) throws Exception {

        URL fxmlURL = MyCalc.class.getResource("Main.fxml"); // import

        primaryStage.setTitle("E = MC^2 Calculator");
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