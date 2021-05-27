package GUI.EventTree;

import func.eventCard.Func_EventCard;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

import java.util.Date;


/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-27-12.24
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Anp_ListView {
    public AnchorPane getListView(){

        ObservableList<String> eventCardList = new Func_EventCard().getEventCardList();
        ListView<String> stringListView = new ListView<>(eventCardList);
        stringListView.setPlaceholder(new Label("Event Card List"));
        stringListView.setPrefHeight(630);
        stringListView.setPrefWidth(200);
        stringListView.setOpacity(0.5);
        stringListView.setStyle("-fx-text-fill: blue;" +
                "-fx-font-size: 16;" +
                "-fx-font-weight: bold" );

        Button button_New = new Button("+");
        button_New.setOnMouseClicked(event -> new Func_EventCard().createEventCard("fei", new Date()));
        button_New.setAlignment(Pos.CENTER_RIGHT);
        button_New.setPrefHeight(25);
        button_New.setPrefWidth(25);

        Button button_remove = new Button("-");
        button_remove.setPrefHeight(25);
        button_remove.setPrefWidth(25);
        button_remove.setAlignment(Pos.CENTER_RIGHT);


        ButtonBar buttonBar = new ButtonBar();
        buttonBar.getButtons().addAll(button_New,button_remove);
        buttonBar.setPrefWidth(200);
        buttonBar.setStyle("-fx-background-color: lightgray");


        VBox vBox = new VBox();
        vBox.getChildren().addAll(stringListView,buttonBar);
        AnchorPane anchorPane = new AnchorPane(vBox);
        return anchorPane;

    }
}
