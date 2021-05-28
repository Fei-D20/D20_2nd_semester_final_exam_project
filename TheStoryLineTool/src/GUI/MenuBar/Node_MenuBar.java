package GUI.MenuBar;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-28-14.23
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Node_MenuBar {

    public Node showMenuBar(){
        // This is the menu bar with the list of menu
        MenuBar menuBar_MainMenu = new MenuBar();

        Menu menu_file = new Menu("File");
        Menu menu_edit = new Menu("Edit");
        Menu menu_view = new Menu("View");
        Menu menu_help = new Menu("Help");
        menuBar_MainMenu.getMenus().addAll(menu_file,menu_edit,menu_view,menu_help);

        MenuItem mI_New = new MenuItem("New");
        MenuItem mI_Delete = new MenuItem("Delete");
        menu_file.getItems().addAll(mI_New,mI_Delete);

        return menuBar_MainMenu;
    }
}
