import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ButtonHandler {
    @FXML private Button secondButton;
    public void handleButtonAction(ActionEvent event) {
        System.out.println("aaaa"); // output on terminal
    }

    public void betterButtonAction(ActionEvent actionEvent) {

        Stage stage = (Stage)secondButton.getScene().getWindow();
        stage.close();
    }
}