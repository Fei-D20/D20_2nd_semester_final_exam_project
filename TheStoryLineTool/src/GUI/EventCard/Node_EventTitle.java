package GUI.EventCard;


import application.opration.mouse.Opr_Editable_DoubleClick;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
        lb_eventCard.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 16;");

        Label lb_eventNumber = new Label("Event Number : ");

        TextField tf_EventNumber = new TextField("event number");
        tf_EventNumber.setOnMouseClicked(new Opr_Editable_DoubleClick());
        tf_EventNumber.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 10;");

        Label lb_Author = new Label("Author : ");
        TextField tf_Author = new TextField("author");
        tf_Author.setOnMouseClicked(new Opr_Editable_DoubleClick());
        tf_Author.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 10;");

        Label lb_date = new Label("Date : ");
        TextField tf_date = new TextField("date");
        tf_date.setOnMouseClicked(new Opr_Editable_DoubleClick());
        tf_date.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 10;");


        TilePane tp_EventCard = new TilePane();
        tp_EventCard.getChildren().addAll(
                lb_Author,
                tf_Author,
                lb_date,
                tf_date,
                lb_eventNumber,
                tf_EventNumber
        );
        tp_EventCard.setStyle("-fx-background-color: lightgray");
        tp_EventCard.setPrefTileHeight(20);
        tp_EventCard.setPrefTileWidth(120);


        VBox vBox = new VBox();
        vBox.getChildren().addAll(lb_eventCard,tp_EventCard);
        return vBox;

    }
}
