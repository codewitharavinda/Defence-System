package defence;

import controller.ControlRoom;
import view.Helicopter;
import view.MainController;
import view.Submarine;
import view.Tank;

public class Demo {

    public static void main(String[] args){
    ControlRoom controlRoom=new ControlRoom();
    controlRoom.addObserver(new MainController(controlRoom));
    controlRoom.addObserver(new Helicopter(controlRoom));
    controlRoom.addObserver(new Tank(controlRoom));
    controlRoom.addObserver(new Submarine(controlRoom));
    }
    
}
