package com.gui.eventcard;

import com.application.control.mouse.Con_Editable_DoubleClick;
import com.application.opreation.eventcard.App_Opr_ModifyText;
import com.domain.eventcard.Dom_EventCard;
import com.function.eventCard.Func_EventCard;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;

import java.time.LocalDate;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-08-08.53
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class GUI_EventCardTitle {

    private Label lb_EventCardTitle;
    private TextField tf_EventTitleEventName;
    private TextField tf_EventTitleAuthor;
    private TextField tf_EventTitleDate;

    public VBox showEventCard(){

        lb_EventCardTitle = new Label();
        lb_EventCardTitle.setText("Event Card : ");
        lb_EventCardTitle.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 16;");


        Label lb_EventTitleEventName = new Label("Event Name : ");
        tf_EventTitleEventName = new TextField();
        tf_EventTitleEventName.setOnMouseClicked(new Con_Editable_DoubleClick());
        tf_EventTitleEventName.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 10;");
        tf_EventTitleEventName.textProperty().addListener(new App_Opr_ModifyText(){
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

                ListView<Dom_EventCard> lv_eventList = getLv_EventList();
                Dom_EventCard selectedItem = lv_eventList.getSelectionModel().getSelectedItem();
                selectedItem.setEventName(newValue);

                Func_EventCard func_eventCard = new Func_EventCard();
                func_eventCard.modify(selectedItem);

                lv_eventList.refresh();
            }
        });


        Label lb_EventTitleAuthor = new Label("Author : ");
        tf_EventTitleAuthor = new TextField();
        tf_EventTitleAuthor.setOnMouseClicked(new Con_Editable_DoubleClick());
        tf_EventTitleAuthor.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 10;");
        tf_EventTitleAuthor.textProperty().addListener(new App_Opr_ModifyText(){
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

                ListView<Dom_EventCard> lv_eventList = getLv_EventList();
                Dom_EventCard selectedItem = lv_eventList.getSelectionModel().getSelectedItem();
                selectedItem.setAuthorName(newValue);

                Func_EventCard func_eventCard = new Func_EventCard();
                func_eventCard.modify(selectedItem);

                lv_eventList.refresh();
            }
        });

        Label lb_EventTitleDate = new Label("Date : ");
        tf_EventTitleDate = new TextField();
        tf_EventTitleDate.setOnMouseClicked(new Con_Editable_DoubleClick());
        tf_EventTitleDate.setStyle("-fx-font-weight: bold;" + "-fx-font-size: 10;");
        tf_EventTitleDate.textProperty().addListener(new App_Opr_ModifyText(){
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

                ListView<Dom_EventCard> lv_eventList = getLv_EventList();
                Dom_EventCard selectedItem = lv_eventList.getSelectionModel().getSelectedItem();

                try {
                    selectedItem.setLocalDate(LocalDate.parse(newValue));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                Func_EventCard func_eventCard = new Func_EventCard();
                func_eventCard.modify(selectedItem);

                lv_eventList.refresh();
            }
        });


        TilePane tp_EventTitle = new TilePane();
        tp_EventTitle.getChildren().addAll(
                lb_EventTitleAuthor, tf_EventTitleAuthor,
                lb_EventTitleDate, tf_EventTitleDate,
                lb_EventTitleEventName, tf_EventTitleEventName);
        tp_EventTitle.setStyle("-fx-background-color: lightgray");
        tp_EventTitle.setPrefTileHeight(20);
        tp_EventTitle.setPrefTileWidth(120);

        VBox vb_EventTitle = new VBox(2);
        vb_EventTitle.getChildren().addAll(lb_EventCardTitle, tp_EventTitle);

        return vb_EventTitle;
    }

    public Label getLb_EventCardTitle() {
        return lb_EventCardTitle;
    }

    public void setLb_EventCardTitle(Label lb_EventCardTitle) {
        this.lb_EventCardTitle = lb_EventCardTitle;
    }

    public TextField getTf_EventTitleEventName() {
        return tf_EventTitleEventName;
    }

    public void setTf_EventTitleEventName(TextField tf_EventTitleEventName) {
        this.tf_EventTitleEventName = tf_EventTitleEventName;
    }

    public TextField getTf_EventTitleAuthor() {
        return tf_EventTitleAuthor;
    }

    public void setTf_EventTitleAuthor(TextField tf_EventTitleAuthor) {
        this.tf_EventTitleAuthor = tf_EventTitleAuthor;
    }

    public TextField getTf_EventTitleDate() {
        return tf_EventTitleDate;
    }

    public void setTf_EventTitleDate(TextField tf_EventTitleDate) {
        this.tf_EventTitleDate = tf_EventTitleDate;
    }
}
