package application.opration.create;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;


/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-29-17.02
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Create_New implements EventHandler {

    @Override
    public void handle(Event event) {
        if (event.getSource() instanceof Button) {
            Button source = (Button) event.getSource();
            System.out.println(source.getText());
            if(source.getText() == "+"){
                System.out.println("create new event card");
            } else if( source.getText() == "-"){
                System.out.println("remove the event card");
            }
        }
    }
}
