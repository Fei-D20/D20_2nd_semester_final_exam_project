package GUI.EventCard;


import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import sun.font.Decoration;

import java.util.Date;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-28-00.15
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Node_EventTitle {
    public Node showEventCardTitle(){

        Label lb_eventCard = new Label("Event Card : ");
        lb_eventCard.setStyle("-fx-font-weight: bold;" +
                "-fx-font-size: 16;");

        Label lb_eventNumber = new Label("Event Number : ");
        Label lb_eventNumberValue = new Label("/* the number");
        Label lb_Author = new Label("Author : ");
        Label lb_AuthorValue = new Label(" /* name");
        Label lb_date = new Label("Date : ");
        Label lb_dateValue = new Label(" /* write date");

        TilePane tp_EventCard = new TilePane();
        tp_EventCard.getChildren().addAll(
                lb_Author,
                lb_AuthorValue,
                lb_date,
                lb_dateValue,
                lb_eventNumber,
                lb_eventNumberValue
        );
        tp_EventCard.setStyle("-fx-background-color: lightgray");
        tp_EventCard.setPrefTileHeight(20);
        tp_EventCard.setPrefTileWidth(120);


        VBox vBox = new VBox();
        vBox.getChildren().addAll(lb_eventCard,tp_EventCard);
        return vBox;

    }
}
