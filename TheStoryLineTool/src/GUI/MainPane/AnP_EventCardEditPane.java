package GUI.MainPane;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-26-17.08
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class AnP_EventCardEditPane {

    public AnchorPane getEventCardEditPane(){
        TextField event = new TextField("Event");
        TextArea note = new TextArea("Note");
        TextArea comment = new TextArea("Comment");

        VBox vBox = new VBox(event, note, comment);
        AnchorPane anchorPane = new AnchorPane(vBox);
        anchorPane.setPrefWidth(800);
        anchorPane.setPrefHeight(800);
        return anchorPane;
    }
}
