package GUI.MainPane;

import application.controller.eventcard.Controller_addEventCard;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-25-22.44
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class AnP_MenuBar {
    MenuBar menuBar_Menu = new MenuBar();
    MenuItem menuItem_New = new MenuItem("New");
    MenuItem menuItem_Delete = new MenuItem("Delete");
    Button button_New = new Button("+");
    Button button_Delete = new Button("-");

    public AnchorPane getMenuBar(){

        // This is the menu bar with the list of menu
        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");
        Menu view = new Menu("View");
        Menu help = new Menu("Help");
        menuBar_Menu.getMenus().addAll(file,edit,view,help);

        file.getItems().addAll(menuItem_New,menuItem_Delete);

        // here is the quick start icon
        HBox hBox_QuickStart = new HBox(button_New, button_Delete);

        // here add the menubar and quickstart on a vbox and set the gap of each of them
        VBox vBoxControlArea = new VBox(menuBar_Menu,hBox_QuickStart);
        vBoxControlArea.setSpacing(3);

        // add the vbox of control area on the anchorPane for let it fit with the scene
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.getChildren().add(vBoxControlArea);
        anchorPane.setPrefHeight(60);
        anchorPane.setStyle("-fx-background-color: lightgray;");
        AnchorPane.setTopAnchor(vBoxControlArea,0.0);
        AnchorPane.setLeftAnchor(vBoxControlArea,0.0);
        AnchorPane.setRightAnchor(vBoxControlArea,0.0);
        AnchorPane.setBottomAnchor(vBoxControlArea,0.0);

        // before here is all for the top side of borderPane
        return anchorPane;
    }
}
