package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainScreenController {

    @FXML
    private Button QuitBtn;

    @FXML
    private Text exit_btn;

    @FXML
    private Button Openlist_btn;

    @FXML
    private Button WineInven_btn;

    @FXML
    void CloseWindow(MouseEvent Event) {
        Stage stage = (Stage) QuitBtn.getScene().getWindow();
        stage.close();
    }

}
