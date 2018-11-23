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

public class DistanceConverter extends Application{

    @FXML
    private TextField firstField; // import identification from fxml

    @FXML
    private TextField secondField; // import identification

    @FXML
    private TextField third; // import identification

    @FXML
    public void CmIn (ActionEvent event){ // calculation button
                try {
                    double x = Double.valueOf(firstField.getText()); // turns value of firstfield into double
                    double y = x * 2.54; // calculate
                    third.setText(String.valueOf(y)); // giving thirdfield the final answer
                } catch (Exception e) {
                    third.setText("Invalid Input"); // any errors would print this out
                }
            }
    @FXML
    public void InCm(ActionEvent event){ // the same for the rest
                try{
                    double x = Double.valueOf(firstField.getText());
                    double y = x / 2.54;
                third.setText(String.valueOf(y));
                } catch (Exception e) {
                    third.setText("Invalid Input");
        }
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        URL fxmlURL = DistanceConverter.class.getResource("Main.fxml"); // import

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