package com.san.DesignPattern.命令模式;

public class DoorOffCommond implements Command {

    private Door door ;

    public DoorOffCommond( Door door)
    {
        this.door = door;
    }

    @Override
    public void execute()
    {
        door.close();
    }
}
