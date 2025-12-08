package com.example.tab_include;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TabPane;

public class HelloController {

    @FXML
    private TabPane tabPane;

    public void onNext(ActionEvent actionEvent) {
        tabPane.getSelectionModel().selectNext();
    }
    
    public void onBack(ActionEvent actionEvent) {
        tabPane.getSelectionModel().selectPrevious();
    }


}
