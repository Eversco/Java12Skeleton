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

public class ArithmeticCalc extends Application {

    @FXML
    private TextField firstField; // import identification from fxml

    @FXML
    private TextField secondField; // import identification

    @FXML
    private TextField third; // import identification

    @FXML
    public void Add (ActionEvent event){ // calculation button
                try {
                    double x = Double.valueOf(firstField.getText()); // turns value of firstfield into double
                    double z = Double.valueOf(secondField.getText());
                    double y = x + z; // calculate
                    third.setText(String.valueOf(y)); // giving thirdfield the final answer
                } catch (Exception e) {
                    third.setText("Invalid Input"); // any errors would print this out
                }
            }
    @FXML
    public void Sub (ActionEvent event){ // the same for the rest
                try{
                    double x = Double.valueOf(firstField.getText());
                    double z = Double.valueOf(secondField.getText());
                    double y = x - z;
                third.setText(String.valueOf(y));
                } catch (Exception e) {
                    third.setText("Invalid Input");
        }
        }
    @FXML
    public void Div (ActionEvent event){ // clear them all button
        try {
            double x = Double.valueOf(firstField.getText());
            double z = Double.valueOf(secondField.getText());
            double y = x / z;
        if (z == 0d){
            throw new ArithmeticException(); // the exception in arithmetic activate when z = 0
        }
        third.setText(String.valueOf(y));
        } catch (ArithmeticException e){ // see if its being divided by 0
            third.setText("Cannot be divided by 0");
        } catch (Exception e) { // other errors.
            third.setText("Invalid Input");
        }
    }
    @FXML
    public void Mult (ActionEvent event){
        try {
            double x = Double.valueOf(firstField.getText());
            double z = Double.valueOf(secondField.getText());
            double y = x * z;
        third.setText(String.valueOf(y));
        } catch (Exception e){
            third.setText("Invalid Input");
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        URL fxmlURL = ArithmeticCalc.class.getResource("Main.fxml"); // import

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