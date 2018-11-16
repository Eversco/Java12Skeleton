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
    private TextField third;

    @FXML
    public void cFar (ActionEvent event){ // calculation button
                try {
                    double x = Double.valueOf(firstField.getText());
                    double y = (x * (9d/5d)) + 32d;
                    third.setText(String.valueOf(y));
                } catch (Exception e) {
                    third.setText("Invalid Input");
                }
            }
    @FXML
    public void fcel (ActionEvent event){
        try{
            double x = Double.valueOf(firstField.getText());
            double y = (x - 36d) * 5d / 9d;
            third.setText(String.valueOf(y));
        } catch (Exception e) {
            third.setText("Invalid Input");
        }
        }
    @FXML
    public void action (ActionEvent event){ // clear them all button
        firstField.clear();
        third.clear();
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