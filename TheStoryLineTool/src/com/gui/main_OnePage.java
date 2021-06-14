package com.gui;


import com.application.control.dragNdrop.App_Dra_EventListDragDetected;
import com.application.control.dragNdrop.App_Dra_EventMapDragDropped;
import com.application.control.dragNdrop.App_Dra_EventMapDragOver;
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

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.TextFieldListCell;
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
        lv_EventList.getSelectionModel().selectedItemProperty().addListener(new App_Opr_EventList(lv_EventList,gui_eventCard,gui_view));
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

        // ********************* list view button **************************
        gui_eventList.getBu_EventList_Add().setOnAction(new App_Opr_CreateNewEventCard(lv_EventList));
        gui_eventList.getBu_EventList_Delete().setOnAction(new App_Opr_DeleteEventCard(lv_EventList));

        // ******************** Drag and Drop *********************
        lv_EventList.setOnDragDetected(new App_Dra_EventListDragDetected(anP_EventMap,lv_EventList));
        anP_EventMap.setOnDragDropped(new App_Dra_EventMapDragDropped(lv_EventList,gui_eventMap));
        anP_EventMap.setOnDragOver(new App_Dra_EventMapDragOver());
    }
}
