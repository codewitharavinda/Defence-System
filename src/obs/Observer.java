package obs;

public interface Observer {
    public void areaClear(boolean AreaClear);
    public void getMsg(String Msg);
    public void setPosition(int Position);
    public void setPrvtMsg(String name, String msg);
}
