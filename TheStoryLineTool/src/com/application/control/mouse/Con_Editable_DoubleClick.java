package com.application.control.mouse;


import javafx.event.EventHandler;
import javafx.scene.control.TextInputControl;
import javafx.scene.input.MouseEvent;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-29-15.57
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Con_Editable_DoubleClick implements EventHandler<MouseEvent> {
    @Override
    public void handle(MouseEvent event) {
        if(event.getClickCount() == 2){
            if(event.getSource() instanceof TextInputControl){
                TextInputControl source = (TextInputControl) event.getSource();
                source.setEditable(true);
            }
        } else {
            if(event.getSource() instanceof TextInputControl){
                TextInputControl source = (TextInputControl) event.getSource();
                source.setEditable(false);
            }
        }
    }
}
