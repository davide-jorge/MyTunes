package dk.easv.mytunes;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MyTunesController {
    @FXML
    private Label btnAction;

    @FXML
    protected void onPlayButtonClick() {
        btnAction.setText("The selected tune is playing");
    }

    @FXML
    protected void onPauseButtonClick() { btnAction.setText("The selected tune is paused"); }

    @FXML
    protected void onStopButtonClick() { btnAction.setText("The selected tune has stopped"); }
}