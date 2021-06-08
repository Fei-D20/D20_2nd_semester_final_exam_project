package com.GUI;


import com.Domain.eventcard.Dom_EventCard;
import com.Domain.story.Dom_EventList;
import com.Domain.user.Dom_LoginedUser;

import com.GUI.controlbar.GUI_ControlBar;
import com.GUI.eventcard.*;
import com.GUI.eventlist.GUI_EventList;
import com.GUI.eventmap.GUI_EventMap;
import com.GUI.eventmap.GUI_TimeLine;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.util.StringConverter;


/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-31-01.20
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class main_OnePage extends Application {
    Dom_EventCard selectedEventCard;

    @Override
    public void start(Stage primaryStage) throws Exception {

        // *************** Controller Bar ******************
        GUI_ControlBar GUIControlBar = new GUI_ControlBar();
        AnchorPane anP_ControlBar = GUIControlBar.showControlBar(primaryStage);

        // ****************************** Event List *****************************

        GUI_EventList gui_eventList = new GUI_EventList();
        AnchorPane anP_EventList = gui_eventList.showEventList();
        ListView<Dom_EventCard> lv_EventList = gui_eventList.getLv_EventList();

        // ************************ Event Card ******************************

        GUI_EventCard gui_eventCard = new GUI_EventCard();
        AnchorPane anP_EventCard = gui_eventCard.showEventCard();

        // ********************* Event Map **********************************

        GUI_EventMap gui_eventMap = new GUI_EventMap();
        AnchorPane anP_EventMap = gui_eventMap.showEventMap();

        // *********************** Time Line **************************

        GUI_TimeLine gui_timeLine = new GUI_TimeLine();
        AnchorPane anP_TimeLine = gui_timeLine.showTimeLine();


        // *********************** Root *********************

        BorderPane bp_Root = new BorderPane();
        bp_Root.setTop(anP_ControlBar);
        bp_Root.setCenter(anP_EventMap);
        bp_Root.setLeft(anP_EventList);
        bp_Root.setBottom(anP_TimeLine);
        bp_Root.setStyle("-fx-background-color: gray");
        bp_Root.setRight(anP_EventCard);

        BorderPane.setMargin(anP_EventCard, new Insets(1));
        BorderPane.setMargin(anP_ControlBar, new Insets(1));
        BorderPane.setMargin(anP_EventList, new Insets(1));
        BorderPane.setMargin(anP_EventMap, new Insets(1));
        BorderPane.setMargin(anP_TimeLine, new Insets(1));


        AnchorPane anp_Root = new AnchorPane();
        anp_Root.getChildren().add(bp_Root);
        anp_Root.setPadding(new Insets(5));
        AnchorPane.setTopAnchor(bp_Root, 0.0);
        AnchorPane.setLeftAnchor(bp_Root, 0.0);
        AnchorPane.setBottomAnchor(bp_Root, 0.0);
        AnchorPane.setRightAnchor(bp_Root, 0.0);

        Scene scene = new Scene(anp_Root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("The Story Line Tool");
        primaryStage.setHeight(800);
        primaryStage.setWidth(1000);
        primaryStage.show();

        // show the login window
        com.GUI.User.GUI_UserLogin.showLoginStage(primaryStage);
        // after here it should always use the changeListener:
//        Dom_User loginedUser = Dom_LoginedUser.getInstance();

        // ****************** Event List application ***********************
        lv_EventList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Dom_EventCard>() {
            @Override
            public void changed(ObservableValue<? extends Dom_EventCard> observable, Dom_EventCard oldValue, Dom_EventCard newValue) {
                lv_EventList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

                selectedEventCard = newValue;
                if (selectedEventCard != null) {
                    gui_eventCard.getGui_eventCardTitle().getLb_EventCardTitle().setText("Event Card : " + selectedEventCard.getEventName());
                    gui_eventCard.getGui_eventCardTitle().getTf_EventTitleEventName().setText(selectedEventCard.getEventName());
                    gui_eventCard.getGui_eventCardTitle().getTf_EventTitleAuthor().setText(selectedEventCard.getAuthorName());
                    gui_eventCard.getGui_eventCardTitle().getTf_EventTitleDate().setText(String.valueOf(selectedEventCard.getEditDate()));

                    /*
                     * right here remember to set the text for event and comment and note
                     * and remember to change the node of each three to text field for input.
                     */

                }
            }
        });
        lv_EventList.setCellFactory(TextFieldListCell.forListView(new StringConverter<Dom_EventCard>() {
            @Override
            public String toString(Dom_EventCard object) {
                String s = object.getEventName();
                return s;
            }

            @Override
            public Dom_EventCard fromString(String string) {
                Dom_EventCard selectedItem = lv_EventList.getSelectionModel().getSelectedItem();

                int selectedIndex = lv_EventList.getSelectionModel().getSelectedIndex();
                String eventNumber = String.valueOf(selectedIndex + 1);

                selectedItem.setEventName("Event " + eventNumber + " : " + string);
                return selectedItem;
            }
        }));


        // ***************** Event card application *************************
        // right here is the event card use the login user's name put on the author name testified



        // ********************* list view button **************************
        gui_eventList.getBu_EventList_Add().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Dom_EventCard newEventCard = new Dom_EventCard();
                System.out.println(newEventCard);
                System.out.println("the author name is : " + Dom_LoginedUser.getInstance().getUserName());
                newEventCard.setAuthorName(Dom_LoginedUser.getInstance().getUserName());
                newEventCard.setEventName("new Event");
                newEventCard.getDom_event().setQuickNote("some thing happening");
                newEventCard.getDom_note().setNoteText("What happened?");
                newEventCard.getDom_comment().setCommentAuthor("who are you");
                newEventCard.getDom_comment().setCommentText("what you want to say? ");
                System.out.println(newEventCard);

                System.out.println("the new event card :" + newEventCard.toString());
                Dom_EventList.getInstance().add(newEventCard);
                lv_EventList.getItems().add(newEventCard);

                lv_EventList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
                lv_EventList.getSelectionModel().clearSelection();
                lv_EventList.getSelectionModel().select(newEventCard);
                lv_EventList.scrollTo(lv_EventList.getSelectionModel().getSelectedIndex());
                lv_EventList.requestFocus();
            }
        });


        // ******************** listview drag *********************

        lv_EventList.setOnDragDetected(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                lv_EventList.startFullDrag();
            }
        });
        lv_EventList.setOnMouseDragOver(new EventHandler<MouseDragEvent>() {
            @Override
            public void handle(MouseDragEvent event) {
                System.out.println("over the listview");
            }
        });

        lv_EventList.setOnMouseDragExited(new EventHandler<MouseDragEvent>() {
            @Override
            public void handle(MouseDragEvent event) {

                Dom_EventCard selectedItem = lv_EventList.getSelectionModel().getSelectedItem();
                String eventName = selectedItem.getEventName();
                Button button = new Button(eventName);
                gui_eventMap.getTp_EventMap().getChildren().add(button);

            }
        });


    }
}
