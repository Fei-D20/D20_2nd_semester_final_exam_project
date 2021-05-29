package GUI.EventCard;

import application.opration.edit.Edit_InputLimit;
import application.opration.mouse.Opr_Editable_DoubleClick;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-28-13.02
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Node_EventNote {

    public Node showNote(){

            TextArea ta_noteValue = new TextArea();

            ta_noteValue.setPrefHeight(250);
            ta_noteValue.setWrapText(true);
            ta_noteValue.setEditable(false);
            ta_noteValue.setOnMouseClicked(new Opr_Editable_DoubleClick());
            ta_noteValue.textProperty().addListener(new Edit_InputLimit(2000,ta_noteValue));

            ta_noteValue.setPromptText("Please input in 2000 word");


            VBox vBox = new VBox(10);
            vBox.getChildren().addAll(ta_noteValue);
            vBox.setStyle("-fx-background-color: lightgray");


            return vBox;
    }

}
