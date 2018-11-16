/**
 * PercentFat
 */
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

public class PercentFat extends Application{

    @FXML
    private TextField firstField; // import identification from fxml

    @FXML
    private TextField secondField;

    @FXML
    private TextField thirdField;

    public void actionButton(ActionEvent event){ //button
        String newO = firstField.getText(); // putting value of textfield into variable
        String newT = secondField.getText();
        try{ //calculation and extract errors
            double x = Double.valueOf(newO);
            double z = Double.valueOf(newT);
            double y = ((x * 9d) / z) / 100d;
            thirdField.setText(String.valueOf(y) + "%");
        } catch (Exception e) {
            thirdField.setText("Invalid Input");
        }
    thirdField.setEditable(false); 
}




    @Override
    public void start(Stage primaryStage) throws Exception {
        URL fxmlURL = PercentFat.class.getResource("Main.fxml"); // import

        primaryStage.setTitle("PercentFat");
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
} // percent = ((fatgrams * 9.0) ? cal) * 100d;