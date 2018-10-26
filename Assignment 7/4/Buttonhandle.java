import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Buttonhandle {
    @FXML private Button secondButton;
    public void handleButtonAction(ActionEvent event) { // button
        System.out.println("aaaa"); // text on button
    }

    public void betterButtonAction(ActionEvent actionEvent) {

        Stage stage = (Stage)secondButton.getScene().getWindow(); // show button
        stage.close();
    }
}