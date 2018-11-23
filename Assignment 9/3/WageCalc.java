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

public class WageCalc extends Application{

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
    double Final = x * y;
    third.setText(String.valueOf(Final));
}

@Override
public void start(Stage primaryStage) throws Exception {

    URL fxmlURL = WageCalc.class.getResource("Main.fxml"); // import

    primaryStage.setTitle("Test Text Field X 2");
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