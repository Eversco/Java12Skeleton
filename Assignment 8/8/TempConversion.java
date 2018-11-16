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

public class TempConversion extends Application {

    @FXML
    private TextField firstField; // import identification from fxml

    @FXML
    private TextField secondField;

    @FXML
    public void initialize() {
        firstField.textProperty().addListener(new ChangeListener<String>() { // adds whenever the observalble value
                                                                             // which is the field.
            @Override
            public void changed(ObservableValue<? extends String> observable, // giving secondField new value which is
                                                                              // observed from firstfield textproperty
                    String oldValue, String newValue) {
                try {
                    double x = Double.valueOf(newValue);
                    double y = (x * (9d/5d)) + 32d;
                    secondField.setText(String.valueOf(y));
                } catch (Exception e) {
                    secondField.setText("Invalid Input");
                }
            }
        });
        secondField.setEditable(false); // unable the function to edit in secondField
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = TempConversion.class.getResource("Main.fxml"); // import

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