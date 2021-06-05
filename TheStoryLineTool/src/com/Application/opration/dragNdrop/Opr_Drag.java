package com.Application.opration.dragNdrop;

import javafx.event.EventHandler;
import javafx.event.EventTarget;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-06-05-13.43
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class Opr_Drag {
    public static void Drag(Node node){
        node.setOnDragDetected(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                node.startFullDrag();
                System.out.println("get drag ");
            }
        });

        node.setOnMouseDragOver(new EventHandler<MouseDragEvent>() {
            @Override
            public void handle(MouseDragEvent event) {
                // get the mouse location
                // put into testbutton layout
                System.out.println("dragover");
            }
        });

        node.setOnMouseDragExited(new EventHandler<MouseDragEvent>() {

            @Override
            public void handle(MouseDragEvent event) {
                System.out.println("grag out");
            }
        });

        node.setOnMouseDragEntered(new EventHandler<MouseDragEvent>() {
            @Override
            public void handle(MouseDragEvent event) {
                System.out.println("grag in ");
            }
        });

        node.setOnMouseDragReleased(new EventHandler<MouseDragEvent>() {
            @Override
            public void handle(MouseDragEvent event) {
                System.out.println("the source is : " + event.getSource().toString()); // what you are grag on
                System.out.println("the target is : " + event.getTarget()); // what you will release the source
                System.out.println("the gestrue : " + event.getGestureSource()); // where you take the source

                EventTarget target = event.getTarget();
                Object gestureSource = event.getGestureSource();
                if(gestureSource instanceof Pane){
                    if(target instanceof Pane){
                        ((Pane) target).getChildren().add((Pane)gestureSource);
                    }
                }

            }
        });

    }
}
