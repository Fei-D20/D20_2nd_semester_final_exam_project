package GUI.MainPane;

import javafx.scene.canvas.Canvas;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-25-23.00
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class AnP_Canvas {
    /* This is the mean edit area for relationship. and after the user click one event card
     * then it will change to the single event card edit.
     */
    Canvas canvas_RelationArea = new Canvas();

    Canvas canvas_TimeLineArea = new Canvas();

    public AnchorPane getCanvas(){
        // set the tow canvas on the vbox
        VBox vBoxEditArea = new VBox(canvas_RelationArea,canvas_TimeLineArea);

        AnchorPane anchorPane = new AnchorPane(vBoxEditArea);
        // before here is all for the middle of borderPane
        return anchorPane;
    }
}
