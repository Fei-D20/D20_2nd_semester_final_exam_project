package application.opration;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

/**
 * @ author Andrej Simionenko, Raheela Tasneem, Fei Gu, Ibraheem Swaidan
 * @ create 2021-05-28-16.27
 * @ grade CS20_EASV_SØNDERBORG
 * @ Description This is the EASV D20 2nd semester final exam project
 * @ Supervisors Karsten Skov, Tommy Haugaard, Frank Østergaard Hansen
 * @ Version 0.1
 */
public class application_exsample implements EventHandler {
    @Override
    public void handle(Event event) {
            if (event.getSource() instanceof Button) { // 保证事件源是 button 的实例
                Button source = (Button) event.getSource(); // 强转事件源到目标类型
                System.out.println(source.getText()); // 执行操作
                //例如
                if(source.getText() == "+"){
                    System.out.println("create new event card");
                } else if( source.getText() == "-"){
                    System.out.println("remove the event card");
                }
            }
    }

    /*
     * 如何调用使用监听或者事件来进行操作:
     * 1. 给方法类 实现事件或监听
     * 2. 实现方法
     * 3. 在实现的方法里判断时间的来源 :
         *      if(event.getSource() instanceof Object){
         *          Object obj = (Object) event.getSource();
         *          source.getText();// 获取事件源的名字
         *      }
         *  // 可以通过事件源的名字 switch case 来判断要执行的操作
         *  // 如果一个事件对应一个操作, 可以多个来源, 则不需要这样而直接执行
         *  // 如果是多个来源对应多个操作, 则需要确定来源.
     * 4. 在事件源上调用监听或事件 : obj.setOnAction(new FunctionClass());
     */
}
