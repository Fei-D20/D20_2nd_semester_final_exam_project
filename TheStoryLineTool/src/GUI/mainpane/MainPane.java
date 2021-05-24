package GUI.mainpane;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;




/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-24-14.46
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class MainPane {
    public Pane getMainPane(){

        Button file = new Button("File");
        Button edit = new Button("Edit");


        Group group = new Group();

        group.getChildren().addAll(file,edit);

        Object[] buttons = group.getChildren().toArray();
        int setPosition = 100;
        for (Object o : buttons) {
            Button button = (Button) o;
            button.setPrefWidth(200);
            button.setPrefHeight(200);
        }


        ButtonBar buttonBar = new ButtonBar();
        buttonBar.setStyle("-fx-background-color: lightGray");
        buttonBar.getButtons().add(group);

        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().addAll(buttonBar);
        AnchorPane.setTopAnchor(buttonBar,0.0);
        return anchorPane;
    }
}
