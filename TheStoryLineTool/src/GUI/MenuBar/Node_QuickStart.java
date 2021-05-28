package GUI.MenuBar;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.layout.HBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-28-14.59
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Node_QuickStart {
    public Node showQuickStart(){
        Button bu_New = new Button("+");
        Button bu_Delete = new Button("-");

        // here is the quick start icon
        ButtonBar bB_quickStart = new ButtonBar();
        bB_quickStart.getButtons().addAll(bu_New,bu_Delete);
        return bB_quickStart;
    }
}
