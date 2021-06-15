package com.gui;


import com.application.control.dragNdrop.App_Dra_EventListDragDetected;
import com.application.control.dragNdrop.App_Dra_EventMapDragDropped;
import com.application.control.dragNdrop.App_Dra_EventMapDragOver;
import com.application.opreation.eventcard.App_Opr_CreateNewEventCard;
import com.application.opreation.eventcard.App_Opr_DeleteEventCard;
import com.application.opreation.eventcard.App_Opr_ModifyText;
import com.application.opreation.story.App_Converter_EventList;
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


/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-31-01.20
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Main extends Application {

    /**
     * this is the mean entry for this application.
     * @param primaryStage this is the mean window.
     */
    @Override
    public void start(Stage primaryStage) {

        // ************************** Controller Bar *****************************
        /*
         * the controller bar showing the control buttons here.
         */

        GUI_ControlBar GUIControlBar = new GUI_ControlBar();
        AnchorPane anP_ControlBar = GUIControlBar.showControlBar(primaryStage);

        // *************************** Event List ********************************
        /*
         * this is the event list localed on left side of window
         */

        GUI_EventList gui_eventList = new GUI_EventList();
        AnchorPane anP_EventList = gui_eventList.showEventList();

        /*
         * take the list from the gui list. so later can be use for operation.
         */

        ListView<Dom_EventCard> lv_EventList = gui_eventList.getLv_EventList();

        /*
         * here set up the list into modify application. in case no nullPointerException.
         */

        App_Opr_ModifyText app_opr_modifyText = new App_Opr_ModifyText();
        app_opr_modifyText.setLv_EventList(lv_EventList);


        // ******************************* Event Card ******************************
        /*
         * here is the event edit panel at right side of the window
         */

        GUI_EventCard gui_eventCard = new GUI_EventCard();
        AnchorPane anP_EventCard = gui_eventCard.showEventCard();

        // ******************************** Event Map **********************************
        /*
         * here is the show the event on the middle of the window
         */

        GUI_EventMap gui_eventMap = new GUI_EventMap();
        AnchorPane anP_EventMap = gui_eventMap.showEventMap();



        // *********************************   View    **********************************
        /*
         * here is the output view under the window
         */

        GUI_View gui_view = new GUI_View();
        AnchorPane anP_TimeLine = gui_view.showView();


        // *********************************    Root   *********************************
        /*
         * this is the setting about root and put every thing on the scene and stage.
         */

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


        /*
         * here is the mean scene and primary stage setting.
         */
        Scene scene = new Scene(anp_Root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("The Story Line Tool");
        primaryStage.setHeight(800);
        primaryStage.setWidth(1000);
        primaryStage.show();


        /*
          * after the mean window showing up, the application will show the login window to let the user login.
         */
        GUI_UserLogin gui_userLogin = new GUI_UserLogin();
        gui_userLogin.showLoginStage(primaryStage);



        // ****************** Event List application ***********************
        /*
         * here will let the event list get the selected and listen it change.
         */
        lv_EventList.getSelectionModel().selectedItemProperty().addListener(new App_Opr_EventList(lv_EventList,gui_eventCard,gui_view,gui_eventMap));
        lv_EventList.setCellFactory(TextFieldListCell.forListView(new App_Converter_EventList(lv_EventList)));


        // ********************* list view button **************************
        /*
         * here is the action when the button add and delete be pressed.
         */
        gui_eventList.getBu_EventList_Add().setOnAction(new App_Opr_CreateNewEventCard(lv_EventList));
        gui_eventList.getBu_EventList_Delete().setOnAction(new App_Opr_DeleteEventCard(lv_EventList));


        // ******************** Drag and Drop *********************
        /*
         * here is the drag happened on event list
         */
        lv_EventList.setOnDragDetected(new App_Dra_EventListDragDetected(anP_EventMap,lv_EventList));

        /*
         * here is the action about when the mouse drop the selected object on the event map
         */
        anP_EventMap.setOnDragDropped(new App_Dra_EventMapDragDropped(lv_EventList,gui_eventMap));
        anP_EventMap.setOnDragOver(new App_Dra_EventMapDragOver());

        // ****************** View application ***********************
        /*
         * here is the button of export
         */
        gui_view.getBu_Export().setOnAction(new App_Opr_View());
    }
}
