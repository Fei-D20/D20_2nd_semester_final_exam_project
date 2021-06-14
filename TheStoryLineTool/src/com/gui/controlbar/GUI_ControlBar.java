package com.gui.controlbar;

import com.gui.user.GUI_UserLogin;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-07-21.30
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class GUI_ControlBar {
    public AnchorPane showControlBar(Stage primaryStage){
        Button bu_New = new Button("+");
        bu_New.setPrefWidth(5.0);
        bu_New.setPrefHeight(5.0);

        Button bu_Delete = new Button("-");


        // here is the quick start icon
        ButtonBar bb_quickStart = new ButtonBar();
        bb_quickStart.getButtons().addAll(bu_New, bu_Delete);
        ButtonBar.setButtonUniformSize(bu_New, true);

        MenuItem mi_New = new MenuItem("New");
        MenuItem mi_Delete = new MenuItem("Delete");
        MenuItem mi_newUserRegister = new MenuItem("New User Register");

        mi_newUserRegister.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                GUI_UserLogin gui_userLogin = new GUI_UserLogin();
                gui_userLogin.showLoginStage(primaryStage);
            }
        });

        Menu menu_file = new Menu("File");
        menu_file.getItems().addAll(mi_New, mi_Delete, mi_newUserRegister);

        Menu menu_edit = new Menu("Edit");
        Menu menu_view = new Menu("View");
        Menu menu_help = new Menu("Help");

        MenuBar mb_MainMenu = new MenuBar();
        mb_MainMenu.getMenus().addAll(menu_file, menu_edit, menu_view, menu_help);


        VBox vb_ControlBar = new VBox(mb_MainMenu);
        vb_ControlBar.setSpacing(3);

        AnchorPane anP_ControlBar = new AnchorPane();
        anP_ControlBar.getChildren().add(vb_ControlBar);
        anP_ControlBar.setPrefHeight(60);
        anP_ControlBar.setStyle("-fx-background-color: lightgray;");
        AnchorPane.setTopAnchor(vb_ControlBar, 0.0);
        AnchorPane.setLeftAnchor(vb_ControlBar, 0.0);
        AnchorPane.setRightAnchor(vb_ControlBar, 0.0);
        AnchorPane.setBottomAnchor(vb_ControlBar, 0.0);

        return anP_ControlBar;
    }
}
