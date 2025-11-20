package controller;
import obs.Observer;

public class ControlRoom {
    
    private final Observer[] observerArray=new Observer[50];
    private int nextIndex=0;
    
    public void setArea(boolean areaClear){
        for (int i = 0; i <nextIndex; i++) {
            Observer ob=observerArray[i];
            ob.areaClear(areaClear);
        }
    }
    
    public void addObserver(Observer obs){
        observerArray[nextIndex]=obs;
        nextIndex++;
    }
    
    public void sendMsg(String Msg){
        for (int i = 0; i < nextIndex; i++) {
            Observer ob=observerArray[i];
            ob.getMsg(Msg);
            
        }
        
    }
}
