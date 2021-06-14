package com.gui;


import com.application.opreation.eventcard.App_Opr_CreateNewEventCard;
import com.application.opreation.eventcard.App_Opr_DeleteEventCard;
import com.application.opreation.eventcard.App_Opr_ModifyText;
import com.application.opreation.story.App_Opr_EventList;
import com.application.opreation.story.App_Opr_View;
import com.domain.eventcard.Dom_EventCard;

import com.gui.user.GUI_UserLogin;
import com.gui.controlbar.GUI_ControlBar;
import com.gui.eventcard.*;
import com.gui.eventlist.GUI_EventList;
import com.gui.eventmap.GUI_EventMap;
import com.gui.eventmap.GUI_View;

import com.sun.javafx.scene.control.behavior.ListViewBehavior;
import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldListCell;
import javafx.scene.input.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.text.Text;


/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-31-01.20
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class main_OnePage extends Application {
    private Dragboard dragboard;
    private Label lb_EventMapEvent;


    @Override
    public void start(Stage primaryStage) {

        // *************** Controller Bar ******************
        GUI_ControlBar GUIControlBar = new GUI_ControlBar();
        AnchorPane anP_ControlBar = GUIControlBar.showControlBar(primaryStage);

        // ****************************** Event List *****************************

        GUI_EventList gui_eventList = new GUI_EventList();
        AnchorPane anP_EventList = gui_eventList.showEventList();
        ListView<Dom_EventCard> lv_EventList = gui_eventList.getLv_EventList();

        App_Opr_ModifyText app_opr_modifyText = new App_Opr_ModifyText();
        app_opr_modifyText.setLv_EventList(lv_EventList);

        // ************************ Event Card ******************************

        GUI_EventCard gui_eventCard = new GUI_EventCard();
        AnchorPane anP_EventCard = gui_eventCard.showEventCard();

        // ********************* Event Map **********************************

        GUI_EventMap gui_eventMap = new GUI_EventMap();
        AnchorPane anP_EventMap = gui_eventMap.showEventMap();

        // *********************** View **************************

        GUI_View gui_view = new GUI_View();
        AnchorPane anP_TimeLine = gui_view.showView();


        // *********************** Root *********************

        BorderPane bp_Root = new BorderPane();
        bp_Root.setTop(anP_ControlBar);
        bp_Root.setCenter(anP_EventMap);
        bp_Root.setLeft(anP_EventList);
        bp_Root.setBottom(anP_TimeLine);
        bp_Root.setRight(anP_EventCard);
        bp_Root.setStyle("-fx-background-color: gray");

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
        GUI_UserLogin.showLoginStage(primaryStage);



        // ****************** Event List application ***********************
        App_Opr_EventList app_opr_eventList = new App_Opr_EventList();
        app_opr_eventList.setLv_EventList(lv_EventList);
        app_opr_eventList.setGui_eventCard(gui_eventCard);
        app_opr_eventList.setGui_view(gui_view);

        lv_EventList.getSelectionModel().selectedItemProperty().addListener(app_opr_eventList);
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


        // ****************** View application ***********************
        gui_view.getBu_Export().setOnAction(new App_Opr_View());



        // ***************** Event card application *************************



        // ********************* list view button **************************
        App_Opr_CreateNewEventCard app_opr_createNewEventCard = new App_Opr_CreateNewEventCard();
        app_opr_createNewEventCard.setLv_EventList(lv_EventList);
        gui_eventList.getBu_EventList_Add().setOnAction(app_opr_createNewEventCard);

        App_Opr_DeleteEventCard app_opr_deleteEventCard = new App_Opr_DeleteEventCard();
        app_opr_deleteEventCard.setLv_EventList(lv_EventList);
        gui_eventList.getBu_EventList_Delete().setOnAction(app_opr_deleteEventCard);

        // ******************** listview drag *********************

        lv_EventList.setOnDragDetected(event ->  {
                dragboard = anP_EventMap.startDragAndDrop(TransferMode.ANY);
                dragboard.setDragView(new Text(lv_EventList.getSelectionModel().getSelectedItem().getEventName()).snapshot(null, null), event.getX(), event.getY());
                ClipboardContent cc = new ClipboardContent();
                cc.putString(lv_EventList.getSelectionModel().getSelectedItem().getEventName());
                dragboard.setContent(cc);
                lv_EventList.startFullDrag();
        });

        anP_EventMap.setOnDragDropped(new EventHandler<DragEvent>() {
            @Override
            public void handle(DragEvent event) {
                Dom_EventCard selectedItem = lv_EventList.getSelectionModel().getSelectedItem();

                lb_EventMapEvent = new Label();
                lb_EventMapEvent.setPrefWidth(150);
                lb_EventMapEvent.setText(selectedItem.getEventName());
                lb_EventMapEvent.setStyle("-fx-background-color: darkgreen;-fx-font-size: 14;-fx-text-fill: white;");

                TextArea ta_EventMapEvent = new TextArea();
                ta_EventMapEvent.setText(selectedItem.getDom_event().getQuickNote());
                ta_EventMapEvent.setWrapText(true);
                ta_EventMapEvent.setEditable(false);

                VBox vb_EventMapEvent = new VBox();
                vb_EventMapEvent.setPrefWidth(150);
                vb_EventMapEvent.setPrefHeight(130);
                vb_EventMapEvent.setStyle("-fx-background-color: lightgray;");
                vb_EventMapEvent.setPadding(new Insets(2));
                vb_EventMapEvent.getChildren().addAll(lb_EventMapEvent, ta_EventMapEvent);

                vb_EventMapEvent.setLayoutX(event.getSceneX() - 225);
                vb_EventMapEvent.setLayoutY(event.getSceneY() - 100);


                vb_EventMapEvent.setOnDragDetected(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        vb_EventMapEvent.startFullDrag();
                    }
                });

                vb_EventMapEvent.setOnMouseDragged(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent event) {
                        vb_EventMapEvent.setLayoutX(event.getSceneX() - 225);
                        vb_EventMapEvent.setLayoutY(event.getSceneY() - 100);
                    }
                });

                gui_eventMap.getPane_EventMap().getChildren().add(vb_EventMapEvent);
            }
        });

        anP_EventMap.setOnDragOver(event -> {
            event.acceptTransferModes(TransferMode.MOVE);
            System.out.println("over the Event Map!");
        });
    }
}
