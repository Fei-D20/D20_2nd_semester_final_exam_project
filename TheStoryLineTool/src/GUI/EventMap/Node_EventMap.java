package GUI.EventMap;

import javafx.scene.Node;
import javafx.scene.canvas.Canvas;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-28-15.18
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Node_EventMap {
    public Node showEventMap(){
        Canvas can_EventMap = new Canvas();
        can_EventMap.setStyle("-fx-background-color: white");

        return can_EventMap;
    }
}
